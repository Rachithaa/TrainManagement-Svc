package svc.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import svc.user.entity.userEntity;

public interface userRepo extends MongoRepository<userEntity, Integer> {
}
