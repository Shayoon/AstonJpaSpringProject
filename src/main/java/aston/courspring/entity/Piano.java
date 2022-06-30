package aston.courspring.entity;


import javax.persistence.*;

@Entity
@Table(name = "piano")
public class Piano implements Instrument {

    /**
     * Classe Piano qui impémente Instrument
     *
     * @author Quentin
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "modelpiano")
    private String model;

    public Piano(String model) {
        this.model = model;
    }

    public Piano() {
    }

    public Piano(long id, String model) {
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

    @Override
    public String toString() {
        return "bouloubouloum";
    }
}
