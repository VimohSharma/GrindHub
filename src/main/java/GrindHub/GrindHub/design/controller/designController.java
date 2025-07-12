package GrindHub.GrindHub.design.controller;

import GrindHub.GrindHub.design.model.designModel;
import GrindHub.GrindHub.design.service.designService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/api/design")
public class designController {
    private final designService designservice;

    public designController(designService designservice) {
        this.designservice = designservice;
    }

    @GetMapping("/design")
    public List<designModel> getAllWorks(){
        return designservice.getAllWorks();
    }

    @GetMapping("/design/{id}")
    public designModel getWorkEntry(@PathVariable Long id){
        return designservice.getWorkEntry(id);
    }

    @PostMapping("/design")
    public designModel addWorkEntry(@RequestBody designModel design){
        return designservice.addWorkEntry(design);
    }
    @DeleteMapping("/design/{id}")
    public void deleteWorkEntry(@PathVariable Long id){
        designservice.deleteWorkEntry(id);
    }
}
