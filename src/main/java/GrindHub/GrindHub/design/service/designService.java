package GrindHub.GrindHub.design.service;

import GrindHub.GrindHub.design.model.designModel;
import GrindHub.GrindHub.design.repository.designRepo;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class designService {
    private final designRepo designrepo;

    public designService(designRepo designrepo) {
        this.designrepo = designrepo;
    }
    public List<designModel> getAllWorks(){
        return designrepo.findAll();
    }
    public designModel getWorkEntry(Long id){
        return designrepo.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"No log found from the id " + id));
    }
    public designModel addWorkEntry(designModel design){
        return designrepo.save(design);
    }
    public void deleteWorkEntry(Long id){
        designrepo.deleteById(id);
    }
}
