package hlx.examples.helloworld;

import hlx.examples.helloworld.grpc.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @author Huang Lexin
 * @date 2023年03月02日 15:20
 */
public class HelloWorldServer {
	private static final Logger logger = Logger.getLogger(HelloWorldServer.class.getName());

	static class GreeterImpl extends GreeterGrpc.GreeterImplBase {
		@Override
		public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
			HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		}

		@Override
		public void openSession(OpenSessionRequest request, StreamObserver<OpenSessionReply> responseObserver) {
			String password = request.getPassword();
			OpenSessionReply.Builder builder = OpenSessionReply.newBuilder();

			if (!("123".equals(password))) {
				builder.setErrorCode(ErrorCode.INVALID_PASSWORD);
			} else {
				builder.setSessionId("1").setErrorCode(ErrorCode.OK);
			}
			responseObserver.onNext(builder.build());
			responseObserver.onCompleted();
		}
	}
	private Server server;

	private void start() throws IOException {
		/* The port on which the server should run */
		int port = 50051;
		server = ServerBuilder.forPort(port)
				.addService(new GreeterImpl())
				.build()
				.start();
		logger.info("Server started, listening on " + port);
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			// Use stderr here since the logger may have been reset by its JVM shutdown hook.
			System.err.println("*** shutting down gRPC server since JVM is shutting down");
			try {
				HelloWorldServer.this.stop();
			} catch (InterruptedException e) {
				e.printStackTrace(System.err);
			}
			System.err.println("*** server shut down");
		}));
	}

	private void stop() throws InterruptedException {
		if (server != null) {
			server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
		}
	}

	/**
	 * Await termination on the main thread since the grpc library uses daemon threads.
	 */
	private void blockUntilShutdown() throws InterruptedException {
		if (server != null) {
			server.awaitTermination();
		}
	}

	/**
	 * Main launches the server from the command line.
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		final HelloWorldServer server = new HelloWorldServer();
		server.start();
		server.blockUntilShutdown();
	}
}
