package svc.user.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import svc.user.entity.userEntity;
import svc.user.repository.userRepo;
import svc.user.service.userService;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userRepo userRepository;

    @Override
    public userEntity createUser(userEntity users) {
        return userRepository.save(users);
    }
}
