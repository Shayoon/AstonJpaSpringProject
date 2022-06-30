package aston.courspring.entity;

import javax.persistence.*;

@Entity
@Table(name = "pianiste")
public class Pianiste implements Musicien {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nompianiste")
    private String nom;
    @OneToOne
    @JoinColumn(name = "piano_id")
    private Piano piano;

    public Pianiste(String nom, Instrument piano) {
        this.nom = nom;
        this.piano = (Piano) piano;
    }

    public Pianiste() {
    }

    public Pianiste(long id, String nom, Instrument piano) {
        this.id = id;
        this.nom = nom;
        this.piano = (Piano) piano;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Instrument getPiano() {
        return piano;
    }

    public void setPiano(Instrument piano) {
        this.piano = (Piano) piano;
    }

    @Override
    public void jouer() {
        System.out.println(this.getNom() + " joue : " + this.getPiano());
    }
}
