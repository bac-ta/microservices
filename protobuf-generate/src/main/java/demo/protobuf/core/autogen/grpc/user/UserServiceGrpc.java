package demo.protobuf.core.autogen.grpc.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.1)",
    comments = "Source: user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "user.UserService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFetchUsersMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      demo.protobuf.core.autogen.grpc.user.UserResponses> METHOD_FETCH_USERS = getFetchUsersMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      demo.protobuf.core.autogen.grpc.user.UserResponses> getFetchUsersMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      demo.protobuf.core.autogen.grpc.user.UserResponses> getFetchUsersMethod() {
    return getFetchUsersMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      demo.protobuf.core.autogen.grpc.user.UserResponses> getFetchUsersMethodHelper() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, demo.protobuf.core.autogen.grpc.user.UserResponses> getFetchUsersMethod;
    if ((getFetchUsersMethod = UserServiceGrpc.getFetchUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFetchUsersMethod = UserServiceGrpc.getFetchUsersMethod) == null) {
          UserServiceGrpc.getFetchUsersMethod = getFetchUsersMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, demo.protobuf.core.autogen.grpc.user.UserResponses>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.UserService", "fetchUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.protobuf.core.autogen.grpc.user.UserResponses.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("fetchUsers"))
                  .build();
          }
        }
     }
     return getFetchUsersMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFetchUserByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<demo.protobuf.core.autogen.grpc.user.FetchUserByIdRequest,
      demo.protobuf.core.autogen.grpc.user.User> METHOD_FETCH_USER_BY_ID = getFetchUserByIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<demo.protobuf.core.autogen.grpc.user.FetchUserByIdRequest,
      demo.protobuf.core.autogen.grpc.user.User> getFetchUserByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<demo.protobuf.core.autogen.grpc.user.FetchUserByIdRequest,
      demo.protobuf.core.autogen.grpc.user.User> getFetchUserByIdMethod() {
    return getFetchUserByIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<demo.protobuf.core.autogen.grpc.user.FetchUserByIdRequest,
      demo.protobuf.core.autogen.grpc.user.User> getFetchUserByIdMethodHelper() {
    io.grpc.MethodDescriptor<demo.protobuf.core.autogen.grpc.user.FetchUserByIdRequest, demo.protobuf.core.autogen.grpc.user.User> getFetchUserByIdMethod;
    if ((getFetchUserByIdMethod = UserServiceGrpc.getFetchUserByIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFetchUserByIdMethod = UserServiceGrpc.getFetchUserByIdMethod) == null) {
          UserServiceGrpc.getFetchUserByIdMethod = getFetchUserByIdMethod = 
              io.grpc.MethodDescriptor.<demo.protobuf.core.autogen.grpc.user.FetchUserByIdRequest, demo.protobuf.core.autogen.grpc.user.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.UserService", "fetchUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.protobuf.core.autogen.grpc.user.FetchUserByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.protobuf.core.autogen.grpc.user.User.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("fetchUserById"))
                  .build();
          }
        }
     }
     return getFetchUserByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFetchUserByDepartmentIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest,
      demo.protobuf.core.autogen.grpc.user.UserResponses> METHOD_FETCH_USER_BY_DEPARTMENT_ID = getFetchUserByDepartmentIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest,
      demo.protobuf.core.autogen.grpc.user.UserResponses> getFetchUserByDepartmentIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest,
      demo.protobuf.core.autogen.grpc.user.UserResponses> getFetchUserByDepartmentIdMethod() {
    return getFetchUserByDepartmentIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest,
      demo.protobuf.core.autogen.grpc.user.UserResponses> getFetchUserByDepartmentIdMethodHelper() {
    io.grpc.MethodDescriptor<demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest, demo.protobuf.core.autogen.grpc.user.UserResponses> getFetchUserByDepartmentIdMethod;
    if ((getFetchUserByDepartmentIdMethod = UserServiceGrpc.getFetchUserByDepartmentIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFetchUserByDepartmentIdMethod = UserServiceGrpc.getFetchUserByDepartmentIdMethod) == null) {
          UserServiceGrpc.getFetchUserByDepartmentIdMethod = getFetchUserByDepartmentIdMethod = 
              io.grpc.MethodDescriptor.<demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest, demo.protobuf.core.autogen.grpc.user.UserResponses>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.UserService", "fetchUserByDepartmentId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.protobuf.core.autogen.grpc.user.UserResponses.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("fetchUserByDepartmentId"))
                  .build();
          }
        }
     }
     return getFetchUserByDepartmentIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the factory
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the factory
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the factory
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void fetchUsers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<demo.protobuf.core.autogen.grpc.user.UserResponses> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchUsersMethodHelper(), responseObserver);
    }

    /**
     */
    public void fetchUserById(demo.protobuf.core.autogen.grpc.user.FetchUserByIdRequest request,
        io.grpc.stub.StreamObserver<demo.protobuf.core.autogen.grpc.user.User> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchUserByIdMethodHelper(), responseObserver);
    }

    /**
     */
    public void fetchUserByDepartmentId(demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest request,
        io.grpc.stub.StreamObserver<demo.protobuf.core.autogen.grpc.user.UserResponses> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchUserByDepartmentIdMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFetchUsersMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                demo.protobuf.core.autogen.grpc.user.UserResponses>(
                  this, METHODID_FETCH_USERS)))
          .addMethod(
            getFetchUserByIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                demo.protobuf.core.autogen.grpc.user.FetchUserByIdRequest,
                demo.protobuf.core.autogen.grpc.user.User>(
                  this, METHODID_FETCH_USER_BY_ID)))
          .addMethod(
            getFetchUserByDepartmentIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest,
                demo.protobuf.core.autogen.grpc.user.UserResponses>(
                  this, METHODID_FETCH_USER_BY_DEPARTMENT_ID)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void fetchUsers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<demo.protobuf.core.autogen.grpc.user.UserResponses> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchUsersMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchUserById(demo.protobuf.core.autogen.grpc.user.FetchUserByIdRequest request,
        io.grpc.stub.StreamObserver<demo.protobuf.core.autogen.grpc.user.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchUserByIdMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchUserByDepartmentId(demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest request,
        io.grpc.stub.StreamObserver<demo.protobuf.core.autogen.grpc.user.UserResponses> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchUserByDepartmentIdMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public demo.protobuf.core.autogen.grpc.user.UserResponses fetchUsers(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getFetchUsersMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public demo.protobuf.core.autogen.grpc.user.User fetchUserById(demo.protobuf.core.autogen.grpc.user.FetchUserByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchUserByIdMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public demo.protobuf.core.autogen.grpc.user.UserResponses fetchUserByDepartmentId(demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchUserByDepartmentIdMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<demo.protobuf.core.autogen.grpc.user.UserResponses> fetchUsers(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchUsersMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<demo.protobuf.core.autogen.grpc.user.User> fetchUserById(
        demo.protobuf.core.autogen.grpc.user.FetchUserByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchUserByIdMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<demo.protobuf.core.autogen.grpc.user.UserResponses> fetchUserByDepartmentId(
        demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchUserByDepartmentIdMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_USERS = 0;
  private static final int METHODID_FETCH_USER_BY_ID = 1;
  private static final int METHODID_FETCH_USER_BY_DEPARTMENT_ID = 2;

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
        case METHODID_FETCH_USERS:
          serviceImpl.fetchUsers((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<demo.protobuf.core.autogen.grpc.user.UserResponses>) responseObserver);
          break;
        case METHODID_FETCH_USER_BY_ID:
          serviceImpl.fetchUserById((demo.protobuf.core.autogen.grpc.user.FetchUserByIdRequest) request,
              (io.grpc.stub.StreamObserver<demo.protobuf.core.autogen.grpc.user.User>) responseObserver);
          break;
        case METHODID_FETCH_USER_BY_DEPARTMENT_ID:
          serviceImpl.fetchUserByDepartmentId((demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest) request,
              (io.grpc.stub.StreamObserver<demo.protobuf.core.autogen.grpc.user.UserResponses>) responseObserver);
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
      return demo.protobuf.core.autogen.grpc.user.UserOuterClass.getDescriptor();
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
              .addMethod(getFetchUsersMethodHelper())
              .addMethod(getFetchUserByIdMethodHelper())
              .addMethod(getFetchUserByDepartmentIdMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
