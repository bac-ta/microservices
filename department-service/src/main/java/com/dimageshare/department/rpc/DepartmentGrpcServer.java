package com.dimageshare.department.rpc;

import com.dimageshare.department.service.DepartmentService;
import com.dimageshare.protobuf.core.autogen.rpc.department.Department;
import com.dimageshare.protobuf.core.autogen.rpc.department.DepartmentIdRequest;
import com.dimageshare.protobuf.core.autogen.rpc.department.DepartmentResponses;
import com.dimageshare.protobuf.core.autogen.rpc.department.DepartmentSaving;
import com.dimageshare.protobuf.core.autogen.rpc.department.DepartmentServiceGrpc;
import com.google.protobuf.Empty;
import demo.spring.boot.grpc.server.GrpcService;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService(value = DepartmentServiceGrpc.class)
public class DepartmentGrpcServer extends DepartmentServiceGrpc.DepartmentServiceImplBase {
    private DepartmentService service;

    @Autowired
    public DepartmentGrpcServer(DepartmentService service) {
        this.service = service;
    }

    @Override
    public void findDepartmentById(DepartmentIdRequest request, StreamObserver<Department> responseObserver) {
        responseObserver.onNext(service.findById(request));
        responseObserver.onCompleted();
    }

    @Override
    public void findDepartments(Empty request, StreamObserver<DepartmentResponses> responseObserver) {
        DepartmentResponses responses = service.findAllDepartments();
        responseObserver.onNext(responses);
        responseObserver.onCompleted();
    }

    @Override
    public void saveDepartment(DepartmentSaving request, StreamObserver<Empty> responseObserver) {
        service.saveDepartment(request);
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }

    @Override
    public void removeDepartmentById(DepartmentIdRequest request, StreamObserver<Empty> responseObserver) {
        service.removeById(request);
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }
}
