package github.com.hlx.kvservice.client;

import github.com.hlx.kvservice.exception.KVServiceStatusRuntimeException;
import github.com.hlx.kvservice.exception.KVServiceStatus;
import github.com.hlx.kvservice.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import java.time.Duration;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @author Huang Lexin
 * @date 2023年03月02日 19:55
 */
public class FTKVServiceClient {

	private static final Logger logger = Logger.getLogger(FTKVServiceClient.class.getName());

	private final KVServerGrpc.KVServerBlockingStub[] kvServerBlockingStubs;

	private final String password;

	private final String[] serverAddresses;

	private int lastLeader;

	private String sessionId;

	private boolean sessionValid;

	private final Random random = new Random();

	public FTKVServiceClient(FTKVServiceClientConfig config) throws IllegalArgumentException {
		String[] serverAddresses = config.getServerAddresses();
		if (null == serverAddresses || serverAddresses.length == 0) {
			throw new IllegalArgumentException("server addresses can not be empty!");
		}
		this.kvServerBlockingStubs = new KVServerGrpc.KVServerBlockingStub[serverAddresses.length];
		for (int i = serverAddresses.length - 1; i >= 0; i--) {
			ManagedChannel channel = ManagedChannelBuilder.forTarget(serverAddresses[i])
					// Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
					// needing certificates.
					.usePlaintext()
					.build();
			this.kvServerBlockingStubs[i] = KVServerGrpc.newBlockingStub(channel);
		}
		this.password = config.getPassword();
		this.serverAddresses = serverAddresses;
		this.lastLeader = -1;
	}

	private int chooseServer() {
		if (this.lastLeader != -1) {
			return lastLeader;
		}
		return random.nextInt(this.kvServerBlockingStubs.length);
	}

	private String callLeader(Object request, RequestType requestType) {
		int server = chooseServer();
		int serverCount = serverAddresses.length;
		Throwable cause = null;
		for (int i = 0; i < serverCount; ++i) {
			String address = serverAddresses[server];
			logger.info("send " + requestType.name() + " request to " + address);
			KVServerGrpc.KVServerBlockingStub stub = kvServerBlockingStubs[server].withDeadlineAfter(3, TimeUnit.SECONDS);
			ErrCode errCode = null;
			try {
				OpenSessionReply reply1;
				GetReply reply2;
				UpdateReply reply3;
				if (requestType == RequestType.OPEN_SESSION) {
					reply1 = stub.openSession((OpenSessionRequest) request);
					errCode = reply1.getErrCode();
					if (errCode == ErrCode.OK) {
						lastLeader = server;
						sessionId = reply1.getSessionId();
						sessionValid = true;
						return null;
					}
				} else if (requestType == RequestType.GET) {
					reply2 = stub.get((GetRequest) request);
					errCode = reply2.getErrCode();
					if (errCode == ErrCode.OK || errCode == ErrCode.NO_KEY) {
						lastLeader = server;
						if (ErrCode.NO_KEY == errCode) {
							return null;
						}
						return reply2.getValue();
					}
				} else {
					reply3 = stub.update((UpdateRequest) request);
					errCode = reply3.getErrCode();
					if (errCode == ErrCode.OK) {
						return null;
					}
				}

			} catch (ClassCastException e) {
				throw new IllegalStateException("request is not " + requestType.name() + " type!");
			} catch (StatusRuntimeException e) {
				Status status = e.getStatus();
				if (status.getCode() == Status.Code.DEADLINE_EXCEEDED && !e.getMessage().contains(
						"waiting_for_connection")) {
					throw new KVServiceStatusRuntimeException(KVServiceStatus.TIMEOUT.withDescription("request for " + address +
							" timeout").withCause(e));
				}
				cause = e;
			}

			if (errCode != null) {
				if (errCode == ErrCode.INVALID_REQUEST_TYPE) {
					throw new KVServiceStatusRuntimeException(
							KVServiceStatus.INVALID_ARGUMENT.withDescription("Current client's " + requestType.name() +
									" not match server's"));
				}
				if (errCode != ErrCode.WRONG_LEADER) {
					lastLeader = server;
					if (errCode == ErrCode.INVALID_SESSION) {
						sessionValid = false;
						throw new KVServiceStatusRuntimeException(KVServiceStatus.SESSION_EXPIRED);
					} else if (errCode == ErrCode.INVALID_PASSWORD) {
						throw new KVServiceStatusRuntimeException(KVServiceStatus.PASSWORD_WRONG.withDescription("the password provided is incorrect!"));
					}
				}
			}
			server = (server + 1) % serverCount;
		}

		throw new KVServiceStatusRuntimeException(KVServiceStatus.UNAVAILABLE.withDescription("unable to connect to " +
				"servers or no leader").withCause(cause));
	}


