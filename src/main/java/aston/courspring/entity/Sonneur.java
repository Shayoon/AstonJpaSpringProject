package aston.courspring.entity;

import javax.persistence.*;

@Entity
@Table(name = "sonneur")
public class Sonneur implements Musicien {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nomsonneur")
    private String nom;
    @OneToOne
    @JoinColumn(name = "cornemuse_id")
    private Cornemuse cornemuse;

    public Sonneur(String nom, Instrument cornemuse) {
        this.nom = nom;
        this.cornemuse = (Cornemuse) cornemuse;
    }

    public Sonneur() {
    }

    public Sonneur(long id, String nom, Instrument cornemuse) {
        this.id = id;
        this.nom = nom;
        this.cornemuse = (Cornemuse) cornemuse;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Instrument getCornemuse() {
        return cornemuse;
    }

    public void setCornemuse(Instrument cornemuse) {
        this.cornemuse = (Cornemuse) cornemuse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Instrument getCornmuse() {
        return cornemuse;
    }


    @Override
    public void jouer() {
        System.out.println(this.getNom() + " joue : " + this.getCornmuse());
    }
}
