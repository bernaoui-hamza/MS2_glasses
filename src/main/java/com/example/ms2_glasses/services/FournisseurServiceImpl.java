package com.example.ms2_glasses.services;

import com.example.ms2_glasses.dto.FournisseurDTO;
import com.example.ms2_glasses.entities.Fournisseur;
import com.example.ms2_glasses.mappers.MapperFournisseur;
import com.example.ms2_glasses.mappers.MapperFournisseur1;
import com.example.ms2_glasses.repositories.FourinisseurRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class FournisseurServiceImpl implements FournisseurService {
    MapperFournisseur1 mapperFournisseur;
    FourinisseurRepository fourinisseurRepository;

    public FournisseurServiceImpl(FourinisseurRepository fourinisseurRepository,MapperFournisseur1 mapperFournisseur) {
        this.fourinisseurRepository=fourinisseurRepository;
        this.mapperFournisseur = mapperFournisseur;
    }

    @Override
    public FournisseurDTO saveFournisseur(FournisseurDTO fournisseur) {
        Fournisseur fournisseur1=mapperFournisseur.fromFournisseurDTO(fournisseur);
        fournisseur1=fourinisseurRepository.save(fournisseur1);
        FournisseurDTO fournisseurDTO=mapperFournisseur.fromFournisseur(fournisseur1);
        return fournisseurDTO;
    }

    @Override
    public FournisseurDTO getFournisseur(String id) {
        Fournisseur fournisseur=fourinisseurRepository.findById(id).get();
        FournisseurDTO fournisseurDTO=mapperFournisseur.fromFournisseur(fournisseur);

        return fournisseurDTO;
    }

    @Override
    public List<FournisseurDTO> listFournisseur() {
        List<Fournisseur> fournisseurs=fourinisseurRepository.findAll();
        List<FournisseurDTO>fournisseurDTOS=fournisseurs.stream()
                .map(fournisseur -> mapperFournisseur.fromFournisseur(fournisseur))
                .collect(Collectors.toList());

        return fournisseurDTOS;
    }
}
