package com.dimageshare.department.rpc;

import com.dimageshare.core.autogen.grpc.department.Department;
import com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest;
import com.dimageshare.core.autogen.grpc.department.DepartmentResponses;
import com.dimageshare.core.autogen.grpc.department.DepartmentSaving;
import com.dimageshare.core.autogen.grpc.department.DepartmentServiceGrpc;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;

import com.dimageshare.department.service.DepartmentService;
import demo.spring.boot.grpc.server.GrpcService;
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
