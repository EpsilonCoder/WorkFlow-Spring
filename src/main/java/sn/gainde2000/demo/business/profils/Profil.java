package sn.gainde2000.demo.business.profils;


import javax.persistence.*;

@Entity
@Table(name = "profil")

public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationTpackage sn.gainde2000.demo.business.profils;


import javax.persistence.*;

@Entity
@Table(name = "profil")

public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomProfil;

    public Profil() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomProfil() {
        return nomProfil;
    }

    public void setNomProfil(String nomProfil) {
        this.nomProfil = nomProfil;
    }
}
