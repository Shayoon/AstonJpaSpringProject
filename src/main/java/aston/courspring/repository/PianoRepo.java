package aston.courspring.repository;

import aston.courspring.entity.Piano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PianoRepo extends JpaRepository<Piano, Long> {

    public List<Piano> findByModel(String model);
}
