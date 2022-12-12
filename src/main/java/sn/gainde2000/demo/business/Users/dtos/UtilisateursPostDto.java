package sn.gainde2000.demo.business.Users.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import sn.gainde2000.demo.business.profils.Profil;
import sn.gainde2000.demo.business.profils.dtos.ProfilPostDto;

public class UtilisateursPostDto {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("nom")
    private String nom;
    @JsonProperty("prenom")
    private String prenom;
    @JsonProperty("email")
    private String email;
    @JsonProperty("telephone")
    private String telephone;

    @JsonProperty("username")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("password")
    private String password;

    @JsonProperty("profil")
    private ProfilPostDto profil;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProfilPostDto getProfil() {
        return profil;
    }

    public void setProfil(ProfilPostDto profil) {
        this.profil = profil;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
package sn.gainde2000.demo.business.Users.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import sn.gainde2000.demo.business.profils.Profil;
import sn.gainde2000.demo.business.profils.dtos.ProfilPostDto;

public class UtilisateursPostDto {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("nom")
    private String nom;
    @JsonProperty("prenom")
    private String prenom;
    @JsonProperty("email")
    private String email;
    @JsonProperty("telephone")
    private String telephone;

    @JsonProperty("username")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("password")
    private String password;

    @JsonProperty("profil")
    private ProfilPostDto profil;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProfilPostDto getProfil() {
        return profil;
    }

    public void setProfil(ProfilPostDto profil) {
        this.profil = profil;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
