package com.example.ms2_glasses.dto;

public class SalesDTO {
    String id;
    String nom_sales;
    String qte;

    public SalesDTO(String id, String nom_sales, String qte) {
        this.id = id;
        this.nom_sales = nom_sales;
        this.qte = qte;
    }

    public SalesDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom_sales() {
        return nom_sales;
    }

    public void setNom_sales(String nom_sales) {
        this.nom_sales = nom_sales;
    }

    public String getQte() {
        return qte;
    }

    public void setQte(String qte) {
        this.qte = qte;
    }
}
