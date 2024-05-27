package svc.routes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import svc.routes.entity.routeEntity;

public interface routeRepo extends MongoRepository<routeEntity, Integer> {

}
