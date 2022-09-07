package com.example.ms2_glasses.services;

import com.example.ms2_glasses.dto.FournisseurDTO;
import com.example.ms2_glasses.dto.PerchaseDTO;
import com.example.ms2_glasses.entities.Fournisseur;
import com.example.ms2_glasses.entities.Perchase;
import com.example.ms2_glasses.mappers.MapperFournisseur;
import com.example.ms2_glasses.mappers.MapperPerchace;
import com.example.ms2_glasses.mappers.MapperPerchace1;
import com.example.ms2_glasses.repositories.PerchaseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class PerchaseServiceImpl implements PerchaseService {
   MapperPerchace1 mapperPerchace;
   PerchaseRepository perchaseRepository;

    public PerchaseServiceImpl(MapperPerchace1 mapperPerchace, PerchaseRepository perchaseRepository) {
        this.mapperPerchace = mapperPerchace;
        this.perchaseRepository = perchaseRepository;
    }

    @Override
    public PerchaseDTO savePerchase(PerchaseDTO perchaseDTO) {
        Perchase perchase=mapperPerchace.fromPerchaseDTO(perchaseDTO);
        perchase.setIdPershase(perchaseDTO.getIdPershase());
        perchase=perchaseRepository.save(perchase);
        PerchaseDTO perchaseDTO1=mapperPerchace.fromPerchase(perchase);
        return perchaseDTO1;

    }

    @Override
    public PerchaseDTO getPerchase(String id) {
        Perchase perchase=perchaseRepository.findById(id).get();
        PerchaseDTO perchaseDTO=mapperPerchace.fromPerchase(perchase);
        perchaseDTO.setIdPershase(perchase.getIdPershase());

        return perchaseDTO;

    }

    @Override
    public List<PerchaseDTO> listPerchase() {

        List<Perchase> perchases=perchaseRepository.findAll();
        List<PerchaseDTO>perchaseDTOS=perchases.stream()
                .map(perchase -> mapperPerchace.fromPerchase(perchase))
                .collect(Collectors.toList());

        return perchaseDTOS;
    }
}
