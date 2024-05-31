package svc.routes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import svc.routes.constants.routeConstant;
import svc.routes.entity.routeEntity;
import svc.routes.mapper.routeModelToEntity;
import svc.routes.model.routeModel;
import svc.routes.service.routeService;

@RequestMapping(value=routeConstant.ROUTE_API,produces=MediaType.APPLICATION_JSON_VALUE)
@RestController
public class routeController {
	private routeService routeServices;

	private routeModelToEntity mapRouteModelToEntityMapper;

	@Autowired
	public routeController(routeService routeServices,routeModelToEntity mapRouteModelToEntityMapper) {
		super();
		this.routeServices=routeServices;
		this.mapRouteModelToEntityMapper=mapRouteModelToEntityMapper;
	}
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<routeModel> createRoutes(@RequestBody List<routeModel> routes){
		return routeServices.createRoutes(mapRouteModelToEntityMapper.mapRouteModelToEntity(routes));
	}
}
