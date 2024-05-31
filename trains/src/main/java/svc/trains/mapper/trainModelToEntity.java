package svc.trains.mapper;

import org.springframework.stereotype.Component;
import svc.trains.entity.trainEntity;
import svc.trains.model.trainModel;

@Component
public class trainModelToEntity {

    public trainEntity maptrainModelToEntity(trainModel trainModelObj)
    {
        trainEntity trainEntityObj= new trainEntity();
        trainEntityObj.setTrainId(trainModelObj.getTrainId());
        trainEntityObj.setDayMonYear(trainModelObj.getDayMonYear());
        trainEntityObj.setTrainName(trainModelObj.getTrainName());
        trainEntityObj.setTotalKmsSourceToDestination(trainModelObj.getTotalKmsSourceToDestination());
        trainEntityObj.setCostPerKms(trainModelObj.getCostPerKms());
        trainEntityObj.setSourceName(trainModelObj.getSourceName());
        trainEntityObj.setDestinationName(trainModelObj.getDestinationName());
        return trainEntityObj;
    }
}
