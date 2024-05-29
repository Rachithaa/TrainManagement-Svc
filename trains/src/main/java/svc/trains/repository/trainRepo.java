package svc.trains.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import svc.trains.entity.trainEntity;

public interface trainRepo extends MongoRepository<trainEntity,String> {
}
