package GrindHub.GrindHub.fitness.controller;

import GrindHub.GrindHub.fitness.model.fitnessModel;
import GrindHub.GrindHub.fitness.service.fitnessService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fitnessModel")
@Controller
public class fitnessController {

    private final fitnessService fitnessservice;

    public fitnessController(fitnessService fitnessservice) {
        this.fitnessservice = fitnessservice;
    }

    @GetMapping("/workouts")
    public List<fitnessModel> getAllWorkouts(){
        return fitnessservice.getAllWorkouts();
    }

    @GetMapping("/workouts/{id}")
    public fitnessModel getWorkout(@PathVariable Long id){
        return fitnessservice.getWorkout(id);
    }
    @PostMapping("/workouts")
    public fitnessModel addWorkout(@RequestBody fitnessModel workout){
        return fitnessservice.addWorkout(workout);
    }

    @DeleteMapping("/workouts/{id}")
    public void deleteWorkout(@PathVariable  Long id){
        fitnessservice.deleteWorkout(id);
    }
}
