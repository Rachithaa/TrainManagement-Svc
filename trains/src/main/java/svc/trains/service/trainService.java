package svc.trains.service;

import svc.trains.entity.trainEntity;
import svc.trains.model.trainRequestModel;
import svc.trains.model.trainResponseModel;

public interface trainService {

    public trainResponseModel createTrain(trainRequestModel trains);
}
