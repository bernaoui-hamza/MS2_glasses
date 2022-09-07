package com.example.ms2_glasses.services;

import com.example.ms2_glasses.dto.FournisseurDTO;
import com.example.ms2_glasses.entities.Fournisseur;

import java.util.List;

public interface FournisseurService

{
    public FournisseurDTO saveFournisseur (FournisseurDTO fournisseur);
    public FournisseurDTO getFournisseur(String id);
    public List<FournisseurDTO> listFournisseur();

}
