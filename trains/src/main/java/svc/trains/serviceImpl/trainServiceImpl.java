package svc.trains.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import svc.trains.entity.trainEntity;
import svc.trains.repository.trainRepo;
import svc.trains.service.trainService;

@Service
public class trainServiceImpl implements trainService {

    @Autowired
    private trainRepo trainRepository;

    @Override
    public trainEntity createTrain(trainEntity trains) {
        return trainRepository.save(trains);
    }
}
