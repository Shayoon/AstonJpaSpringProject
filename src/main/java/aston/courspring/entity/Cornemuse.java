package aston.courspring.entity;

import javax.persistence.*;

@Entity
@Table(name = "cornemuse")
public class Cornemuse implements Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "modelcornemuse")
    private String model;

    public Cornemuse(String model) {
        this.model = model;
    }

    public Cornemuse() {
    }

    public Cornemuse(long id, String model) {
        this.id = id;
        this.model = model;
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
        return "Pfzit Pfzit Pfout";
    }
}
