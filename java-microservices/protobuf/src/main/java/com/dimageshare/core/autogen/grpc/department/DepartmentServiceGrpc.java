package com.dimageshare.core.autogen.grpc.department;

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
    comments = "Source: department.proto")
public final class DepartmentServiceGrpc {

  private DepartmentServiceGrpc() {}

  public static final String SERVICE_NAME = "department.DepartmentService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindDepartmentsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.dimageshare.core.autogen.grpc.department.DepartmentResponses> METHOD_FIND_DEPARTMENTS = getFindDepartmentsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.dimageshare.core.autogen.grpc.department.DepartmentResponses> getFindDepartmentsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.dimageshare.core.autogen.grpc.department.DepartmentResponses> getFindDepartmentsMethod() {
    return getFindDepartmentsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.dimageshare.core.autogen.grpc.department.DepartmentResponses> getFindDepartmentsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.dimageshare.core.autogen.grpc.department.DepartmentResponses> getFindDepartmentsMethod;
    if ((getFindDepartmentsMethod = DepartmentServiceGrpc.getFindDepartmentsMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getFindDepartmentsMethod = DepartmentServiceGrpc.getFindDepartmentsMethod) == null) {
          DepartmentServiceGrpc.getFindDepartmentsMethod = getFindDepartmentsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.dimageshare.core.autogen.grpc.department.DepartmentResponses>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "department.DepartmentService", "findDepartments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dimageshare.core.autogen.grpc.department.DepartmentResponses.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("findDepartments"))
                  .build();
          }
        }
     }
     return getFindDepartmentsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindDepartmentByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest,
      com.dimageshare.core.autogen.grpc.department.Department> METHOD_FIND_DEPARTMENT_BY_ID = getFindDepartmentByIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest,
      com.dimageshare.core.autogen.grpc.department.Department> getFindDepartmentByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest,
      com.dimageshare.core.autogen.grpc.department.Department> getFindDepartmentByIdMethod() {
    return getFindDepartmentByIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest,
      com.dimageshare.core.autogen.grpc.department.Department> getFindDepartmentByIdMethodHelper() {
    io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest, com.dimageshare.core.autogen.grpc.department.Department> getFindDepartmentByIdMethod;
    if ((getFindDepartmentByIdMethod = DepartmentServiceGrpc.getFindDepartmentByIdMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getFindDepartmentByIdMethod = DepartmentServiceGrpc.getFindDepartmentByIdMethod) == null) {
          DepartmentServiceGrpc.getFindDepartmentByIdMethod = getFindDepartmentByIdMethod = 
              io.grpc.MethodDescriptor.<com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest, com.dimageshare.core.autogen.grpc.department.Department>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "department.DepartmentService", "findDepartmentById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dimageshare.core.autogen.grpc.department.Department.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("findDepartmentById"))
                  .build();
          }
        }
     }
     return getFindDepartmentByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSaveDepartmentMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.department.DepartmentSaving,
      com.google.protobuf.Empty> METHOD_SAVE_DEPARTMENT = getSaveDepartmentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.department.DepartmentSaving,
      com.google.protobuf.Empty> getSaveDepartmentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.department.DepartmentSaving,
      com.google.protobuf.Empty> getSaveDepartmentMethod() {
    return getSaveDepartmentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.department.DepartmentSaving,
      com.google.protobuf.Empty> getSaveDepartmentMethodHelper() {
    io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.department.DepartmentSaving, com.google.protobuf.Empty> getSaveDepartmentMethod;
    if ((getSaveDepartmentMethod = DepartmentServiceGrpc.getSaveDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getSaveDepartmentMethod = DepartmentServiceGrpc.getSaveDepartmentMethod) == null) {
          DepartmentServiceGrpc.getSaveDepartmentMethod = getSaveDepartmentMethod = 
              io.grpc.MethodDescriptor.<com.dimageshare.core.autogen.grpc.department.DepartmentSaving, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "department.DepartmentService", "saveDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dimageshare.core.autogen.grpc.department.DepartmentSaving.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("saveDepartment"))
                  .build();
          }
        }
     }
     return getSaveDepartmentMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRemoveDepartmentByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest,
      com.google.protobuf.Empty> METHOD_REMOVE_DEPARTMENT_BY_ID = getRemoveDepartmentByIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest,
      com.google.protobuf.Empty> getRemoveDepartmentByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest,
      com.google.protobuf.Empty> getRemoveDepartmentByIdMethod() {
    return getRemoveDepartmentByIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest,
      com.google.protobuf.Empty> getRemoveDepartmentByIdMethodHelper() {
    io.grpc.MethodDescriptor<com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest, com.google.protobuf.Empty> getRemoveDepartmentByIdMethod;
    if ((getRemoveDepartmentByIdMethod = DepartmentServiceGrpc.getRemoveDepartmentByIdMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getRemoveDepartmentByIdMethod = DepartmentServiceGrpc.getRemoveDepartmentByIdMethod) == null) {
          DepartmentServiceGrpc.getRemoveDepartmentByIdMethod = getRemoveDepartmentByIdMethod = 
              io.grpc.MethodDescriptor.<com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "department.DepartmentService", "removeDepartmentById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("removeDepartmentById"))
                  .build();
          }
        }
     }
     return getRemoveDepartmentByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DepartmentServiceStub newStub(io.grpc.Channel channel) {
    return new DepartmentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DepartmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DepartmentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DepartmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DepartmentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DepartmentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findDepartments(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.department.DepartmentResponses> responseObserver) {
      asyncUnimplementedUnaryCall(getFindDepartmentsMethodHelper(), responseObserver);
    }

    /**
     */
    public void findDepartmentById(com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest request,
        io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.department.Department> responseObserver) {
      asyncUnimplementedUnaryCall(getFindDepartmentByIdMethodHelper(), responseObserver);
    }

    /**
     */
    public void saveDepartment(com.dimageshare.core.autogen.grpc.department.DepartmentSaving request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveDepartmentMethodHelper(), responseObserver);
    }

    /**
     */
    public void removeDepartmentById(com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveDepartmentByIdMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindDepartmentsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.dimageshare.core.autogen.grpc.department.DepartmentResponses>(
                  this, METHODID_FIND_DEPARTMENTS)))
          .addMethod(
            getFindDepartmentByIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest,
                com.dimageshare.core.autogen.grpc.department.Department>(
                  this, METHODID_FIND_DEPARTMENT_BY_ID)))
          .addMethod(
            getSaveDepartmentMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dimageshare.core.autogen.grpc.department.DepartmentSaving,
                com.google.protobuf.Empty>(
                  this, METHODID_SAVE_DEPARTMENT)))
          .addMethod(
            getRemoveDepartmentByIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REMOVE_DEPARTMENT_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class DepartmentServiceStub extends io.grpc.stub.AbstractStub<DepartmentServiceStub> {
    private DepartmentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartmentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartmentServiceStub(channel, callOptions);
    }

    /**
     */
    public void findDepartments(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.department.DepartmentResponses> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindDepartmentsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findDepartmentById(com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest request,
        io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.department.Department> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindDepartmentByIdMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveDepartment(com.dimageshare.core.autogen.grpc.department.DepartmentSaving request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveDepartmentMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeDepartmentById(com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveDepartmentByIdMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DepartmentServiceBlockingStub extends io.grpc.stub.AbstractStub<DepartmentServiceBlockingStub> {
    private DepartmentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartmentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartmentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dimageshare.core.autogen.grpc.department.DepartmentResponses findDepartments(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getFindDepartmentsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.dimageshare.core.autogen.grpc.department.Department findDepartmentById(com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindDepartmentByIdMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty saveDepartment(com.dimageshare.core.autogen.grpc.department.DepartmentSaving request) {
      return blockingUnaryCall(
          getChannel(), getSaveDepartmentMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty removeDepartmentById(com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveDepartmentByIdMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DepartmentServiceFutureStub extends io.grpc.stub.AbstractStub<DepartmentServiceFutureStub> {
    private DepartmentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartmentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartmentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dimageshare.core.autogen.grpc.department.DepartmentResponses> findDepartments(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getFindDepartmentsMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dimageshare.core.autogen.grpc.department.Department> findDepartmentById(
        com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindDepartmentByIdMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> saveDepartment(
        com.dimageshare.core.autogen.grpc.department.DepartmentSaving request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveDepartmentMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removeDepartmentById(
        com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveDepartmentByIdMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_DEPARTMENTS = 0;
  private static final int METHODID_FIND_DEPARTMENT_BY_ID = 1;
  private static final int METHODID_SAVE_DEPARTMENT = 2;
  private static final int METHODID_REMOVE_DEPARTMENT_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DepartmentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DepartmentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_DEPARTMENTS:
          serviceImpl.findDepartments((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.department.DepartmentResponses>) responseObserver);
          break;
        case METHODID_FIND_DEPARTMENT_BY_ID:
          serviceImpl.findDepartmentById((com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest) request,
              (io.grpc.stub.StreamObserver<com.dimageshare.core.autogen.grpc.department.Department>) responseObserver);
          break;
        case METHODID_SAVE_DEPARTMENT:
          serviceImpl.saveDepartment((com.dimageshare.core.autogen.grpc.department.DepartmentSaving) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REMOVE_DEPARTMENT_BY_ID:
          serviceImpl.removeDepartmentById((com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest) request,
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

  private static abstract class DepartmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DepartmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dimageshare.core.autogen.grpc.department.DepartmentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DepartmentService");
    }
  }

  private static final class DepartmentServiceFileDescriptorSupplier
      extends DepartmentServiceBaseDescriptorSupplier {
    DepartmentServiceFileDescriptorSupplier() {}
  }

  private static final class DepartmentServiceMethodDescriptorSupplier
      extends DepartmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DepartmentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DepartmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DepartmentServiceFileDescriptorSupplier())
              .addMethod(getFindDepartmentsMethodHelper())
              .addMethod(getFindDepartmentByIdMethodHelper())
              .addMethod(getSaveDepartmentMethodHelper())
              .addMethod(getRemoveDepartmentByIdMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
