package github.com.hlx.kvservice.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: helloworld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KVServerGrpc {

  private KVServerGrpc() {}

  public static final String SERVICE_NAME = "KVServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<github.com.hlx.kvservice.grpc.OpenSessionRequest,
      github.com.hlx.kvservice.grpc.OpenSessionReply> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = github.com.hlx.kvservice.grpc.OpenSessionRequest.class,
      responseType = github.com.hlx.kvservice.grpc.OpenSessionReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<github.com.hlx.kvservice.grpc.OpenSessionRequest,
      github.com.hlx.kvservice.grpc.OpenSessionReply> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<github.com.hlx.kvservice.grpc.OpenSessionRequest, github.com.hlx.kvservice.grpc.OpenSessionReply> getOpenSessionMethod;
    if ((getOpenSessionMethod = KVServerGrpc.getOpenSessionMethod) == null) {
      synchronized (KVServerGrpc.class) {
        if ((getOpenSessionMethod = KVServerGrpc.getOpenSessionMethod) == null) {
          KVServerGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<github.com.hlx.kvservice.grpc.OpenSessionRequest, github.com.hlx.kvservice.grpc.OpenSessionReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  github.com.hlx.kvservice.grpc.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  github.com.hlx.kvservice.grpc.OpenSessionReply.getDefaultInstance()))
              .setSchemaDescriptor(new KVServerMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<github.com.hlx.kvservice.grpc.GetRequest,
      github.com.hlx.kvservice.grpc.GetReply> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = github.com.hlx.kvservice.grpc.GetRequest.class,
      responseType = github.com.hlx.kvservice.grpc.GetReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<github.com.hlx.kvservice.grpc.GetRequest,
      github.com.hlx.kvservice.grpc.GetReply> getGetMethod() {
    io.grpc.MethodDescriptor<github.com.hlx.kvservice.grpc.GetRequest, github.com.hlx.kvservice.grpc.GetReply> getGetMethod;
    if ((getGetMethod = KVServerGrpc.getGetMethod) == null) {
      synchronized (KVServerGrpc.class) {
        if ((getGetMethod = KVServerGrpc.getGetMethod) == null) {
          KVServerGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<github.com.hlx.kvservice.grpc.GetRequest, github.com.hlx.kvservice.grpc.GetReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  github.com.hlx.kvservice.grpc.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  github.com.hlx.kvservice.grpc.GetReply.getDefaultInstance()))
              .setSchemaDescriptor(new KVServerMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<github.com.hlx.kvservice.grpc.UpdateRequest,
      github.com.hlx.kvservice.grpc.UpdateReply> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = github.com.hlx.kvservice.grpc.UpdateRequest.class,
      responseType = github.com.hlx.kvservice.grpc.UpdateReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<github.com.hlx.kvservice.grpc.UpdateRequest,
      github.com.hlx.kvservice.grpc.UpdateReply> getUpdateMethod() {
    io.grpc.MethodDescriptor<github.com.hlx.kvservice.grpc.UpdateRequest, github.com.hlx.kvservice.grpc.UpdateReply> getUpdateMethod;
    if ((getUpdateMethod = KVServerGrpc.getUpdateMethod) == null) {
      synchronized (KVServerGrpc.class) {
        if ((getUpdateMethod = KVServerGrpc.getUpdateMethod) == null) {
          KVServerGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<github.com.hlx.kvservice.grpc.UpdateRequest, github.com.hlx.kvservice.grpc.UpdateReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  github.com.hlx.kvservice.grpc.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  github.com.hlx.kvservice.grpc.UpdateReply.getDefaultInstance()))
              .setSchemaDescriptor(new KVServerMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KVServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVServerStub>() {
        @java.lang.Override
        public KVServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVServerStub(channel, callOptions);
        }
      };
    return KVServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KVServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVServerBlockingStub>() {
        @java.lang.Override
        public KVServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVServerBlockingStub(channel, callOptions);
        }
      };
    return KVServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KVServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVServerFutureStub>() {
        @java.lang.Override
        public KVServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVServerFutureStub(channel, callOptions);
        }
      };
    return KVServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KVServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(github.com.hlx.kvservice.grpc.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<github.com.hlx.kvservice.grpc.OpenSessionReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void get(github.com.hlx.kvservice.grpc.GetRequest request,
        io.grpc.stub.StreamObserver<github.com.hlx.kvservice.grpc.GetReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void update(github.com.hlx.kvservice.grpc.UpdateRequest request,
        io.grpc.stub.StreamObserver<github.com.hlx.kvservice.grpc.UpdateReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                github.com.hlx.kvservice.grpc.OpenSessionRequest,
                github.com.hlx.kvservice.grpc.OpenSessionReply>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                github.com.hlx.kvservice.grpc.GetRequest,
                github.com.hlx.kvservice.grpc.GetReply>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                github.com.hlx.kvservice.grpc.UpdateRequest,
                github.com.hlx.kvservice.grpc.UpdateReply>(
                  this, METHODID_UPDATE)))
          .build();
    }
  }

  /**
   */
  public static final class KVServerStub extends io.grpc.stub.AbstractAsyncStub<KVServerStub> {
    private KVServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVServerStub(channel, callOptions);
    }

    /**
     */
    public void openSession(github.com.hlx.kvservice.grpc.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<github.com.hlx.kvservice.grpc.OpenSessionReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(github.com.hlx.kvservice.grpc.GetRequest request,
        io.grpc.stub.StreamObserver<github.com.hlx.kvservice.grpc.GetReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(github.com.hlx.kvservice.grpc.UpdateRequest request,
        io.grpc.stub.StreamObserver<github.com.hlx.kvservice.grpc.UpdateReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KVServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<KVServerBlockingStub> {
    private KVServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public github.com.hlx.kvservice.grpc.OpenSessionReply openSession(github.com.hlx.kvservice.grpc.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public github.com.hlx.kvservice.grpc.GetReply get(github.com.hlx.kvservice.grpc.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public github.com.hlx.kvservice.grpc.UpdateReply update(github.com.hlx.kvservice.grpc.UpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KVServerFutureStub extends io.grpc.stub.AbstractFutureStub<KVServerFutureStub> {
    private KVServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<github.com.hlx.kvservice.grpc.OpenSessionReply> openSession(
        github.com.hlx.kvservice.grpc.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<github.com.hlx.kvservice.grpc.GetReply> get(
        github.com.hlx.kvservice.grpc.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<github.com.hlx.kvservice.grpc.UpdateReply> update(
        github.com.hlx.kvservice.grpc.UpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPEN_SESSION = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_UPDATE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KVServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KVServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((github.com.hlx.kvservice.grpc.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<github.com.hlx.kvservice.grpc.OpenSessionReply>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((github.com.hlx.kvservice.grpc.GetRequest) request,
              (io.grpc.stub.StreamObserver<github.com.hlx.kvservice.grpc.GetReply>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((github.com.hlx.kvservice.grpc.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<github.com.hlx.kvservice.grpc.UpdateReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class KVServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KVServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return github.com.hlx.kvservice.grpc.FTKVService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KVServer");
    }
  }

  private static final class KVServerFileDescriptorSupplier
      extends KVServerBaseDescriptorSupplier {
    KVServerFileDescriptorSupplier() {}
  }

  private static final class KVServerMethodDescriptorSupplier
      extends KVServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KVServerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KVServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KVServerFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getGetMethod())
              .addMethod(getUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
