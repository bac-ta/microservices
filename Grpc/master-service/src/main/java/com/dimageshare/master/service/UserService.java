package com.dimageshare.master.service;

import com.dimageshare.core.autogen.grpc.user.GetSumRequest;
import com.dimageshare.core.autogen.grpc.user.GetSumResponse;
import com.dimageshare.core.autogen.grpc.user.UserGrpc;
import com.google.common.annotations.VisibleForTesting;
import io.grpc.Channel;
import demo.spring.boot.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @GrpcClient(value = "user")
    private Channel masterChannel;

    @VisibleForTesting
    protected UserService(final Channel masterChannel) {
        this.masterChannel = masterChannel;
    }

    public UserService() {
    }

    public int getSum(int a, int b) {
        GetSumRequest request = GetSumRequest.newBuilder().setA(a).setB(b).build();
        UserGrpc.UserBlockingStub stub = UserGrpc.newBlockingStub(masterChannel);
        GetSumResponse response = stub.getSum(request);
        return response.getSum();
    }

}
