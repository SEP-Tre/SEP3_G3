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
  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.FPByUsernameRequest,
      sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getGetFoodPostsByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFoodPostsByUsername",
      requestType = sep3.g3.rightoversjava.grpc.generated.FPByUsernameRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.FPByUsernameRequest,
      sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getGetFoodPostsByUsernameMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.FPByUsernameRequest, sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getGetFoodPostsByUsernameMethod;
    if ((getGetFoodPostsByUsernameMethod = FoodPostServiceGrpc.getGetFoodPostsByUsernameMethod) == null) {
      synchronized (FoodPostServiceGrpc.class) {
        if ((getGetFoodPostsByUsernameMethod = FoodPostServiceGrpc.getGetFoodPostsByUsernameMethod) == null) {
          FoodPostServiceGrpc.getGetFoodPostsByUsernameMethod = getGetFoodPostsByUsernameMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.FPByUsernameRequest, sep3.g3.rightoversjava.grpc.generated.FoodPostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFoodPostsByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.FPByUsernameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FoodPostServiceMethodDescriptorSupplier("getFoodPostsByUsername"))
              .build();
        }
      }
    }
    return getGetFoodPostsByUsernameMethod;
  }

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

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.FoodPostReservation,
      sep3.g3.rightoversjava.grpc.generated.ReservationResponse> getReserveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reserve",
      requestType = sep3.g3.rightoversjava.grpc.generated.FoodPostReservation.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.FoodPostReservation,
      sep3.g3.rightoversjava.grpc.generated.ReservationResponse> getReserveMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.FoodPostReservation, sep3.g3.rightoversjava.grpc.generated.ReservationResponse> getReserveMethod;
    if ((getReserveMethod = FoodPostServiceGrpc.getReserveMethod) == null) {
      synchronized (FoodPostServiceGrpc.class) {
        if ((getReserveMethod = FoodPostServiceGrpc.getReserveMethod) == null) {
          FoodPostServiceGrpc.getReserveMethod = getReserveMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.FoodPostReservation, sep3.g3.rightoversjava.grpc.generated.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "reserve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.FoodPostReservation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FoodPostServiceMethodDescriptorSupplier("reserve"))
              .build();
        }
      }
    }
    return getReserveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.PickUpRequest,
      sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getPickUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pickUp",
      requestType = sep3.g3.rightoversjava.grpc.generated.PickUpRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.PickUpRequest,
      sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getPickUpMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.PickUpRequest, sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getPickUpMethod;
    if ((getPickUpMethod = FoodPostServiceGrpc.getPickUpMethod) == null) {
      synchronized (FoodPostServiceGrpc.class) {
        if ((getPickUpMethod = FoodPostServiceGrpc.getPickUpMethod) == null) {
          FoodPostServiceGrpc.getPickUpMethod = getPickUpMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.PickUpRequest, sep3.g3.rightoversjava.grpc.generated.FoodPostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "pickUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.PickUpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FoodPostServiceMethodDescriptorSupplier("pickUp"))
              .build();
        }
      }
    }
    return getPickUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.FoodPostID,
      sep3.g3.rightoversjava.grpc.generated.ReservationResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = sep3.g3.rightoversjava.grpc.generated.FoodPostID.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.FoodPostID,
      sep3.g3.rightoversjava.grpc.generated.ReservationResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.FoodPostID, sep3.g3.rightoversjava.grpc.generated.ReservationResponse> getDeleteMethod;
    if ((getDeleteMethod = FoodPostServiceGrpc.getDeleteMethod) == null) {
      synchronized (FoodPostServiceGrpc.class) {
        if ((getDeleteMethod = FoodPostServiceGrpc.getDeleteMethod) == null) {
          FoodPostServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.FoodPostID, sep3.g3.rightoversjava.grpc.generated.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.FoodPostID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FoodPostServiceMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
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
    public void getFoodPostsByUsername(sep3.g3.rightoversjava.grpc.generated.FPByUsernameRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFoodPostsByUsernameMethod(), responseObserver);
    }

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

    /**
     */
    public void reserve(sep3.g3.rightoversjava.grpc.generated.FoodPostReservation request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.ReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReserveMethod(), responseObserver);
    }

    /**
     */
    public void pickUp(sep3.g3.rightoversjava.grpc.generated.PickUpRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPickUpMethod(), responseObserver);
    }

    /**
     */
    public void delete(sep3.g3.rightoversjava.grpc.generated.FoodPostID request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.ReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFoodPostsByUsernameMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.FPByUsernameRequest,
                sep3.g3.rightoversjava.grpc.generated.FoodPostResponse>(
                  this, METHODID_GET_FOOD_POSTS_BY_USERNAME)))
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
          .addMethod(
            getReserveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.FoodPostReservation,
                sep3.g3.rightoversjava.grpc.generated.ReservationResponse>(
                  this, METHODID_RESERVE)))
          .addMethod(
            getPickUpMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.PickUpRequest,
                sep3.g3.rightoversjava.grpc.generated.FoodPostResponse>(
                  this, METHODID_PICK_UP)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.FoodPostID,
                sep3.g3.rightoversjava.grpc.generated.ReservationResponse>(
                  this, METHODID_DELETE)))
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
    public void getFoodPostsByUsername(sep3.g3.rightoversjava.grpc.generated.FPByUsernameRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetFoodPostsByUsernameMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public void reserve(sep3.g3.rightoversjava.grpc.generated.FoodPostReservation request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.ReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReserveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pickUp(sep3.g3.rightoversjava.grpc.generated.PickUpRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPickUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(sep3.g3.rightoversjava.grpc.generated.FoodPostID request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.ReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
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
    public java.util.Iterator<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> getFoodPostsByUsername(
        sep3.g3.rightoversjava.grpc.generated.FPByUsernameRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetFoodPostsByUsernameMethod(), getCallOptions(), request);
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

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.ReservationResponse reserve(sep3.g3.rightoversjava.grpc.generated.FoodPostReservation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReserveMethod(), getCallOptions(), request);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.FoodPostResponse pickUp(sep3.g3.rightoversjava.grpc.generated.PickUpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPickUpMethod(), getCallOptions(), request);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.ReservationResponse delete(sep3.g3.rightoversjava.grpc.generated.FoodPostID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.ReservationResponse> reserve(
        sep3.g3.rightoversjava.grpc.generated.FoodPostReservation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReserveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse> pickUp(
        sep3.g3.rightoversjava.grpc.generated.PickUpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPickUpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.ReservationResponse> delete(
        sep3.g3.rightoversjava.grpc.generated.FoodPostID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FOOD_POSTS_BY_USERNAME = 0;
  private static final int METHODID_POST = 1;
  private static final int METHODID_GET_ALL_FOOD_POSTS = 2;
  private static final int METHODID_GET_SINGLE_FOOD_POST = 3;
  private static final int METHODID_RESERVE = 4;
  private static final int METHODID_PICK_UP = 5;
  private static final int METHODID_DELETE = 6;

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
        case METHODID_GET_FOOD_POSTS_BY_USERNAME:
          serviceImpl.getFoodPostsByUsername((sep3.g3.rightoversjava.grpc.generated.FPByUsernameRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse>) responseObserver);
          break;
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
        case METHODID_RESERVE:
          serviceImpl.reserve((sep3.g3.rightoversjava.grpc.generated.FoodPostReservation) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.ReservationResponse>) responseObserver);
          break;
        case METHODID_PICK_UP:
          serviceImpl.pickUp((sep3.g3.rightoversjava.grpc.generated.PickUpRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.FoodPostResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((sep3.g3.rightoversjava.grpc.generated.FoodPostID) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.ReservationResponse>) responseObserver);
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
              .addMethod(getGetFoodPostsByUsernameMethod())
              .addMethod(getPostMethod())
              .addMethod(getGetAllFoodPostsMethod())
              .addMethod(getGetSingleFoodPostMethod())
              .addMethod(getReserveMethod())
              .addMethod(getPickUpMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
