/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.gainde2000.demo.business.produit.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author asow
 */
public class ProduitGetDto {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("nom")
    private String nom;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("designation")
    private String designation;
    @JsonProperty("prix")
    private Double prix;

   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.gainde2000.demo.business.produit.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author asow
 */
public class ProduitGetDto {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("nom")
    private String nom;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("designation")
    private String designation;
    @JsonProperty("prix")
    private Double prix;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

}
