package com.example.demo.Controllers;




import com.example.demo.Schema.Train;
        import com.example.demo.Services.TrainService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.Optional;

@RestController
public class TrainController {
    @Autowired
    private TrainService trainService;

    @PostMapping("/addTrain")
    public Train addTrain(@RequestBody Train train){
        return trainService.addTrain(train);
    }
    @GetMapping("/getTrainById")
    public Optional<Train> getTrainById(@RequestBody int id){
        return trainService.getTrainById(id);
    }

}


