package GrindHub.GrindHub.fitness.service;

import GrindHub.GrindHub.fitness.model.fitnessModel;
import GrindHub.GrindHub.fitness.repository.fitnessRepo;
import GrindHub.GrindHub.gaming.model.gamingModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class fitnessService {
    private final fitnessRepo fitnessrepo;

    public fitnessService(fitnessRepo fitnessrepo){
        this.fitnessrepo = fitnessrepo;
    }
    public fitnessModel getWorkout(Long id) {
        return fitnessrepo.findById(id).
                orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Workout log not available for the id" + id));
    }
    public List<fitnessModel> getAllWorkouts(){
        return fitnessrepo.findAll();
    }
    public fitnessModel addWorkout(fitnessModel workout){
        return fitnessrepo.save(workout);
    }
    public void deleteWorkout(Long id){
        fitnessrepo.deleteById(id);
    }
}
