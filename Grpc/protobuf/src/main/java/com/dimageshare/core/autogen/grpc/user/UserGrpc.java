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
public final class UserGrpc {

  private UserGrpc() {}

  public static final String SERVICE_NAME = "user.User";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetSumMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.GetSumRequest,
      com.dimageshare.core.autogen.grpc.user.GetSumResponse> METHOD_GET_SUM = getGetSumMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.GetSumRequest,
      com.dimageshare.core.autogen.grpc.user.GetSumResponse> getGetSumMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.GetSumRequest,
      com.dimageshare.core.autogen.grpc.user.GetSumResponse> getGetSumMethod() {
    return getGetSumMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.GetSumRequest,
      com.dimageshare.core.autogen.grpc.user.GetSumResponse> getGetSumMethodHelper() {
    io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.user.GetSumRequest, com.dimageshare.core.autogen.grpc.user.GetSumResponse> getGetSumMethod;
    if ((getGetSumMethod = UserGrpc.getGetSumMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getGetSumMethod = UserGrpc.getGetSumMethod) == null) {
          UserGrpc.getGetSumMethod = getGetSumMethod = 
              io.grpc.MethodDescriptor.<com.dimageshare.core.autogen.grpc.user.GetSumRequest, com.dimageshare.core.autogen.grpc.user.GetSumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.User", "GetSum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dimageshare.core.autogen.grpc.user.GetSumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dimageshare.core.autogen.grpc.user.GetSumResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("GetSum"))
                  .build();
          }
        }
     }
     return getGetSumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    return new UserStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserFutureStub(channel);
  }

  /**
   */
  public static abstract class UserImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSum(com.dimageshare.core.autogen.grpc.user.GetSumRequest request,
        io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.user.GetSumResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSumMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSumMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dimageshare.core.autogen.grpc.user.GetSumRequest,
                com.dimageshare.core.autogen.grpc.user.GetSumResponse>(
                  this, METHODID_GET_SUM)))
          .build();
    }
  }

  /**
   */
  public static final class UserStub extends io.grpc.stub.AbstractStub<UserStub> {
    private UserStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
    }

    /**
     */
    public void getSum(com.dimageshare.core.autogen.grpc.user.GetSumRequest request,
        io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.user.GetSumResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSumMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserBlockingStub extends io.grpc.stub.AbstractStub<UserBlockingStub> {
    private UserBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dimageshare.core.autogen.grpc.user.GetSumResponse getSum(com.dimageshare.core.autogen.grpc.user.GetSumRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSumMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserFutureStub extends io.grpc.stub.AbstractStub<UserFutureStub> {
    private UserFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dimageshare.core.autogen.grpc.user.GetSumResponse> getSum(
        com.dimageshare.core.autogen.grpc.user.GetSumRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSumMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SUM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SUM:
          serviceImpl.getSum((com.dimageshare.core.autogen.grpc.user.GetSumRequest) request,
              (io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.user.GetSumResponse>) responseObserver);
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

  private static abstract class UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dimageshare.core.autogen.grpc.user.UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("User");
    }
  }

  private static final class UserFileDescriptorSupplier
      extends UserBaseDescriptorSupplier {
    UserFileDescriptorSupplier() {}
  }

  private static final class UserMethodDescriptorSupplier
      extends UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserFileDescriptorSupplier())
              .addMethod(getGetSumMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
