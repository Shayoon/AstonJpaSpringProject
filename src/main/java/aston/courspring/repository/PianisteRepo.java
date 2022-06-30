package aston.courspring.repository;


import aston.courspring.entity.Pianiste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PianisteRepo extends JpaRepository<PianisteRepo, Long> {

    public List<Pianiste> findByNom(String nom);

    @Query("select pt from Pianiste pt left join pt.piano p where p.model =:modelpiano")
    public List<Pianiste> findByModelPiano(@Param("modelpiano") String model);
}
