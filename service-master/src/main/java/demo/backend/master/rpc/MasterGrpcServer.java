package demo.backend.master.rpc;

import io.grpc.stub.StreamObserver;

import demo.backend.master.service.CalculateService;
import demo.core.autogen.grpc.master.GetSumRequest;
import demo.core.autogen.grpc.master.GetSumResponse;
import demo.core.autogen.grpc.master.MasterGrpc;
import demo.spring.boot.grpc.server.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService(value = MasterGrpc.class)
public class MasterGrpcServer extends MasterGrpc.MasterImplBase {

    @Autowired
    private CalculateService calculateService;

    public MasterGrpcServer(final CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @Override
    public void getSum(GetSumRequest request, StreamObserver<GetSumResponse> responseObserver) {
        responseObserver.onNext(calculateService.getSum(request));
        responseObserver.onCompleted();
    }
}
