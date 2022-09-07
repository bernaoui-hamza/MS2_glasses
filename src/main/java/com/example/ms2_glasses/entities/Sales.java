package com.example.ms2_glasses.entities;

import com.example.ms2_glasses.dto.SalesDTO;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@NoArgsConstructor
public class Sales {
    @Id
    String id;
    String nom_sales;
    String qte;

    public Sales() {
    }

    public String getNom_sales() {
        return nom_sales;
    }

    public void setNom_sales(String nom_sales) {
        this.nom_sales = nom_sales;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom_pershase() {
        return nom_sales;
    }

    public void setNom_pershase(String nom_sales) {
        this.nom_sales = nom_sales;
    }

    public String getQte() {
        return qte;
    }

    public void setQte(String qte) {
        this.qte = qte;
    }

    public Sales(String id, String nom_sales, String qte) {
        this.id = id;
        this.nom_sales = nom_sales;
        this.qte = qte;
    }

}
