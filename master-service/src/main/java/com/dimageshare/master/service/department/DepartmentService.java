package com.dimageshare.master.service.department;

import com.dimageshare.master.model.request.DepartmentRequest;
import com.dimageshare.master.model.response.DepartmentResponse;
import com.dimageshare.protobuf.core.autogen.rpc.department.Department;
import com.dimageshare.protobuf.core.autogen.rpc.department.DepartmentIdRequest;
import com.dimageshare.protobuf.core.autogen.rpc.department.DepartmentResponses;
import com.dimageshare.protobuf.core.autogen.rpc.department.DepartmentSaving;
import com.dimageshare.protobuf.core.autogen.rpc.department.DepartmentServiceGrpc;
import com.google.common.annotations.VisibleForTesting;
import com.google.protobuf.Empty;
import demo.spring.boot.grpc.client.GrpcClient;
import io.grpc.Channel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {
    @GrpcClient(value = "department")
    private Channel channel;
    private DepartmentServiceGrpc.DepartmentServiceBlockingStub stub;

    @VisibleForTesting
    protected DepartmentService(final Channel channel) {
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

    public void saveDepartment(DepartmentRequest request) {
        stub = getStub();
        String name = request.getName();
        String description = request.getDescription();
        DepartmentSaving department = DepartmentSaving.newBuilder().setName(name).setDescription(description).build();
        stub.saveDepartment(department);
    }
}
