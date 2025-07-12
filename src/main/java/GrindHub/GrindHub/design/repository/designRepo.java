package GrindHub.GrindHub.design.repository;

import GrindHub.GrindHub.design.model.designModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface designRepo extends JpaRepository<designModel,Long> {
}
