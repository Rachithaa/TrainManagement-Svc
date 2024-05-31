package svc.routes.mapper;

import org.springframework.stereotype.Component;
import svc.routes.entity.routeEntity;
import svc.routes.model.routeModel;

import java.util.ArrayList;
import java.util.List;

@Component
public class routeModelToEntity {

    public List<routeEntity> mapRouteModelToEntity(List<routeModel> routesModel)
    {
        List<routeEntity> routeEntityListObj= new ArrayList<>();
        for(routeModel eachRoutes : routesModel )
        {
            routeEntity  routeEntityObj= new routeEntity();
            //routeEntityObj.setRouteId(eachRoutes.getRouteId());
            routeEntityObj.setStationName(eachRoutes.getStationName());
            routeEntityObj.setDayMonYear(eachRoutes.getDayMonYear());
            routeEntityObj.setTotalDistance(eachRoutes.getTotalDistance());
            routeEntityObj.setTimeOfArrival(eachRoutes.getTimeOfArrival());
            routeEntityObj.setTimeOfDeparture(eachRoutes.getTimeOfDeparture());
            routeEntityObj.setTrainId(eachRoutes.getTrainId());
            routeEntityListObj.add(routeEntityObj);
        }
        return routeEntityListObj;
    }
}
