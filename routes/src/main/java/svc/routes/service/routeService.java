package svc.routes.service;

import java.util.List;

import svc.routes.entity.routeEntity;
import svc.routes.model.routeModel;


public interface routeService {

	public List<routeModel> createRoutes(List<routeEntity> routes);
}
