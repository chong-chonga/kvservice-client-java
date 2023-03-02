package github.com.hlx.kvservice.client;

import github.com.hlx.kvservice.exception.KVServiceExpection;
import github.com.hlx.kvservice.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Huang Lexin
 * @date 2023年03月02日 19:55
 */
public class FTKVServiceClient {

	private static Logger logger = Logger.getLogger(FTKVServiceClient.class.getName());

	private final KVServerGrpc.KVServerBlockingStub[] blockingStub;

	private String password;

	private final String[] serverAddresses;

	private boolean logEnabled;

	private int lastLeader;

	private String sessionId;

	private boolean sessionValid;

	public FTKVServiceClient(FTKVServiceClientConfig config) {
		String[] serverAddresses = config.getServerAddresses();
		this.blockingStub = new KVServerGrpc.KVServerBlockingStub[serverAddresses.length];
		for (int i = serverAddresses.length - 1; i >= 0; i--) {
			ManagedChannel channel = ManagedChannelBuilder.forTarget(serverAddresses[i])
					// Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
					// needing certificates.
					.usePlaintext()
					.build();
			this.blockingStub[i] = KVServerGrpc.newBlockingStub(channel);
		}
		this.password = config.getPassword();
		this.serverAddresses = serverAddresses;
		this.logEnabled = config.isLogEnabled();
		this.lastLeader = -1;
		this.openSession();
	}

	private int chooseServer() {
		if (this.lastLeader != -1) {
			return lastLeader;
		}
		return new Random().nextInt(this.blockingStub.length);
	}

	private void openSession() throws KVServiceExpection {
		int server = chooseServer();
		int serverCount = this.serverAddresses.length;
		OpenSessionRequest request = OpenSessionRequest.newBuilder()
				.setPassword(password)
				.setRequestType(RequestType.OPEN_SESSION)
				.build();
		for (int i = 0; i < serverCount; ++i) {
			String address = serverAddresses[server];
			logger.info("send openSession Request to " + address);
			try {
				OpenSessionReply reply = blockingStub[i].withDeadlineAfter(5, TimeUnit.SECONDS).openSession(request);
				if (reply.getErrCode() == ErrCode.INVALID_REQUEST_TYPE) {
					throw new KVServiceExpection("request type is wrong!");
				}
				if (reply.getErrCode() == ErrCode.WRONG_LEADER) {
					logger.info("request fail, " + address + " is not leader");
				} else {
					lastLeader = i;
					if (reply.getErrCode() == ErrCode.OK) {
						logger.info("openSession request success, sessionId=" + reply.getSessionId());
						return;
					} else {
						throw new KVServiceExpection("password is wrong!");
					}
				}
			} catch (StatusRuntimeException e) {
				logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			}
			server = (server + 1) % serverCount;
		}
	}



	//public String get(String key) throws KVServiceExpection {
	//	if (key == null) {
	//		throw new NullPointerException("key can not be null value!");
	//	}
	//}
	//
	//private void update(String key, String value, RequestType requestType) throws KVServiceExpection {
	//	UpdateRequest.Builder builder = UpdateRequest.newBuilder();
	//	builder.setSessionId(this.sessionId)
	//			.setKey(key)
	//			.setRequestType(requestType);
	//}
	//
	//public void put(String key, String value) throws KVServiceExpection {
	//	update(key, value, RequestType.PUT);
	//}
	//
	//public void append(String key, String value) throws KVServiceExpection {
	//	update(key, value, RequestType.APPEND);
	//}
	//
	//public void delete(String key) throws KVServiceExpection {
	//	update(key, null, RequestType.DELETE);
	//}

	public static void main(String[] args) {
		FTKVServiceClientConfig config = new FTKVServiceClientConfig(
				"123456",
				new String[]{"localhost:8080", "127.0.0.1:8081", "127.0.0.1:8082"},
				Duration.ofSeconds(3),
				false
		);
		FTKVServiceClient client = new FTKVServiceClient(config);

	}

}
