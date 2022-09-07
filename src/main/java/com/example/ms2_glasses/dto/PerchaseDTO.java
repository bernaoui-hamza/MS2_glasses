package com.example.ms2_glasses.dto;

import com.example.ms2_glasses.entities.Fournisseur;


public class PerchaseDTO {
    String idPershase;
    String nom_pershase;
    int qte;
    FournisseurDTO fournisseur;

    public PerchaseDTO(String id, String nom_pershase, int qte, FournisseurDTO fournisseur) {
        this.idPershase = id;
        this.nom_pershase = nom_pershase;
        this.qte = qte;
        this.fournisseur = fournisseur;
    }

    public String getIdPershase() {
        return idPershase;
    }

    public void setIdPershase(String id) {
        this.idPershase = id;
    }

    public String getNom_pershase() {
        return nom_pershase;
    }

    public void setNom_pershase(String nom_pershase) {
        this.nom_pershase = nom_pershase;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public FournisseurDTO getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(FournisseurDTO fournisseur) {
        this.fournisseur = fournisseur;
    }
}
