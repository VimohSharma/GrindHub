package GrindHub.GrindHub.gaming.repository;

import GrindHub.GrindHub.gaming.model.gamingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface gamingRepo extends JpaRepository<gamingModel,Long> {
}
