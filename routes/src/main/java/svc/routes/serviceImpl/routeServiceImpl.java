package svc.routes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import svc.routes.entity.routeEntity;
import svc.routes.repository.routeRepo;
import svc.routes.service.routeService;

@Service
public class routeServiceImpl implements routeService {

	@Autowired
	private routeRepo routeRepository;
	
	@Override
	public List<routeEntity> createRoutes(List<routeEntity> routes) {
		// TODO Auto-generated method stub
		return routeRepository.saveAll(routes);
	}

}
