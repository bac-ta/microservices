package com.dimageshare.master.service.department;

import com.dimageshare.core.autogen.grpc.department.Department;
import com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest;
import com.dimageshare.core.autogen.grpc.department.DepartmentResponses;
import com.dimageshare.core.autogen.grpc.department.DepartmentSaving;
import com.dimageshare.core.autogen.grpc.department.DepartmentServiceGrpc;
import com.dimageshare.master.model.request.DepartmentRequest;
import com.dimageshare.master.model.response.DepartmentResponse;
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
        DepartmentIdRequest request = DepartmentIdRequest.newBuilder().setDpId(id).build();
        stub = getStub();
        Department department = stub.findDepartmentById(request);
        String name = department.getDpName();
        String description = department.getDpDescription();
        return new DepartmentResponse(id, name, description);
    }

    public List<DepartmentResponse> findAll() {
        stub = getStub();
        DepartmentResponses departments = stub.findDepartments(Empty.getDefaultInstance());
        return departments.getDepartmentList().stream().map(el -> new DepartmentResponse(el.getDpId(), el.getDpName(), el.getDpDescription())).collect(Collectors.toList());
    }

    public void removeById(int id) {
        stub = getStub();
        DepartmentIdRequest request = DepartmentIdRequest.newBuilder().setDpId(id).build();
        stub.removeDepartmentById(request);
    }

    public void saveDepartment(DepartmentRequest request) {
        stub = getStub();
        String name = request.getName();
        String description = request.getDescription();
        DepartmentSaving department = DepartmentSaving.newBuilder().setDpName(name).setDpDescription(description).build();
        stub.saveDepartment(department);
    }

}