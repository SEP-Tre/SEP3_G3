package sep3.g3.rightoversjava.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: FoodPost.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FoodPostServiceGrpc {

  private FoodPostServiceGrpc() {}

  public static final String SERVICE_NAME = "sep3.g3.FoodPostService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.FoodPostRequest,
      sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "post",
      requestType = sep3.g3.rightoversjava.grpc.generated.FoodPostRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.FoodPostRequest,
      sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getPostMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.FoodPostRequest, sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getPostMethod;
    if ((getPostMethod = FoodPostServiceGrpc.getPostMethod) == null) {
      synchronized (FoodPostServiceGrpc.class) {
        if ((getPostMethod = FoodPostServiceGrpc.getPostMethod) == null) {
          FoodPostServiceGrpc.getPostMethod = getPostMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.FoodPostRequest, sep3.g3.rightoversjava.grpc.generated.FoodPostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "post"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.FoodPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FoodPostServiceMethodDescriptorSupplier("post"))
              .build();
        }
      }
    }
    return getPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.GetAllRequest,
      sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getGetAllFoodPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllFoodPosts",
      requestType = sep3.g3.rightoversjava.grpc.generated.GetAllRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.GetAllRequest,
      sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getGetAllFoodPostsMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.GetAllRequest, sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getGetAllFoodPostsMethod;
    if ((getGetAllFoodPostsMethod = FoodPostServiceGrpc.getGetAllFoodPostsMethod) == null) {
      synchronized (FoodPostServiceGrpc.class) {
        if ((getGetAllFoodPostsMethod = FoodPostServiceGrpc.getGetAllFoodPostsMethod) == null) {
          FoodPostServiceGrpc.getGetAllFoodPostsMethod = getGetAllFoodPostsMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.GetAllRequest, sep3.g3.rightoversjava.grpc.generated.FoodPostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllFoodPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.GetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FoodPostServiceMethodDescriptorSupplier("getAllFoodPosts"))
              .build();
        }
      }
    }
    return getGetAllFoodPostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.FoodPostID,
      sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getGetSingleFoodPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSingleFoodPost",
      requestType = sep3.g3.rightoversjava.grpc.generated.FoodPostID.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.FoodPostID,
      sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getGetSingleFoodPostMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.FoodPostID, sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getGetSingleFoodPostMethod;
    if ((getGetSingleFoodPostMethod = FoodPostServiceGrpc.getGetSingleFoodPostMethod) == null) {
      synchronized (FoodPostServiceGrpc.class) {
        if ((getGetSingleFoodPostMethod = FoodPostServiceGrpc.getGetSingleFoodPostMethod) == null) {
          FoodPostServiceGrpc.getGetSingleFoodPostMethod = getGetSingleFoodPostMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.FoodPostID, sep3.g3.rightoversjava.grpc.generated.FoodPostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSingleFoodPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.FoodPostID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FoodPostServiceMethodDescriptorSupplier("getSingleFoodPost"))
              .build();
        }
      }
    }
    return getGetSingleFoodPostMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FoodPostServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FoodPostServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FoodPostServiceStub>() {
        @java.lang.Override
        public FoodPostServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FoodPostServiceStub(channel, callOptions);
        }
      };
    return FoodPostServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FoodPostServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FoodPostServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FoodPostServiceBlockingStub>() {
        @java.lang.Override
        public FoodPostServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FoodPostServiceBlockingStub(channel, callOptions);
        }
      };
    return FoodPostServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FoodPostServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FoodPostServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FoodPostServiceFutureStub>() {
        @java.lang.Override
        public FoodPostServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FoodPostServiceFutureStub(channel, callOptions);
        }
      };
    return FoodPostServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FoodPostServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void post(sep3.g3.rightoversjava.grpc.generated.FoodPostRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostMethod(), responseObserver);
    }

    /**
     */
    public void getAllFoodPosts(sep3.g3.rightoversjava.grpc.generated.GetAllRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllFoodPostsMethod(), responseObserver);
    }

    /**
     */
    public void getSingleFoodPost(sep3.g3.rightoversjava.grpc.generated.FoodPostID request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSingleFoodPostMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.FoodPostRequest,
                sep3.g3.rightoversjava.grpc.generated.FoodPostResponse>(
                  this, METHODID_POST)))
          .addMethod(
            getGetAllFoodPostsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.GetAllRequest,
                sep3.g3.rightoversjava.grpc.generated.FoodPostResponse>(
                  this, METHODID_GET_ALL_FOOD_POSTS)))
          .addMethod(
            getGetSingleFoodPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.FoodPostID,
                sep3.g3.rightoversjava.grpc.generated.FoodPostResponse>(
                  this, METHODID_GET_SINGLE_FOOD_POST)))
          .build();
    }
  }

  /**
   */
  public static final class FoodPostServiceStub extends io.grpc.stub.AbstractAsyncStub<FoodPostServiceStub> {
    private FoodPostServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FoodPostServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FoodPostServiceStub(channel, callOptions);
    }

    /**
     */
    public void post(sep3.g3.rightoversjava.grpc.generated.FoodPostRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllFoodPosts(sep3.g3.rightoversjava.grpc.generated.GetAllRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllFoodPostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSingleFoodPost(sep3.g3.rightoversjava.grpc.generated.FoodPostID request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSingleFoodPostMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FoodPostServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FoodPostServiceBlockingStub> {
    private FoodPostServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FoodPostServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FoodPostServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.FoodPostResponse post(sep3.g3.rightoversjava.grpc.generated.FoodPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getAllFoodPosts(
        sep3.g3.rightoversjava.grpc.generated.GetAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllFoodPostsMethod(), getCallOptions(), request);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.FoodPostResponse getSingleFoodPost(sep3.g3.rightoversjava.grpc.generated.FoodPostID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSingleFoodPostMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FoodPostServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FoodPostServiceFutureStub> {
    private FoodPostServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FoodPostServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FoodPostServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> post(
        sep3.g3.rightoversjava.grpc.generated.FoodPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getSingleFoodPost(
        sep3.g3.rightoversjava.grpc.generated.FoodPostID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSingleFoodPostMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST = 0;
  private static final int METHODID_GET_ALL_FOOD_POSTS = 1;
  private static final int METHODID_GET_SINGLE_FOOD_POST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FoodPostServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FoodPostServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POST:
          serviceImpl.post((sep3.g3.rightoversjava.grpc.generated.FoodPostRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_FOOD_POSTS:
          serviceImpl.getAllFoodPosts((sep3.g3.rightoversjava.grpc.generated.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse>) responseObserver);
          break;
        case METHODID_GET_SINGLE_FOOD_POST:
          serviceImpl.getSingleFoodPost((sep3.g3.rightoversjava.grpc.generated.FoodPostID) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse>) responseObserver);
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

  private static abstract class FoodPostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FoodPostServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sep3.g3.rightoversjava.grpc.generated.FoodPost.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FoodPostService");
    }
  }

  private static final class FoodPostServiceFileDescriptorSupplier
      extends FoodPostServiceBaseDescriptorSupplier {
    FoodPostServiceFileDescriptorSupplier() {}
  }

  private static final class FoodPostServiceMethodDescriptorSupplier
      extends FoodPostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FoodPostServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FoodPostServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FoodPostServiceFileDescriptorSupplier())
              .addMethod(getPostMethod())
              .addMethod(getGetAllFoodPostsMethod())
              .addMethod(getGetSingleFoodPostMethod())
              .build();
        }
      }
    }
    return result;
  }
}
