package com.example.ms2_glasses.mappers;

import com.example.ms2_glasses.dto.FournisseurDTO;
import com.example.ms2_glasses.entities.Fournisseur;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperFournisseur1 {
    Fournisseur fromFournisseurDTO(FournisseurDTO fournisseurDTO);
    FournisseurDTO fromFournisseur(Fournisseur fournisseur);
}
