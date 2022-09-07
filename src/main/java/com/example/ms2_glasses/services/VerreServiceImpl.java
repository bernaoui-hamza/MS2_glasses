package com.example.ms2_glasses.services;

import com.example.ms2_glasses.dto.VerreDTO;
import com.example.ms2_glasses.entities.Verre;
import com.example.ms2_glasses.mappers.MapperVerre;
import com.example.ms2_glasses.mappers.MapperVerre1;
import com.example.ms2_glasses.mappers.MapperVerre2;
import com.example.ms2_glasses.repositories.VerreRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class VerreServiceImpl implements VerreService {
    MapperVerre2 mapperVerre;
    VerreRepository verreRepository;

    public VerreServiceImpl(MapperVerre2 mapperVerre, VerreRepository verreRepository) {
        this.mapperVerre = mapperVerre;
        this.verreRepository = verreRepository;
    }

    @Override
    public VerreDTO saveVerre(VerreDTO verreDTO) {
        Verre verre=mapperVerre.fromVerreDto( verreDTO);
        verre.setPaysOrigin(verreDTO.getPaysOrigin());
        verre =verreRepository.save(verre);

        VerreDTO verreDTO1=mapperVerre.fromVerre(verre);
        //verreDTO1.setIdVerre(verreDTO.getIdVerre());
       // verreDTO1.setPaysOrigin(verreDTO.getPaysOrigin());
        return verreDTO1;
    }

    @Override
    public VerreDTO getVerre(String id) {
        Verre verre=verreRepository.findById(id).get();
        VerreDTO verreDTO1=mapperVerre.fromVerre(verre);
        return verreDTO1;
    }

    @Override
    public List<VerreDTO> lisVerreDtoList() {
        List<Verre>verres=verreRepository.findAll();
        List<VerreDTO> verreDTOS=verres.stream().map(verre ->
                mapperVerre.fromVerre(verre)).collect(Collectors.toList());

        return verreDTOS;
    }
}
