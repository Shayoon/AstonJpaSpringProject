package aston.courspring.service;


import aston.courspring.entity.Instrument;
import aston.courspring.repository.CornemuseRepo;
import aston.courspring.repository.GuitareRepo;
import aston.courspring.repository.PianoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstrumentService {
    @Autowired
    private GuitareRepo guitareRepo;
    @Autowired
    private CornemuseRepo cornemuseRepo;
    @Autowired
    private PianoRepo pianoRepo;

    public List<Instrument> findAll() {
        List<Instrument> instrus = new ArrayList<Instrument>();
        instrus.addAll(this.guitareRepo.findAll());
        instrus.addAll(this.pianoRepo.findAll());
        instrus.addAll(this.cornemuseRepo.findAll());
        return instrus;
    }
}
