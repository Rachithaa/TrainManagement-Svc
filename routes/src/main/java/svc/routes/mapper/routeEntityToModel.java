package svc.routes.mapper;

import org.springframework.stereotype.Component;
import svc.routes.entity.routeEntity;
import svc.routes.model.routeModel;

import java.util.ArrayList;
import java.util.List;

@Component
public class routeEntityToModel {

    public List<routeModel> mapRouteEntityToModel(List<routeEntity> routesEntity)
    {
        List<routeModel> routeModelListObj= new ArrayList<>();
        for(routeEntity eachRoutes : routesEntity )
        {
            routeModel  routeModelObj= new routeModel();
            routeModelObj.setRouteId(eachRoutes.getRouteId());
            routeModelObj.setTimeOfDeparture(eachRoutes.getTimeOfDeparture());
            routeModelObj.setStationName(eachRoutes.getStationName());
            routeModelObj.setDayMonYear(eachRoutes.getDayMonYear());
            routeModelObj.setTotalDistance(eachRoutes.getTotalDistance());
            routeModelObj.setTimeOfArrival(eachRoutes.getTimeOfArrival());
            routeModelObj.setTrainId(eachRoutes.getTrainId());
            routeModelListObj.add(routeModelObj);
        }
        return routeModelListObj;
    }
}
