package GrindHub.GrindHub.gaming.controller;

import GrindHub.GrindHub.gaming.model.gamingModel;
import GrindHub.GrindHub.gaming.service.gamingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gamingModel")
@Controller
public class gamingController {
    private final gamingService gamingservice;

    public gamingController(gamingService gamingservice) {
        this.gamingservice = gamingservice;
    }
    @GetMapping("/gameStats")
    public List<gamingModel> getAllStats(){
        return gamingservice.getAllStats();
    }
    @GetMapping("/gameStats/{id}")
    public gamingModel getStat(@PathVariable Long id){
        return gamingservice.getStat(id);
    }
    @PostMapping("/gameStats")
    public gamingModel addStats(@RequestBody gamingModel gameStats){
        return gamingservice.addStats(gameStats);
    }
    @DeleteMapping("/gameStats/{id}")
    public void deleteStats(@PathVariable Long id){
        gamingservice.deleteStats(id);
    }
}
