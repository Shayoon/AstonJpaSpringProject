package aston.courspring.repository;

import aston.courspring.entity.Cornemuse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CornemuseRepo extends JpaRepository<Cornemuse, Long> {
    public List<Cornemuse> findByModel(String model);
}
