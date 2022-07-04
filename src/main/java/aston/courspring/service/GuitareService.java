package aston.courspring.service;

import aston.courspring.entity.Guitare;
import aston.courspring.repository.GuitareRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class GuitareService {

    @Autowired
    private GuitareRepo guitareRepo;

    /**
     * Methode qui récupère toutes les guitares depuis le Repo
     *
     * @return List<Guitare>
     */
    public List<Guitare> findAll() {
        return this.guitareRepo.findAll();

    }

    public Guitare findById(Long id) {
        Optional<Guitare> optionalGuitare = this.guitareRepo.findById(id);
        if (optionalGuitare.isPresent()) {
            return optionalGuitare.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public List<Guitare> findByModel(String model) {
        return this.guitareRepo.findByModel(model);
    }

    public Guitare create(Guitare newGuitare) {
        return this.guitareRepo.save(newGuitare);
    }

    public Guitare update(Guitare guitare) {
        if (!this.guitareRepo.existsById(guitare.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "impossible de trouver la guitare à mettre à jour");
        }
        return this.guitareRepo.save(guitare);
    }

    public Guitare delete(Long id) {
        if (!this.guitareRepo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de trouver la guitare");
        }
        Guitare guitareDel = this.findById(id);
        this.guitareRepo.deleteById(id);
        if (this.guitareRepo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED, "Erreur lors de la suppression");
        }
        return guitareDel;
    }


}