	private void openSession() {
		OpenSessionRequest request = OpenSessionRequest.newBuilder()
				.setPassword(password)
				.setRequestType(RequestType.OPEN_SESSION)
				.build();
		callLeader(request, RequestType.OPEN_SESSION);
		//Throwable cause = null;
		//for (int i = 0; i < serverCount; ++i) {
		//	String address = serverAddresses[server];
		//	logger.info("send openSession Request to " + address);
		//	OpenSessionReply reply = null;
		//	try {
		//		reply =
		//				kvServerBlockingStubs[server].withDeadlineAfter(3, TimeUnit.SECONDS).openSession(request);
		//	} catch (StatusRuntimeException e) {
		//		if (e.getStatus().getCode() == Status.Code.DEADLINE_EXCEEDED && !e.getMessage().contains("waiting_for_connection")) {
		//			throw new KVServiceStatusRuntimeException(KVServiceStatus.TIMEOUT.withDescription("request for " + address +
		//					" timeout").withCause(e));
		//		}
		//		cause = e;
		//	}
		//	if (reply != null) {
		//		ErrCode errorCode = reply.getErrCode();
		//		if (errorCode == ErrCode.INVALID_REQUEST_TYPE) {
		//			throw new KVServiceStatusRuntimeException(
		//					KVServiceStatus.INVALID_ARGUMENT.withDescription("Current client's " + request.getRequestType().name() + " not match server's"));
		//		}
		//		if (errorCode == ErrCode.WRONG_LEADER) {
		//			logger.info("request fail, " + address + " is not leader");
		//		} else {
		//			lastLeader = i;
		//			if (errorCode == ErrCode.OK) {
		//				logger.info("openSession request success, sessionId=" + reply.getSessionId());
		//				this.sessionValid = true;
		//				this.sessionId = reply.getSessionId();
		//				return;
		//			} else {
		//				throw new KVServiceStatusRuntimeException(KVServiceStatus.PASSWORD_WRONG.withDescription("the password provided is incorrect!"));
		//			}
		//		}
		//	}
		//	server = (server + 1) % serverCount;
		//}
		//
		//throw new KVServiceStatusRuntimeException(KVServiceStatus.UNAVAILABLE.withDescription("unable to connect to " +
		//		"servers or no leader").withCause(cause));
	}


	public String get(String key) throws KVServiceStatusRuntimeException {
		if (key == null) {
			throw new NullPointerException();
		}

		if (!sessionValid) {
			openSession();
		}


		GetRequest request = GetRequest.newBuilder()
				.setKey(key)
				.setRequestType(RequestType.GET)
				.setSessionId(sessionId).build();
		try {
			return callLeader(request, RequestType.GET);
		} catch (KVServiceStatusRuntimeException e) {
			if (e.getStatus() == KVServiceStatus.SESSION_EXPIRED) {
				openSession();
				request = GetRequest.newBuilder()
						.setKey(key)
						.setRequestType(RequestType.GET)
						.setSessionId(sessionId).
						build();
				return callLeader(request, RequestType.GET);
			}
			throw e;
		}

		//int server = chooseServer();
		//int serverCount = serverAddresses.length;
		//Throwable cause = null;
		//for (int i = 0; i < serverCount; ++i) {
		//	String address = serverAddresses[server];
		//	logger.info("send get Request to " + address);
		//	GetReply reply = null;
		//	try {
		//		reply = kvServerBlockingStubs[server].withDeadlineAfter(3, TimeUnit.SECONDS).get(request);
		//	} catch (StatusRuntimeException e) {
		//		Status status = e.getStatus();
		//		if (status.getCode() == Status.Code.DEADLINE_EXCEEDED && !e.getMessage().contains(
		//				"waiting_for_connection")) {
		//			throw new KVServiceStatusRuntimeException(KVServiceStatus.TIMEOUT.withDescription("request for " + address +
		//					" timeout").withCause(e));
		//		}
		//		cause = e;
		//	}
		//	if (reply != null) {
		//		ErrCode errCode = reply.getErrCode();
		//		if (errCode == ErrCode.INVALID_REQUEST_TYPE) {
		//			throw new KVServiceStatusRuntimeException(
		//					KVServiceStatus.INVALID_ARGUMENT.withDescription("Current client's " + request.getRequestType().name() + " not match server's"));
		//		}
		//		if (errCode != ErrCode.WRONG_LEADER) {
		//			lastLeader = server;
		//			if (errCode == ErrCode.INVALID_SESSION) {
		//				sessionValid = false;
		//				openSession();
		//				request = GetRequest.newBuilder()
		//						.setKey(key)
		//						.setRequestType(RequestType.GET)
		//						.setSessionId(sessionId)
		//						.build();
		//				i--;
		//				continue;
		//			}
		//			if (errCode == ErrCode.OK) {
		//				return reply.getValue();
		//			}
		//			return null;
		//		}
		//
		//	}
		//	server = (server + 1) % serverCount;
		//}
		//
		//throw new KVServiceStatusRuntimeException(KVServiceStatus.UNAVAILABLE.withDescription("unable to connect to " +
		//		"servers or no leader").withCause(cause));
	}

