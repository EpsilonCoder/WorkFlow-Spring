package sn.gainde2000.demo.security.dto;

import sn.gainde2000.demo.business.profils.Profil;

public class AuthenticatedUserDto {
    private String name;
    private String username;
    private String password;
    private Profil profil;

    public AuthenticatedUserDto() {
    }

    public AuthenticatedUserDto(String name, String username, String password, Profil profil) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.profil = profil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         package sn.gainde2000.demo.security.dto;

import sn.gainde2000.demo.business.profils.Profil;

public class AuthenticatedUserDto {
    private String name;
    private String username;
    private String password;
    private Profil profil;

    public AuthenticatedUserDto() {
    }

    public AuthenticatedUserDto(String name, String username, String password, Profil profil) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.profil = profil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
