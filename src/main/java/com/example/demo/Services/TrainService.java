package com.example.demo.Services;


import com.example.demo.Repository.TrainRepo;
import com.example.demo.Schema.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TrainService {
    @Autowired
    private TrainRepo trainRepo;

    public Train addTrain(Train train){
        trainRepo.save(train);
        return train;
    }
    public Optional<Train> getTrainById(int id){
        return trainRepo.findById(id);

    }
}