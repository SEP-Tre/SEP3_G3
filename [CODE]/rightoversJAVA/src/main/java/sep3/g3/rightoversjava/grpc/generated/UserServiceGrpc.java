package sep3.g3.rightoversjava.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: User.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "sep3.g3.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserRequest,
      sep3.g3.rightoversjava.grpc.generated.UserMessage> getGetByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByUsername",
      requestType = sep3.g3.rightoversjava.grpc.generated.UserRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.UserMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserRequest,
      sep3.g3.rightoversjava.grpc.generated.UserMessage> getGetByUsernameMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserRequest, sep3.g3.rightoversjava.grpc.generated.UserMessage> getGetByUsernameMethod;
    if ((getGetByUsernameMethod = UserServiceGrpc.getGetByUsernameMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetByUsernameMethod = UserServiceGrpc.getGetByUsernameMethod) == null) {
          UserServiceGrpc.getGetByUsernameMethod = getGetByUsernameMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.UserRequest, sep3.g3.rightoversjava.grpc.generated.UserMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UserMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getByUsername"))
              .build();
        }
      }
    }
    return getGetByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserCreationRequest,
      sep3.g3.rightoversjava.grpc.generated.UserMessage> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = sep3.g3.rightoversjava.grpc.generated.UserCreationRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.UserMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserCreationRequest,
      sep3.g3.rightoversjava.grpc.generated.UserMessage> getRegisterMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserCreationRequest, sep3.g3.rightoversjava.grpc.generated.UserMessage> getRegisterMethod;
    if ((getRegisterMethod = UserServiceGrpc.getRegisterMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRegisterMethod = UserServiceGrpc.getRegisterMethod) == null) {
          UserServiceGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.UserCreationRequest, sep3.g3.rightoversjava.grpc.generated.UserMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UserCreationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UserMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.OpeningHoursRequest,
      sep3.g3.rightoversjava.grpc.generated.UserMessage> getAssignOpeningHoursMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "assignOpeningHours",
      requestType = sep3.g3.rightoversjava.grpc.generated.OpeningHoursRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.UserMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.OpeningHoursRequest,
      sep3.g3.rightoversjava.grpc.generated.UserMessage> getAssignOpeningHoursMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.OpeningHoursRequest, sep3.g3.rightoversjava.grpc.generated.UserMessage> getAssignOpeningHoursMethod;
    if ((getAssignOpeningHoursMethod = UserServiceGrpc.getAssignOpeningHoursMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAssignOpeningHoursMethod = UserServiceGrpc.getAssignOpeningHoursMethod) == null) {
          UserServiceGrpc.getAssignOpeningHoursMethod = getAssignOpeningHoursMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.OpeningHoursRequest, sep3.g3.rightoversjava.grpc.generated.UserMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "assignOpeningHours"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.OpeningHoursRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UserMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("assignOpeningHours"))
              .build();
        }
      }
    }
    return getAssignOpeningHoursMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserLoginRequest,
      sep3.g3.rightoversjava.grpc.generated.UserMessage> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = sep3.g3.rightoversjava.grpc.generated.UserLoginRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.UserMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserLoginRequest,
      sep3.g3.rightoversjava.grpc.generated.UserMessage> getLoginMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserLoginRequest, sep3.g3.rightoversjava.grpc.generated.UserMessage> getLoginMethod;
    if ((getLoginMethod = UserServiceGrpc.getLoginMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLoginMethod = UserServiceGrpc.getLoginMethod) == null) {
          UserServiceGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.UserLoginRequest, sep3.g3.rightoversjava.grpc.generated.UserMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UserLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UserMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserRequest,
      sep3.g3.rightoversjava.grpc.generated.ReservationMessage> getGetReservationsByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getReservationsByUsername",
      requestType = sep3.g3.rightoversjava.grpc.generated.UserRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.ReservationMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserRequest,
      sep3.g3.rightoversjava.grpc.generated.ReservationMessage> getGetReservationsByUsernameMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserRequest, sep3.g3.rightoversjava.grpc.generated.ReservationMessage> getGetReservationsByUsernameMethod;
    if ((getGetReservationsByUsernameMethod = UserServiceGrpc.getGetReservationsByUsernameMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetReservationsByUsernameMethod = UserServiceGrpc.getGetReservationsByUsernameMethod) == null) {
          UserServiceGrpc.getGetReservationsByUsernameMethod = getGetReservationsByUsernameMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.UserRequest, sep3.g3.rightoversjava.grpc.generated.ReservationMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getReservationsByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.ReservationMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getReservationsByUsername"))
              .build();
        }
      }
    }
    return getGetReservationsByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserRequest,
      sep3.g3.rightoversjava.grpc.generated.Filler> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUser",
      requestType = sep3.g3.rightoversjava.grpc.generated.UserRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.Filler.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserRequest,
      sep3.g3.rightoversjava.grpc.generated.Filler> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserRequest, sep3.g3.rightoversjava.grpc.generated.Filler> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
          UserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.UserRequest, sep3.g3.rightoversjava.grpc.generated.Filler>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.Filler.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("deleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserRequest,
      sep3.g3.rightoversjava.grpc.generated.ReportMessage> getGetReportsAgainstUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getReportsAgainstUser",
      requestType = sep3.g3.rightoversjava.grpc.generated.UserRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.ReportMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserRequest,
      sep3.g3.rightoversjava.grpc.generated.ReportMessage> getGetReportsAgainstUserMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserRequest, sep3.g3.rightoversjava.grpc.generated.ReportMessage> getGetReportsAgainstUserMethod;
    if ((getGetReportsAgainstUserMethod = UserServiceGrpc.getGetReportsAgainstUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetReportsAgainstUserMethod = UserServiceGrpc.getGetReportsAgainstUserMethod) == null) {
          UserServiceGrpc.getGetReportsAgainstUserMethod = getGetReportsAgainstUserMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.UserRequest, sep3.g3.rightoversjava.grpc.generated.ReportMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getReportsAgainstUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.ReportMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getReportsAgainstUser"))
              .build();
        }
      }
    }
    return getGetReportsAgainstUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserName,
      sep3.g3.rightoversjava.grpc.generated.OpeningHoursResponse> getGetOpeningHoursMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOpeningHours",
      requestType = sep3.g3.rightoversjava.grpc.generated.UserName.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.OpeningHoursResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserName,
      sep3.g3.rightoversjava.grpc.generated.OpeningHoursResponse> getGetOpeningHoursMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.UserName, sep3.g3.rightoversjava.grpc.generated.OpeningHoursResponse> getGetOpeningHoursMethod;
    if ((getGetOpeningHoursMethod = UserServiceGrpc.getGetOpeningHoursMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetOpeningHoursMethod = UserServiceGrpc.getGetOpeningHoursMethod) == null) {
          UserServiceGrpc.getGetOpeningHoursMethod = getGetOpeningHoursMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.UserName, sep3.g3.rightoversjava.grpc.generated.OpeningHoursResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getOpeningHours"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UserName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.OpeningHoursResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getOpeningHours"))
              .build();
        }
      }
    }
    return getGetOpeningHoursMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.ChangeFirstNameRequest,
      sep3.g3.rightoversjava.grpc.generated.UserMessage> getChangeFirstNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeFirstName",
      requestType = sep3.g3.rightoversjava.grpc.generated.ChangeFirstNameRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.UserMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.ChangeFirstNameRequest,
      sep3.g3.rightoversjava.grpc.generated.UserMessage> getChangeFirstNameMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.ChangeFirstNameRequest, sep3.g3.rightoversjava.grpc.generated.UserMessage> getChangeFirstNameMethod;
    if ((getChangeFirstNameMethod = UserServiceGrpc.getChangeFirstNameMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getChangeFirstNameMethod = UserServiceGrpc.getChangeFirstNameMethod) == null) {
          UserServiceGrpc.getChangeFirstNameMethod = getChangeFirstNameMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.ChangeFirstNameRequest, sep3.g3.rightoversjava.grpc.generated.UserMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "changeFirstName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.ChangeFirstNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UserMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("changeFirstName"))
              .build();
        }
      }
    }
    return getChangeFirstNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.ChangePasswordRequest,
      sep3.g3.rightoversjava.grpc.generated.UserMessage> getChangePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changePassword",
      requestType = sep3.g3.rightoversjava.grpc.generated.ChangePasswordRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.UserMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.ChangePasswordRequest,
      sep3.g3.rightoversjava.grpc.generated.UserMessage> getChangePasswordMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.ChangePasswordRequest, sep3.g3.rightoversjava.grpc.generated.UserMessage> getChangePasswordMethod;
    if ((getChangePasswordMethod = UserServiceGrpc.getChangePasswordMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getChangePasswordMethod = UserServiceGrpc.getChangePasswordMethod) == null) {
          UserServiceGrpc.getChangePasswordMethod = getChangePasswordMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.ChangePasswordRequest, sep3.g3.rightoversjava.grpc.generated.UserMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "changePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.ChangePasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UserMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("changePassword"))
              .build();
        }
      }
    }
    return getChangePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest,
      sep3.g3.rightoversjava.grpc.generated.UserMessage> getChangeAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeAddress",
      requestType = sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest.class,
      responseType = sep3.g3.rightoversjava.grpc.generated.UserMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest,
      sep3.g3.rightoversjava.grpc.generated.UserMessage> getChangeAddressMethod() {
    io.grpc.MethodDescriptor<sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest, sep3.g3.rightoversjava.grpc.generated.UserMessage> getChangeAddressMethod;
    if ((getChangeAddressMethod = UserServiceGrpc.getChangeAddressMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getChangeAddressMethod = UserServiceGrpc.getChangeAddressMethod) == null) {
          UserServiceGrpc.getChangeAddressMethod = getChangeAddressMethod =
              io.grpc.MethodDescriptor.<sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest, sep3.g3.rightoversjava.grpc.generated.UserMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "changeAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.g3.rightoversjava.grpc.generated.UserMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("changeAddress"))
              .build();
        }
      }
    }
    return getChangeAddressMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getByUsername(sep3.g3.rightoversjava.grpc.generated.UserRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByUsernameMethod(), responseObserver);
    }

    /**
     */
    public void register(sep3.g3.rightoversjava.grpc.generated.UserCreationRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void assignOpeningHours(sep3.g3.rightoversjava.grpc.generated.OpeningHoursRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignOpeningHoursMethod(), responseObserver);
    }

    /**
     */
    public void login(sep3.g3.rightoversjava.grpc.generated.UserLoginRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void getReservationsByUsername(sep3.g3.rightoversjava.grpc.generated.UserRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.ReservationMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReservationsByUsernameMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(sep3.g3.rightoversjava.grpc.generated.UserRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.Filler> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void getReportsAgainstUser(sep3.g3.rightoversjava.grpc.generated.UserRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.ReportMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReportsAgainstUserMethod(), responseObserver);
    }

    /**
     */
    public void getOpeningHours(sep3.g3.rightoversjava.grpc.generated.UserName request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.OpeningHoursResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOpeningHoursMethod(), responseObserver);
    }

    /**
     */
    public void changeFirstName(sep3.g3.rightoversjava.grpc.generated.ChangeFirstNameRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeFirstNameMethod(), responseObserver);
    }

    /**
     */
    public void changePassword(sep3.g3.rightoversjava.grpc.generated.ChangePasswordRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangePasswordMethod(), responseObserver);
    }

    /**
     */
    public void changeAddress(sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeAddressMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetByUsernameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.UserRequest,
                sep3.g3.rightoversjava.grpc.generated.UserMessage>(
                  this, METHODID_GET_BY_USERNAME)))
          .addMethod(
            getRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.UserCreationRequest,
                sep3.g3.rightoversjava.grpc.generated.UserMessage>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getAssignOpeningHoursMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.OpeningHoursRequest,
                sep3.g3.rightoversjava.grpc.generated.UserMessage>(
                  this, METHODID_ASSIGN_OPENING_HOURS)))
          .addMethod(
            getLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.UserLoginRequest,
                sep3.g3.rightoversjava.grpc.generated.UserMessage>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getGetReservationsByUsernameMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.UserRequest,
                sep3.g3.rightoversjava.grpc.generated.ReservationMessage>(
                  this, METHODID_GET_RESERVATIONS_BY_USERNAME)))
          .addMethod(
            getDeleteUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.UserRequest,
                sep3.g3.rightoversjava.grpc.generated.Filler>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getGetReportsAgainstUserMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.UserRequest,
                sep3.g3.rightoversjava.grpc.generated.ReportMessage>(
                  this, METHODID_GET_REPORTS_AGAINST_USER)))
          .addMethod(
            getGetOpeningHoursMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.UserName,
                sep3.g3.rightoversjava.grpc.generated.OpeningHoursResponse>(
                  this, METHODID_GET_OPENING_HOURS)))
          .addMethod(
            getChangeFirstNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.ChangeFirstNameRequest,
                sep3.g3.rightoversjava.grpc.generated.UserMessage>(
                  this, METHODID_CHANGE_FIRST_NAME)))
          .addMethod(
            getChangePasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.ChangePasswordRequest,
                sep3.g3.rightoversjava.grpc.generated.UserMessage>(
                  this, METHODID_CHANGE_PASSWORD)))
          .addMethod(
            getChangeAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest,
                sep3.g3.rightoversjava.grpc.generated.UserMessage>(
                  this, METHODID_CHANGE_ADDRESS)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getByUsername(sep3.g3.rightoversjava.grpc.generated.UserRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void register(sep3.g3.rightoversjava.grpc.generated.UserCreationRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignOpeningHours(sep3.g3.rightoversjava.grpc.generated.OpeningHoursRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignOpeningHoursMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(sep3.g3.rightoversjava.grpc.generated.UserLoginRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReservationsByUsername(sep3.g3.rightoversjava.grpc.generated.UserRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.ReservationMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetReservationsByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(sep3.g3.rightoversjava.grpc.generated.UserRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.Filler> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReportsAgainstUser(sep3.g3.rightoversjava.grpc.generated.UserRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.ReportMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetReportsAgainstUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOpeningHours(sep3.g3.rightoversjava.grpc.generated.UserName request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.OpeningHoursResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOpeningHoursMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeFirstName(sep3.g3.rightoversjava.grpc.generated.ChangeFirstNameRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeFirstNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changePassword(sep3.g3.rightoversjava.grpc.generated.ChangePasswordRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeAddress(sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest request,
        io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeAddressMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.UserMessage getByUsername(sep3.g3.rightoversjava.grpc.generated.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.UserMessage register(sep3.g3.rightoversjava.grpc.generated.UserCreationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.UserMessage assignOpeningHours(sep3.g3.rightoversjava.grpc.generated.OpeningHoursRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignOpeningHoursMethod(), getCallOptions(), request);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.UserMessage login(sep3.g3.rightoversjava.grpc.generated.UserLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<sep3.g3.rightoversjava.grpc.generated.ReservationMessage> getReservationsByUsername(
        sep3.g3.rightoversjava.grpc.generated.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetReservationsByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.Filler deleteUser(sep3.g3.rightoversjava.grpc.generated.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<sep3.g3.rightoversjava.grpc.generated.ReportMessage> getReportsAgainstUser(
        sep3.g3.rightoversjava.grpc.generated.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetReportsAgainstUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.OpeningHoursResponse getOpeningHours(sep3.g3.rightoversjava.grpc.generated.UserName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOpeningHoursMethod(), getCallOptions(), request);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.UserMessage changeFirstName(sep3.g3.rightoversjava.grpc.generated.ChangeFirstNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeFirstNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.UserMessage changePassword(sep3.g3.rightoversjava.grpc.generated.ChangePasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangePasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public sep3.g3.rightoversjava.grpc.generated.UserMessage changeAddress(sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeAddressMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.UserMessage> getByUsername(
        sep3.g3.rightoversjava.grpc.generated.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByUsernameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.UserMessage> register(
        sep3.g3.rightoversjava.grpc.generated.UserCreationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.UserMessage> assignOpeningHours(
        sep3.g3.rightoversjava.grpc.generated.OpeningHoursRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignOpeningHoursMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.UserMessage> login(
        sep3.g3.rightoversjava.grpc.generated.UserLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.Filler> deleteUser(
        sep3.g3.rightoversjava.grpc.generated.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.OpeningHoursResponse> getOpeningHours(
        sep3.g3.rightoversjava.grpc.generated.UserName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOpeningHoursMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.UserMessage> changeFirstName(
        sep3.g3.rightoversjava.grpc.generated.ChangeFirstNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeFirstNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.UserMessage> changePassword(
        sep3.g3.rightoversjava.grpc.generated.ChangePasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangePasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.g3.rightoversjava.grpc.generated.UserMessage> changeAddress(
        sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeAddressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BY_USERNAME = 0;
  private static final int METHODID_REGISTER = 1;
  private static final int METHODID_ASSIGN_OPENING_HOURS = 2;
  private static final int METHODID_LOGIN = 3;
  private static final int METHODID_GET_RESERVATIONS_BY_USERNAME = 4;
  private static final int METHODID_DELETE_USER = 5;
  private static final int METHODID_GET_REPORTS_AGAINST_USER = 6;
  private static final int METHODID_GET_OPENING_HOURS = 7;
  private static final int METHODID_CHANGE_FIRST_NAME = 8;
  private static final int METHODID_CHANGE_PASSWORD = 9;
  private static final int METHODID_CHANGE_ADDRESS = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BY_USERNAME:
          serviceImpl.getByUsername((sep3.g3.rightoversjava.grpc.generated.UserRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage>) responseObserver);
          break;
        case METHODID_REGISTER:
          serviceImpl.register((sep3.g3.rightoversjava.grpc.generated.UserCreationRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage>) responseObserver);
          break;
        case METHODID_ASSIGN_OPENING_HOURS:
          serviceImpl.assignOpeningHours((sep3.g3.rightoversjava.grpc.generated.OpeningHoursRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((sep3.g3.rightoversjava.grpc.generated.UserLoginRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage>) responseObserver);
          break;
        case METHODID_GET_RESERVATIONS_BY_USERNAME:
          serviceImpl.getReservationsByUsername((sep3.g3.rightoversjava.grpc.generated.UserRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.ReservationMessage>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((sep3.g3.rightoversjava.grpc.generated.UserRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.Filler>) responseObserver);
          break;
        case METHODID_GET_REPORTS_AGAINST_USER:
          serviceImpl.getReportsAgainstUser((sep3.g3.rightoversjava.grpc.generated.UserRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.ReportMessage>) responseObserver);
          break;
        case METHODID_GET_OPENING_HOURS:
          serviceImpl.getOpeningHours((sep3.g3.rightoversjava.grpc.generated.UserName) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.OpeningHoursResponse>) responseObserver);
          break;
        case METHODID_CHANGE_FIRST_NAME:
          serviceImpl.changeFirstName((sep3.g3.rightoversjava.grpc.generated.ChangeFirstNameRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage>) responseObserver);
          break;
        case METHODID_CHANGE_PASSWORD:
          serviceImpl.changePassword((sep3.g3.rightoversjava.grpc.generated.ChangePasswordRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage>) responseObserver);
          break;
        case METHODID_CHANGE_ADDRESS:
          serviceImpl.changeAddress((sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest) request,
              (io.grpc.stub.StreamObserver<sep3.g3.rightoversjava.grpc.generated.UserMessage>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sep3.g3.rightoversjava.grpc.generated.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetByUsernameMethod())
              .addMethod(getRegisterMethod())
              .addMethod(getAssignOpeningHoursMethod())
              .addMethod(getLoginMethod())
              .addMethod(getGetReservationsByUsernameMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getGetReportsAgainstUserMethod())
              .addMethod(getGetOpeningHoursMethod())
              .addMethod(getChangeFirstNameMethod())
              .addMethod(getChangePasswordMethod())
              .addMethod(getChangeAddressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
