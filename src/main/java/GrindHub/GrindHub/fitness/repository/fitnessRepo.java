package GrindHub.GrindHub.fitness.repository;

import GrindHub.GrindHub.fitness.model.fitnessModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface fitnessRepo extends JpaRepository<fitnessModel,Long> {
}

