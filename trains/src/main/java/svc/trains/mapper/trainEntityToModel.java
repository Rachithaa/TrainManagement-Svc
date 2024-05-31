package svc.trains.mapper;

import org.springframework.stereotype.Component;
import svc.trains.entity.trainEntity;
import svc.trains.model.trainModel;

@Component
public class trainEntityToModel {

    public trainModel maptrainEntityToModel(trainEntity trainEntityObj)
    {
        trainModel trainModelObj= new trainModel();
        trainModelObj.setTrainId(trainEntityObj.getTrainId());
        trainModelObj.setDayMonYear(trainEntityObj.getDayMonYear());
        trainModelObj.setTrainName(trainEntityObj.getTrainName());
        trainModelObj.setTotalKmsSourceToDestination(trainEntityObj.getTotalKmsSourceToDestination());
        trainModelObj.setCostPerKms(trainEntityObj.getCostPerKms());
        trainModelObj.setSourceName(trainEntityObj.getSourceName());
        trainModelObj.setDestinationName(trainEntityObj.getDestinationName());
        return trainModelObj;
    }
}
