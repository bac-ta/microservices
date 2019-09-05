package com.dimageshare.master.service.department;

import com.dimageshare.configuration.interceptor.GrpcClient;
import com.dimageshare.master.model.request.DepartmentRequest;
import com.dimageshare.master.model.response.DepartmentResponse;
import com.dimageshare.protobuf.core.autogen.grpc.department.Department;
import com.dimageshare.protobuf.core.autogen.grpc.department.DepartmentIdRequest;
import com.dimageshare.protobuf.core.autogen.grpc.department.DepartmentResponses;
import com.dimageshare.protobuf.core.autogen.grpc.department.DepartmentServiceGrpc;
import com.google.common.annotations.VisibleForTesting;
import com.google.protobuf.Empty;
import io.grpc.Channel;

import java.util.List;
import java.util.stream.Collectors;

public class DepartmentService {
    @GrpcClient("department")
    private Channel channel;
    private DepartmentServiceGrpc.DepartmentServiceBlockingStub stub;

    @VisibleForTesting
    protected DepartmentService(Channel channel) {
        this.channel = channel;
    }

    public DepartmentService() {
        super();
    }

    private DepartmentServiceGrpc.DepartmentServiceBlockingStub getStub() {
        return DepartmentServiceGrpc.newBlockingStub(channel);
    }

    public DepartmentResponse findById(int id) {
        DepartmentIdRequest request = DepartmentIdRequest.newBuilder().setId(id).build();
        stub = getStub();
        Department department = stub.findDepartmentById(request);
        String name = department.getName();
        String description = department.getDescription();
        return new DepartmentResponse(id, name, description);
    }

    public List<DepartmentResponse> findAll() {
        stub = getStub();
        DepartmentResponses departments = stub.findDepartments(Empty.getDefaultInstance());

        return departments.getDepartmentList().stream().map(el -> {
            return new DepartmentResponse(el.getId(), el.getName(), el.getDescription());
        }).collect(Collectors.toList());
    }

    public void removeById(int id) {
        stub = getStub();
        DepartmentIdRequest request = DepartmentIdRequest.newBuilder().setId(id).build();
        stub.removeDepartmentById(request);
    }

    public void saveDepartment(DepartmentRequest request){
        stub =getStub();
        String name = request.getName();
        String description =request.getDescription();
        Department department = Department.newBuilder().setName(name).setDescription(description).build();

    }
}
