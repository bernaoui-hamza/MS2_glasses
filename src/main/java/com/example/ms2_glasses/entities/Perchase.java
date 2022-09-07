package com.example.ms2_glasses.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity @Data
public class Perchase {
    @Id
    String idPershase;
    String nom_pershase;
    int qte;
    @ManyToOne
    Fournisseur fournisseur;

    public Perchase() {
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

    public Perchase(String id, String nom_pershase, int qte,Fournisseur fournisseur) {
        this.idPershase = id;
        this.nom_pershase = nom_pershase;
        this.qte = qte;
        this.fournisseur=fournisseur;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }
}
