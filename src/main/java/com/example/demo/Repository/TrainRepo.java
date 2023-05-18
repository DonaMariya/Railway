package com.example.demo.Repository;

import com.example.demo.Schema.Train;
import org.springframework.data.repository.CrudRepository;

public interface TrainRepo extends CrudRepository<Train, Integer> {

}