package sn.gainde2000.demo.security.dto;

import sn.gainde2000.demo.business.profils.Profil;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class RegistrationRequest {
    @NotEmpty(message = "{registration_nom_not_empty}")
    private String nom;

    @NotEmpty(message = "{registration_prenom_not_empty}")package sn.gainde2000.demo.security.dto;

import sn.gainde2000.demo.business.profils.Profil;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class RegistrationRequest {
    @NotEmpty(message = "{registration_nom_not_empty}")
    private String nom;

    @NotEmpty(message = "{registration_prenom_not_empty}")
    private String prenom;

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

    @Email(message = "{registration_email_is_not_valid}")
    @NotEmpty(message = "{registration_email_not_empty}")
    private String email;

    @NotEmpty(message = "{registration_username_not_empty}")
    private String username;

    @NotEmpty(message = "{registration_password_not_empty}")
    private String password;

    private Profil profil;

    public RegistrationRequest(String nom, String prenom, String email, String username, String password, Profil profil) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.username = username;
        this.password = password;
        this.profil = profil;
    }

    public RegistrationRequest() {
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }
}
