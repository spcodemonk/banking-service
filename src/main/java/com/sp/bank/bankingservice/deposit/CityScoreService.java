package com.sp.bank.bankingservice.deposit;


import com.sp.grpc.CityScoreRequest;
import com.sp.grpc.CityScoreResponse;
import com.sp.grpc.CityScoreServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CityScoreService extends CityScoreServiceGrpc.CityScoreServiceImplBase {

    @Override
    public void calculateCityScore(CityScoreRequest request, StreamObserver<CityScoreResponse> responseObserver) {
        CityScoreResponse resp = CityScoreResponse.newBuilder()
                .setCityScore(20)
                .build();
        responseObserver.onNext(resp);

    }
}