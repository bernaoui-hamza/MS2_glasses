package com.example.ms2_glasses.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class VerreDTO {
    String idVerre;
    String nom;
    String paysOrigin;

    public String getIdVerre() {
        return idVerre;
    }

    public void setIdVerre(String id) {
        this.idVerre = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPaysOrigin() {
        return paysOrigin;
    }

    public void setPaysOrigin(String paysOrigin) {
        this.paysOrigin = paysOrigin;
    }

    public VerreDTO() {
    }

    public VerreDTO(String id, String nom, String paysOrigin) {
        this.idVerre = id;
        this.nom = nom;
        this.paysOrigin = paysOrigin;
    }
}
