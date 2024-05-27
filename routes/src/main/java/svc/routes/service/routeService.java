package svc.routes.service;

import java.util.List;

import svc.routes.entity.routeEntity;


public interface routeService {

	public List<routeEntity> createRoutes(List<routeEntity> routes);
}
