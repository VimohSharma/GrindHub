package GrindHub.GrindHub.gaming.service;

import GrindHub.GrindHub.gaming.model.gamingModel;
import GrindHub.GrindHub.gaming.repository.gamingRepo;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class gamingService {
    private final gamingRepo gamingrepo;

    public gamingService(gamingRepo gamingrepo) {
        this.gamingrepo = gamingrepo;
    }
    public List<gamingModel> getAllStats(){
        return gamingrepo.findAll();
    }
    public gamingModel getStat(Long id){
        return gamingrepo.findById(id).
                orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "No Gamelog found with id" + id));
    }
    public gamingModel addStats(gamingModel gameStats){
        return gamingrepo.save(gameStats);
    }
    public void deleteStats(Long id){
        gamingrepo.deleteById(id);
    }
}
