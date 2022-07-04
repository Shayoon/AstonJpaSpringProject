package aston.courspring.config;


import aston.courspring.entity.Guitare;
import aston.courspring.repository.GuitareRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDataBase {
    private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);

    @Bean
    CommandLineRunner initDatabase(GuitareRepo guitareRepo) {
        return args -> {
            log.info("loading data" + guitareRepo.save(new Guitare("Gibson")));
            log.info("loading data" + guitareRepo.save(new Guitare("Cabrel")));
            log.info("loading data" + guitareRepo.save(new Guitare("Hallyday")));
            log.info("loading data" + guitareRepo.save(new Guitare("Chedid")));
            log.info("loading data" + guitareRepo.save(new Guitare("Tryo")));
            log.info("loading data" + guitareRepo.save(new Guitare("Goldman")));


        };
    }
}
