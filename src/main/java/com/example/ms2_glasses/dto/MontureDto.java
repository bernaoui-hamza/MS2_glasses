package com.example.ms2_glasses.dto;




public class MontureDto {
    String id;
    String nom;
    String couleur;
    String paysOrigin;

    public MontureDto(String id, String nom, String couleur, String paysOrigin) {
        this.id = id;
        this.nom = nom;
        this.couleur = couleur;
        this.paysOrigin = paysOrigin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getPaysOrigin() {
        return paysOrigin;
    }

    public void setPaysOrigin(String paysOrigin) {
        this.paysOrigin = paysOrigin;
    }
}