	private void update(String key, String value, RequestType requestType) throws KVServiceStatusRuntimeException {
		if (key == null || value == null) {
			throw new NullPointerException();
		}
		if (!sessionValid) {
			openSession();
		}
		UpdateRequest.Builder builder = UpdateRequest.newBuilder();
		UpdateRequest request = builder.setSessionId(this.sessionId)
				.setKey(key)
				.setValue(value)
				.setRequestType(requestType).build();


		try {
			callLeader(request, requestType);
		} catch (KVServiceStatusRuntimeException e) {
			if (e.getStatus() == KVServiceStatus.SESSION_EXPIRED) {
				openSession();
				request = UpdateRequest.newBuilder()
						.setKey(key)
						.setValue(value)
						.setRequestType(requestType)
						.setSessionId(sessionId).
						build();
				callLeader(request, requestType);
			} else {
				throw e;
			}
		}
		//int server = chooseServer();
		//int serverCount = serverAddresses.length;
		//Throwable cause = null;
		//for (int i = 0; i < serverCount; ++i) {
		//	String address = serverAddresses[i];
		//	logger.info("send " + requestType.name() + " request to " + address);
		//	UpdateReply reply = null;
		//	try {
		//		reply = kvServerBlockingStubs[server].withDeadlineAfter(3, TimeUnit.SECONDS).update(request);
		//	} catch (StatusRuntimeException e) {
		//		if (e.getStatus().getCode() == Status.Code.DEADLINE_EXCEEDED && !e.getMessage().contains("waiting_for_connection")) {
		//			throw new KVServiceStatusRuntimeException(KVServiceStatus.TIMEOUT.withDescription("request for " + address +
		//					" timeout").withCause(e));
		//		}
		//		cause = e;
		//	}
		//	if (reply != null) {
		//		ErrCode errCode = reply.getErrCode();
		//		if (errCode == ErrCode.INVALID_REQUEST_TYPE) {
		//			throw new KVServiceStatusRuntimeException(
		//					KVServiceStatus.INVALID_ARGUMENT.withDescription("Current client's " + request.getRequestType().name() + " not match server's"));
		//		}
		//		if (errCode != ErrCode.WRONG_LEADER) {
		//			lastLeader = server;
		//			if (errCode == ErrCode.INVALID_SESSION) {
		//				sessionValid = false;
		//				openSession();
		//				request = UpdateRequest.newBuilder()
		//						.setKey(key)
		//						.setValue(value)
		//						.setRequestType(requestType)
		//						.setSessionId(sessionId)
		//						.build();
		//				i--;
		//				continue;
		//			}
		//			if (errCode == ErrCode.OK) {
		//				return;
		//			}
		//		}
		//
		//	}
		//	server = (server + 1) % serverCount;
		//}
		//throw new KVServiceStatusRuntimeException(KVServiceStatus.UNAVAILABLE.withDescription("unable to connect to " +
		//		"servers or no leader").withCause(cause));
	}

	public void put(String key, String value) throws KVServiceStatusRuntimeException {
		update(key, value, RequestType.PUT);
	}

	public void append(String key, String value) throws KVServiceStatusRuntimeException {
		update(key, value, RequestType.APPEND);
	}

	public void delete(String key) throws KVServiceStatusRuntimeException {
		update(key, "", RequestType.DELETE);
	}

	public static void main(String[] args) {
		FTKVServiceClientConfig config = new FTKVServiceClientConfig(
				"123456",
				new String[]{"localhost:8080", "127.0.0.1:8081", "127.0.0.1:8082"},
				Duration.ofSeconds(3)
		);
		FTKVServiceClient client = new FTKVServiceClient(config);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("==========operation menu=========");
			System.out.println("1. get 2. put 3. append 4. delete");
			System.out.println("operation: ");
			int choice = scanner.nextInt();
			switch (choice) {
				case    1:
					System.out.println("enter the key: ");
					String key = scanner.next();
					String value = client.get(key);
					System.out.println("the value is " + value);
					break;
				case 2:
				case 3:
					System.out.println("enter the key&value: ");
					key = scanner.next();
					value = scanner.next();
					if (choice == 2) {
						client.put(key, value);
					}  else {
						client.append(key, value);
					}
					System.out.println("put/append success!");
					break;
				case 4:
					System.out.println("enter the key: ");
					key = scanner.next();
					client.delete(key);
					System.out.println("delete the key " + key + " success!");
					break;
				default:
					return;
			}
		}


	}

}
