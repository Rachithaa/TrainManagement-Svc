package svc.trains.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import svc.trains.mapper.trainEntityToModel;
import svc.trains.mapper.trainModelToEntity;
import svc.trains.model.routeModel;
import svc.trains.model.trainModel;
import svc.trains.model.trainRequestModel;
import svc.trains.model.trainResponseModel;
import svc.trains.repository.trainRepo;
import svc.trains.service.trainService;

import java.util.List;

@Service
public class trainServiceImpl implements trainService {

    @Autowired
    private trainRepo trainRepository;

    @Autowired
    private WebClient webClient;

    @Autowired
    private trainModelToEntity trainModelToEntity;

    @Autowired
    private trainEntityToModel trainEntityToModel;

    private trainResponseModel trainResponseModels;

    @Override
    public trainResponseModel createTrain(trainRequestModel trains) {
        trainResponseModels = new trainResponseModel();
        trainResponseModels.setRoutes(webClient.post()
                .uri("/routes")
                .body(Mono.just(trains.getRoutes()), trainRequestModel.class)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<routeModel>>() {
                }).block());
        trainResponseModels.
                setTrains(trainEntityToModel.
                        maptrainEntityToModel(trainRepository.
                                save(trainModelToEntity
                                        .maptrainModelToEntity(trains.getTrains()))));
         return trainResponseModels;
    }
}
