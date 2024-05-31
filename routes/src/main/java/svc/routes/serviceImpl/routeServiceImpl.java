package svc.routes.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import svc.routes.entity.routeEntity;
import svc.routes.mapper.routeEntityToModel;
import svc.routes.model.routeModel;
import svc.routes.repository.routeRepo;
import svc.routes.service.routeService;

@Service
public class routeServiceImpl implements routeService {

	@Autowired
	private routeRepo routeRepository;

	@Autowired
	private routeEntityToModel routeEntityToModelMapper;
	
	@Override
	public List<routeModel> createRoutes(List<routeEntity> routes) {
		// TODO Auto-generated method stub
		for(routeEntity eachroutes: routes)
		{
			UUID idNum= UUID.randomUUID();
			eachroutes.setRouteId(idNum.toString());
		}
		return routeEntityToModelMapper.mapRouteEntityToModel(routeRepository.saveAll(routes));
	}

}
