package svc.trains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import svc.trains.constants.trainConstant;
import svc.trains.model.trainRequestModel;
import svc.trains.model.trainResponseModel;
import svc.trains.service.trainService;

@RequestMapping(value= trainConstant.TRAIN_API,produces= MediaType.APPLICATION_JSON_VALUE)
@RestController
public class trainController {
    private trainService trainServices;

    @Autowired
    public trainController(trainService trainServices) {
        this.trainServices =trainServices;
    }

    @PostMapping(produces=MediaType.APPLICATION_JSON_VALUE)
    public trainResponseModel createTrains(@RequestBody trainRequestModel trains)
    {
        return trainServices.createTrain(trains);
    }
}
