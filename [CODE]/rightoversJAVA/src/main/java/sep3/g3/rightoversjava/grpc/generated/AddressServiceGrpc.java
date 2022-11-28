package sep3.g3.rightoversjava.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Address.proto")
public final class AddressServiceGrpc {

  private AddressServiceGrpc() {}

  public static final String SERVICE_NAME = "sep3.g3.AddressService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.AddressRequest,
      sep3.g3.rightoversjava.grpc.generated.AddressResponse> getCreateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAddress",
      requestType = sep3.g3.rightoversjava.grpc.generated.AddressRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.AddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.AddressRequest,
      sep3.g3.rightoversjava.grpc.generated.AddressResponse> getCreateAddressMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.AddressRequest, sep3.g3.rightoversjava.grpc.generated.AddressResponse> getCreateAddressMethod;
    if ((getCreateAddressMethod = AddressServiceGrpc.getCreateAddressMethod) == null) {
      synchronized (AddressServiceGrpc.class) {
        if ((getCreateAddressMethod = AddressServiceGrpc.getCreateAddressMethod) == null) {
          AddressServiceGrpc.getCreateAddressMethod = getCreateAddressMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.AddressRequest, sep3.g3.rightoversjava.grpc.generated.AddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.AddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.AddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AddressServiceMethodDescriptorSupplier("createAddress"))
              .build();
        }
      }
    }
    return getCreateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.GetAllRequest,
      sep3.g3.rightoversjava.grpc.generated.AddressResponse> getGetAllAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllAddresses",
      requestType = sep3.g3.rightoversjava.grpc.generated.GetAllRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.AddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.GetAllRequest,
      sep3.g3.rightoversjava.grpc.generated.AddressResponse> getGetAllAddressesMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.GetAllRequest, sep3.g3.rightoversjava.grpc.generated.AddressResponse> getGetAllAddressesMethod;
    if ((getGetAllAddressesMethod = AddressServiceGrpc.getGetAllAddressesMethod) == null) {
      synchronized (AddressServiceGrpc.class) {
        if ((getGetAllAddressesMethod = AddressServiceGrpc.getGetAllAddressesMethod) == null) {
          AddressServiceGrpc.getGetAllAddressesMethod = getGetAllAddressesMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.GetAllRequest, sep3.g3.rightoversjava.grpc.generated.AddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.GetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.AddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AddressServiceMethodDescriptorSupplier("getAllAddresses"))
              .build();
        }
      }
    }
    return getGetAllAddressesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AddressServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddressServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddressServiceStub>() {
        @java.lang.Override
        public AddressServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddressServiceStub(channel, callOptions);
        }
      };
    return AddressServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AddressServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddressServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddressServiceBlockingStub>() {
        @java.lang.Override
        public AddressServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddressServiceBlockingStub(channel, callOptions);
        }
      };
    return AddressServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AddressServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddressServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddressServiceFutureStub>() {
        @java.lang.Override
        public AddressServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddressServiceFutureStub(channel, callOptions);
        }
      };
    return AddressServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AddressServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createAddress(sep3.g3.rightoversjava.grpc.generated.AddressRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.AddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAddressMethod(), responseObserver);
    }

    /**
     */
    public void getAllAddresses(sep3.g3.rightoversjava.grpc.generated.GetAllRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.AddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllAddressesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.AddressRequest,
                sep3.g3.rightoversjava.grpc.generated.AddressResponse>(
                  this, METHODID_CREATE_ADDRESS)))
          .addMethod(
            getGetAllAddressesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.GetAllRequest,
                sep3.g3.rightoversjava.grpc.generated.AddressResponse>(
                  this, METHODID_GET_ALL_ADDRESSES)))
          .build();
    }
  }

  /**
   */
  public static final class AddressServiceStub extends io.grpc.stub.AbstractAsyncStub<AddressServiceStub> {
    private AddressServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddressServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddressServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAddress(sep3.g3.rightoversjava.grpc.generated.AddressRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.AddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllAddresses(sep3.g3.rightoversjava.grpc.generated.GetAllRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.AddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllAddressesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AddressServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AddressServiceBlockingStub> {
    private AddressServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddressServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddressServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.AddressResponse createAddress(sep3.g3.rightoversjava.grpc.generated.AddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<sep3.g3.rightoversjava.grpc.generated.AddressResponse> getAllAddresses(
        sep3.g3.rightoversjava.grpc.generated.GetAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllAddressesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AddressServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AddressServiceFutureStub> {
    private AddressServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddressServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddressServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.AddressResponse> createAddress(
        sep3.g3.rightoversjava.grpc.generated.AddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ADDRESS = 0;
  private static final int METHODID_GET_ALL_ADDRESSES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AddressServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AddressServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ADDRESS:
          serviceImpl.createAddress((sep3.g3.rightoversjava.grpc.generated.AddressRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.AddressResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_ADDRESSES:
          serviceImpl.getAllAddresses((sep3.g3.rightoversjava.grpc.generated.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.AddressResponse>) responseObserver);
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

  private static abstract class AddressServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AddressServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sep3.g3.rightoversjava.grpc.generated.Address.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AddressService");
    }
  }

  private static final class AddressServiceFileDescriptorSupplier
      extends AddressServiceBaseDescriptorSupplier {
    AddressServiceFileDescriptorSupplier() {}
  }

  private static final class AddressServiceMethodDescriptorSupplier
      extends AddressServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AddressServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AddressServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AddressServiceFileDescriptorSupplier())
              .addMethod(getCreateAddressMethod())
              .addMethod(getGetAllAddressesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
