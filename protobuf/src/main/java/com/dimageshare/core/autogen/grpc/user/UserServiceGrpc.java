package com.dimageshare.core.autogen.grpc.user;

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
  @java.lang.Deprecated // Use {@link #getFindUsersMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.dimageshare.core.autogen.grpc.user.UserResponses> METHOD_FIND_USERS = getFindUsersMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.dimageshare.core.autogen.grpc.user.UserResponses> getFindUsersMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.dimageshare.core.autogen.grpc.user.UserResponses> getFindUsersMethod() {
    return getFindUsersMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.dimageshare.core.autogen.grpc.user.UserResponses> getFindUsersMethodHelper() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.dimageshare.core.autogen.grpc.user.UserResponses> getFindUsersMethod;
    if ((getFindUsersMethod = UserServiceGrpc.getFindUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindUsersMethod = UserServiceGrpc.getFindUsersMethod) == null) {
          UserServiceGrpc.getFindUsersMethod = getFindUsersMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.dimageshare.core.autogen.grpc.user.UserResponses>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.UserService", "findUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dimageshare.core.autogen.grpc.user.UserResponses.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("findUsers"))
                  .build();
          }
        }
     }
     return getFindUsersMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindUserByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.UserIdRequest,
      com.dimageshare.core.autogen.grpc.user.User> METHOD_FIND_USER_BY_ID = getFindUserByIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.UserIdRequest,
      com.dimageshare.core.autogen.grpc.user.User> getFindUserByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.UserIdRequest,
      com.dimageshare.core.autogen.grpc.user.User> getFindUserByIdMethod() {
    return getFindUserByIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.UserIdRequest,
      com.dimageshare.core.autogen.grpc.user.User> getFindUserByIdMethodHelper() {
    io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.UserIdRequest, com.dimageshare.core.autogen.grpc.user.User> getFindUserByIdMethod;
    if ((getFindUserByIdMethod = UserServiceGrpc.getFindUserByIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindUserByIdMethod = UserServiceGrpc.getFindUserByIdMethod) == null) {
          UserServiceGrpc.getFindUserByIdMethod = getFindUserByIdMethod = 
              io.grpc.MethodDescriptor.<com.dimageshare.core.autogen.grpc.user.UserIdRequest, com.dimageshare.core.autogen.grpc.user.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.UserService", "findUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dimageshare.core.autogen.grpc.user.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dimageshare.core.autogen.grpc.user.User.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("findUserById"))
                  .build();
          }
        }
     }
     return getFindUserByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindUserByDepartmentIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.DepartmentIdRequest,
      com.dimageshare.core.autogen.grpc.user.UserResponses> METHOD_FIND_USER_BY_DEPARTMENT_ID = getFindUserByDepartmentIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.DepartmentIdRequest,
      com.dimageshare.core.autogen.grpc.user.UserResponses> getFindUserByDepartmentIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.DepartmentIdRequest,
      com.dimageshare.core.autogen.grpc.user.UserResponses> getFindUserByDepartmentIdMethod() {
    return getFindUserByDepartmentIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.DepartmentIdRequest,
      com.dimageshare.core.autogen.grpc.user.UserResponses> getFindUserByDepartmentIdMethodHelper() {
    io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.DepartmentIdRequest, com.dimageshare.core.autogen.grpc.user.UserResponses> getFindUserByDepartmentIdMethod;
    if ((getFindUserByDepartmentIdMethod = UserServiceGrpc.getFindUserByDepartmentIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindUserByDepartmentIdMethod = UserServiceGrpc.getFindUserByDepartmentIdMethod) == null) {
          UserServiceGrpc.getFindUserByDepartmentIdMethod = getFindUserByDepartmentIdMethod = 
              io.grpc.MethodDescriptor.<com.dimageshare.core.autogen.grpc.user.DepartmentIdRequest, com.dimageshare.core.autogen.grpc.user.UserResponses>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.UserService", "findUserByDepartmentId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dimageshare.core.autogen.grpc.user.DepartmentIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dimageshare.core.autogen.grpc.user.UserResponses.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("findUserByDepartmentId"))
                  .build();
          }
        }
     }
     return getFindUserByDepartmentIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSaveUserMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.UserSaving,
      com.google.protobuf.Empty> METHOD_SAVE_USER = getSaveUserMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.UserSaving,
      com.google.protobuf.Empty> getSaveUserMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.UserSaving,
      com.google.protobuf.Empty> getSaveUserMethod() {
    return getSaveUserMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.UserSaving,
      com.google.protobuf.Empty> getSaveUserMethodHelper() {
    io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.UserSaving, com.google.protobuf.Empty> getSaveUserMethod;
    if ((getSaveUserMethod = UserServiceGrpc.getSaveUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSaveUserMethod = UserServiceGrpc.getSaveUserMethod) == null) {
          UserServiceGrpc.getSaveUserMethod = getSaveUserMethod = 
              io.grpc.MethodDescriptor.<com.dimageshare.core.autogen.grpc.user.UserSaving, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.UserService", "saveUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dimageshare.core.autogen.grpc.user.UserSaving.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("saveUser"))
                  .build();
          }
        }
     }
     return getSaveUserMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRemoveUserByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.UserIdRequest,
      com.google.protobuf.Empty> METHOD_REMOVE_USER_BY_ID = getRemoveUserByIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.UserIdRequest,
      com.google.protobuf.Empty> getRemoveUserByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.UserIdRequest,
      com.google.protobuf.Empty> getRemoveUserByIdMethod() {
    return getRemoveUserByIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.UserIdRequest,
      com.google.protobuf.Empty> getRemoveUserByIdMethodHelper() {
    io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.UserIdRequest, com.google.protobuf.Empty> getRemoveUserByIdMethod;
    if ((getRemoveUserByIdMethod = UserServiceGrpc.getRemoveUserByIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRemoveUserByIdMethod = UserServiceGrpc.getRemoveUserByIdMethod) == null) {
          UserServiceGrpc.getRemoveUserByIdMethod = getRemoveUserByIdMethod = 
              io.grpc.MethodDescriptor.<com.dimageshare.core.autogen.grpc.user.UserIdRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.UserService", "removeUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dimageshare.core.autogen.grpc.user.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("removeUserById"))
                  .build();
          }
        }
     }
     return getRemoveUserByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
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
    public void findUsers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.user.UserResponses> responseObserver) {
      asyncUnimplementedUnaryCall(getFindUsersMethodHelper(), responseObserver);
    }

    /**
     */
    public void findUserById(com.dimageshare.core.autogen.grpc.user.UserIdRequest request,
        io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.user.User> responseObserver) {
      asyncUnimplementedUnaryCall(getFindUserByIdMethodHelper(), responseObserver);
    }

    /**
     */
    public void findUserByDepartmentId(com.dimageshare.core.autogen.grpc.user.DepartmentIdRequest request,
        io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.user.UserResponses> responseObserver) {
      asyncUnimplementedUnaryCall(getFindUserByDepartmentIdMethodHelper(), responseObserver);
    }

    /**
     */
    public void saveUser(com.dimageshare.core.autogen.grpc.user.UserSaving request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveUserMethodHelper(), responseObserver);
    }

    /**
     */
    public void removeUserById(com.dimageshare.core.autogen.grpc.user.UserIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveUserByIdMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindUsersMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.dimageshare.core.autogen.grpc.user.UserResponses>(
                  this, METHODID_FIND_USERS)))
          .addMethod(
            getFindUserByIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dimageshare.core.autogen.grpc.user.UserIdRequest,
                com.dimageshare.core.autogen.grpc.user.User>(
                  this, METHODID_FIND_USER_BY_ID)))
          .addMethod(
            getFindUserByDepartmentIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dimageshare.core.autogen.grpc.user.DepartmentIdRequest,
                com.dimageshare.core.autogen.grpc.user.UserResponses>(
                  this, METHODID_FIND_USER_BY_DEPARTMENT_ID)))
          .addMethod(
            getSaveUserMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dimageshare.core.autogen.grpc.user.UserSaving,
                com.google.protobuf.Empty>(
                  this, METHODID_SAVE_USER)))
          .addMethod(
            getRemoveUserByIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dimageshare.core.autogen.grpc.user.UserIdRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REMOVE_USER_BY_ID)))
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
    public void findUsers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.user.UserResponses> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindUsersMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findUserById(com.dimageshare.core.autogen.grpc.user.UserIdRequest request,
        io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.user.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindUserByIdMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findUserByDepartmentId(com.dimageshare.core.autogen.grpc.user.DepartmentIdRequest request,
        io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.user.UserResponses> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindUserByDepartmentIdMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveUser(com.dimageshare.core.autogen.grpc.user.UserSaving request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveUserMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUserById(com.dimageshare.core.autogen.grpc.user.UserIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveUserByIdMethodHelper(), getCallOptions()), request, responseObserver);
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
    public com.dimageshare.core.autogen.grpc.user.UserResponses findUsers(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getFindUsersMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.dimageshare.core.autogen.grpc.user.User findUserById(com.dimageshare.core.autogen.grpc.user.UserIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindUserByIdMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.dimageshare.core.autogen.grpc.user.UserResponses findUserByDepartmentId(com.dimageshare.core.autogen.grpc.user.DepartmentIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindUserByDepartmentIdMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty saveUser(com.dimageshare.core.autogen.grpc.user.UserSaving request) {
      return blockingUnaryCall(
          getChannel(), getSaveUserMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty removeUserById(com.dimageshare.core.autogen.grpc.user.UserIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveUserByIdMethodHelper(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.dimageshare.core.autogen.grpc.user.UserResponses> findUsers(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getFindUsersMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dimageshare.core.autogen.grpc.user.User> findUserById(
        com.dimageshare.core.autogen.grpc.user.UserIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindUserByIdMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dimageshare.core.autogen.grpc.user.UserResponses> findUserByDepartmentId(
        com.dimageshare.core.autogen.grpc.user.DepartmentIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindUserByDepartmentIdMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> saveUser(
        com.dimageshare.core.autogen.grpc.user.UserSaving request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveUserMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removeUserById(
        com.dimageshare.core.autogen.grpc.user.UserIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveUserByIdMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_USERS = 0;
  private static final int METHODID_FIND_USER_BY_ID = 1;
  private static final int METHODID_FIND_USER_BY_DEPARTMENT_ID = 2;
  private static final int METHODID_SAVE_USER = 3;
  private static final int METHODID_REMOVE_USER_BY_ID = 4;

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
        case METHODID_FIND_USERS:
          serviceImpl.findUsers((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.user.UserResponses>) responseObserver);
          break;
        case METHODID_FIND_USER_BY_ID:
          serviceImpl.findUserById((com.dimageshare.core.autogen.grpc.user.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.user.User>) responseObserver);
          break;
        case METHODID_FIND_USER_BY_DEPARTMENT_ID:
          serviceImpl.findUserByDepartmentId((com.dimageshare.core.autogen.grpc.user.DepartmentIdRequest) request,
              (io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.user.UserResponses>) responseObserver);
          break;
        case METHODID_SAVE_USER:
          serviceImpl.saveUser((com.dimageshare.core.autogen.grpc.user.UserSaving) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REMOVE_USER_BY_ID:
          serviceImpl.removeUserById((com.dimageshare.core.autogen.grpc.user.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
      return com.dimageshare.core.autogen.grpc.user.UserOuterClass.getDescriptor();
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
              .addMethod(getFindUsersMethodHelper())
              .addMethod(getFindUserByIdMethodHelper())
              .addMethod(getFindUserByDepartmentIdMethodHelper())
              .addMethod(getSaveUserMethodHelper())
              .addMethod(getRemoveUserByIdMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
