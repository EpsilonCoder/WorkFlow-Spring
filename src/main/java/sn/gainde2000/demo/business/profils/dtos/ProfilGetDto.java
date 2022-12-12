package sn.gainde2000.demo.business.profils.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfilGetDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("nomProfil")
    private String nomProfil;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomProfil() {
        package sn.gainde2000.demo.business.profils.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfilGetDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("nomProfil")
    private String nomProfil;

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
