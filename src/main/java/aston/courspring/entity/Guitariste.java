package aston.courspring.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "guitariste")
public class Guitariste implements Musicien {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nomguitariste")
    @Size(max = 50)
    @NotNull
    private String nom;
    @OneToOne
    @JoinColumn(name = "guitare_id")
    private Instrument guitare;

    public Guitariste(String nom, Instrument guitare) {
        this.nom = nom;
        this.guitare = guitare;
    }

    public Guitariste(long id, String nom, Instrument guitare) {
        this.id = id;
        this.nom = nom;
        this.guitare = guitare;
    }

    public Guitariste() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Instrument getGuitare() {
        return guitare;
    }

    public void setGuitare(Instrument guitare) {
        this.guitare = guitare;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public void jouer() {
        System.out.println(this.getNom() + " Joue : " + this.guitare);
    }
}
