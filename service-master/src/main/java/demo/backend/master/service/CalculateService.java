package demo.backend.master.service;

import demo.core.autogen.grpc.master.GetSumRequest;
import demo.core.autogen.grpc.master.GetSumResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {
    //Logger
    private static final Logger logger = LoggerFactory.getLogger(CalculateService.class);

    // Constructors
    // ------------------------------------------------------------------------
    @Autowired
    public CalculateService() {
//        ClassPathResource
    }

    public GetSumResponse getSum(GetSumRequest request) {
        return GetSumResponse.newBuilder()
                .setSum(request.getA() + request.getB())
                .build();
    }
}
