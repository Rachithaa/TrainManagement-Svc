package svc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;
import svc.entity.routeEntity;
import svc.repository.routeRepo;
import svc.service.routeService;

@Service
public class routeServiceImpl implements routeService {

	@Autowired
	private routeRepo routeRepo;
	
	@Override
	public List<routeEntity> createRoutes(List<routeEntity> routes) {
		// TODO Auto-generated method stub
		return routeRepo.saveAll(routes);
	}

}
