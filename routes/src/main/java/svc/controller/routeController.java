package svc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import svc.constants.routeConstant;
import svc.entity.routeEntity;
import svc.service.routeService;

@RequestMapping(value=routeConstant.ROUTE_API,produces=MediaType.APPLICATION_JSON_VALUE)
@RestController
public class routeController {
	
	private routeService routeService;

	@Autowired
	public routeController(routeService routeService) {
		super();
		this.routeService=routeService;
	}
	
	@PostMapping(value="/createroutes",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List> createRoutes(@RequestBody List<routeEntity> routes){
		return (ResponseEntity<List>) routeService.createRoutes(routes);
		
	}

	

}
