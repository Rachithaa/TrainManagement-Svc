package svc.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import svc.entity.routeEntity;


public interface routeService {

	public List<routeEntity> createRoutes(List<routeEntity> routes);
}
