package aston.courspring.entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "guitare")
public class Guitare implements Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "modelguitare")
    @Size(max = 50)
    @NotNull
    private String model;

    public Guitare(String model) {
        this.model = model;
    }

    public Guitare(long id, String model) {
        this.id = id;
        this.model = model;
    }

    public Guitare() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "gling gling gling";
    }
}
