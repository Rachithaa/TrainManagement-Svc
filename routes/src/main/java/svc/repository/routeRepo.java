package svc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import svc.entity.routeEntity;

public interface routeRepo extends MongoRepository<routeEntity, Integer> {

}
