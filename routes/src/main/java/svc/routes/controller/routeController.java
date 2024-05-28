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
import svc.routes.service.routeService;

@RequestMapping(value=routeConstant.ROUTE_API,produces=MediaType.APPLICATION_JSON_VALUE)
@RestController
public class routeController {
	private routeService routeServices;

	@Autowired
	public routeController(routeService routeServices) {
		super();
		this.routeServices=routeServices;
	}
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<routeEntity> createRoutes(@RequestBody List<routeEntity> routes){
		return routeServices.createRoutes(routes);
	}
}
