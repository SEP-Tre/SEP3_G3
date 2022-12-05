package sep3.g3.rightoversjava.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: Rating.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RatingServiceGrpc {

  private RatingServiceGrpc() {}

  public static final String SERVICE_NAME = "sep3.g3.RatingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.RatingMessage,
      sep3.g3.rightoversjava.grpc.generated.RatingMessage> getAddRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addRating",
      requestType = sep3.g3.rightoversjava.grpc.generated.RatingMessage.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.RatingMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.RatingMessage,
      sep3.g3.rightoversjava.grpc.generated.RatingMessage> getAddRatingMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.RatingMessage, sep3.g3.rightoversjava.grpc.generated.RatingMessage> getAddRatingMethod;
    if ((getAddRatingMethod = RatingServiceGrpc.getAddRatingMethod) == null) {
      synchronized (RatingServiceGrpc.class) {
        if ((getAddRatingMethod = RatingServiceGrpc.getAddRatingMethod) == null) {
          RatingServiceGrpc.getAddRatingMethod = getAddRatingMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.RatingMessage, sep3.g3.rightoversjava.grpc.generated.RatingMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.RatingMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.RatingMessage.getDefaultInstance()))
              .setSchemaDescriptor(new RatingServiceMethodDescriptorSupplier("addRating"))
              .build();
        }
      }
    }
    return getAddRatingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UsernameRequest,
      sep3.g3.rightoversjava.grpc.generated.RatingMessageList> getGetAllByUserRatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllByUserRated",
      requestType = sep3.g3.rightoversjava.grpc.generated.UsernameRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.RatingMessageList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UsernameRequest,
      sep3.g3.rightoversjava.grpc.generated.RatingMessageList> getGetAllByUserRatedMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UsernameRequest, sep3.g3.rightoversjava.grpc.generated.RatingMessageList> getGetAllByUserRatedMethod;
    if ((getGetAllByUserRatedMethod = RatingServiceGrpc.getGetAllByUserRatedMethod) == null) {
      synchronized (RatingServiceGrpc.class) {
        if ((getGetAllByUserRatedMethod = RatingServiceGrpc.getGetAllByUserRatedMethod) == null) {
          RatingServiceGrpc.getGetAllByUserRatedMethod = getGetAllByUserRatedMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.UsernameRequest, sep3.g3.rightoversjava.grpc.generated.RatingMessageList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllByUserRated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UsernameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.RatingMessageList.getDefaultInstance()))
              .setSchemaDescriptor(new RatingServiceMethodDescriptorSupplier("getAllByUserRated"))
              .build();
        }
      }
    }
    return getGetAllByUserRatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UsernameRequest,
      sep3.g3.rightoversjava.grpc.generated.RatingMessageList> getGetAllByUserRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllByUserRating",
      requestType = sep3.g3.rightoversjava.grpc.generated.UsernameRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.RatingMessageList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UsernameRequest,
      sep3.g3.rightoversjava.grpc.generated.RatingMessageList> getGetAllByUserRatingMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UsernameRequest, sep3.g3.rightoversjava.grpc.generated.RatingMessageList> getGetAllByUserRatingMethod;
    if ((getGetAllByUserRatingMethod = RatingServiceGrpc.getGetAllByUserRatingMethod) == null) {
      synchronized (RatingServiceGrpc.class) {
        if ((getGetAllByUserRatingMethod = RatingServiceGrpc.getGetAllByUserRatingMethod) == null) {
          RatingServiceGrpc.getGetAllByUserRatingMethod = getGetAllByUserRatingMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.UsernameRequest, sep3.g3.rightoversjava.grpc.generated.RatingMessageList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllByUserRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UsernameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.RatingMessageList.getDefaultInstance()))
              .setSchemaDescriptor(new RatingServiceMethodDescriptorSupplier("getAllByUserRating"))
              .build();
        }
      }
    }
    return getGetAllByUserRatingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RatingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RatingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RatingServiceStub>() {
        @java.lang.Override
        public RatingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RatingServiceStub(channel, callOptions);
        }
      };
    return RatingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RatingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RatingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RatingServiceBlockingStub>() {
        @java.lang.Override
        public RatingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RatingServiceBlockingStub(channel, callOptions);
        }
      };
    return RatingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RatingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RatingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RatingServiceFutureStub>() {
        @java.lang.Override
        public RatingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RatingServiceFutureStub(channel, callOptions);
        }
      };
    return RatingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RatingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addRating(sep3.g3.rightoversjava.grpc.generated.RatingMessage request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.RatingMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRatingMethod(), responseObserver);
    }

    /**
     */
    public void getAllByUserRated(sep3.g3.rightoversjava.grpc.generated.UsernameRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.RatingMessageList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllByUserRatedMethod(), responseObserver);
    }

    /**
     */
    public void getAllByUserRating(sep3.g3.rightoversjava.grpc.generated.UsernameRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.RatingMessageList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllByUserRatingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddRatingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.RatingMessage,
                sep3.g3.rightoversjava.grpc.generated.RatingMessage>(
                  this, METHODID_ADD_RATING)))
          .addMethod(
            getGetAllByUserRatedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.UsernameRequest,
                sep3.g3.rightoversjava.grpc.generated.RatingMessageList>(
                  this, METHODID_GET_ALL_BY_USER_RATED)))
          .addMethod(
            getGetAllByUserRatingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.UsernameRequest,
                sep3.g3.rightoversjava.grpc.generated.RatingMessageList>(
                  this, METHODID_GET_ALL_BY_USER_RATING)))
          .build();
    }
  }

  /**
   */
  public static final class RatingServiceStub extends io.grpc.stub.AbstractAsyncStub<RatingServiceStub> {
    private RatingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RatingServiceStub(channel, callOptions);
    }

    /**
     */
    public void addRating(sep3.g3.rightoversjava.grpc.generated.RatingMessage request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.RatingMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRatingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllByUserRated(sep3.g3.rightoversjava.grpc.generated.UsernameRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.RatingMessageList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllByUserRatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllByUserRating(sep3.g3.rightoversjava.grpc.generated.UsernameRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.RatingMessageList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllByUserRatingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RatingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RatingServiceBlockingStub> {
    private RatingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RatingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.RatingMessage addRating(sep3.g3.rightoversjava.grpc.generated.RatingMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRatingMethod(), getCallOptions(), request);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.RatingMessageList getAllByUserRated(sep3.g3.rightoversjava.grpc.generated.UsernameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllByUserRatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.RatingMessageList getAllByUserRating(sep3.g3.rightoversjava.grpc.generated.UsernameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllByUserRatingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RatingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RatingServiceFutureStub> {
    private RatingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RatingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.RatingMessage> addRating(
        sep3.g3.rightoversjava.grpc.generated.RatingMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRatingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.RatingMessageList> getAllByUserRated(
        sep3.g3.rightoversjava.grpc.generated.UsernameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllByUserRatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.RatingMessageList> getAllByUserRating(
        sep3.g3.rightoversjava.grpc.generated.UsernameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllByUserRatingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_RATING = 0;
  private static final int METHODID_GET_ALL_BY_USER_RATED = 1;
  private static final int METHODID_GET_ALL_BY_USER_RATING = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RatingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RatingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_RATING:
          serviceImpl.addRating((sep3.g3.rightoversjava.grpc.generated.RatingMessage) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.RatingMessage>) responseObserver);
          break;
        case METHODID_GET_ALL_BY_USER_RATED:
          serviceImpl.getAllByUserRated((sep3.g3.rightoversjava.grpc.generated.UsernameRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.RatingMessageList>) responseObserver);
          break;
        case METHODID_GET_ALL_BY_USER_RATING:
          serviceImpl.getAllByUserRating((sep3.g3.rightoversjava.grpc.generated.UsernameRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.RatingMessageList>) responseObserver);
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

  private static abstract class RatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RatingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sep3.g3.rightoversjava.grpc.generated.Rating.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RatingService");
    }
  }

  private static final class RatingServiceFileDescriptorSupplier
      extends RatingServiceBaseDescriptorSupplier {
    RatingServiceFileDescriptorSupplier() {}
  }

  private static final class RatingServiceMethodDescriptorSupplier
      extends RatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RatingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RatingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RatingServiceFileDescriptorSupplier())
              .addMethod(getAddRatingMethod())
              .addMethod(getGetAllByUserRatedMethod())
              .addMethod(getGetAllByUserRatingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
