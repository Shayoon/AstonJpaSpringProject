package aston.courspring.repository;

import aston.courspring.entity.Guitare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuitareRepo extends JpaRepository<Guitare, Long> {
    public List<Guitare> findByModel(String model);
}
