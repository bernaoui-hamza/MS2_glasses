package com.example.ms2_glasses.entities;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Verre {
    @Id
    String idVerre;
    String nom;
    String paysOrigin;

    public Verre(String id, String nom, String paysOrigin) {
        this.idVerre = id;
        this.nom = nom;
        this.paysOrigin = paysOrigin;
    }

    public void setPaysOrigin(String paysOrigin) {
        this.paysOrigin = paysOrigin;
    }

    public Verre() {
    }

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


}
