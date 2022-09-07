package com.example.ms2_glasses.services;

import com.example.ms2_glasses.dto.MontureDto;
import com.example.ms2_glasses.entities.Monture;
import com.example.ms2_glasses.mappers.MapperMonture;
import com.example.ms2_glasses.repositories.MontureRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MontureServiceImpl implements MontureService {
    MontureRepository montureRepository;
    MapperMonture mapperMonture;

    public MontureServiceImpl(MontureRepository montureRepository,MapperMonture mapperMonture) {
        this.montureRepository = montureRepository;
        this.mapperMonture=mapperMonture;
    }

    @Override
    public MontureDto saveMonture(MontureDto montureDto) {
        Monture monture=mapperMonture.fromMontureDTO(montureDto);
        monture=montureRepository.save(monture);
        MontureDto montureDto1=mapperMonture.fromMonture(monture);
        return montureDto1;
    }

    @Override
    public MontureDto getMouture(String id) {
        Monture monture=montureRepository.findById(id).get();
        MontureDto montureDto=mapperMonture.fromMonture(monture);

        return montureDto;
    }

    @Override
    public List<MontureDto> MONTURE_DTOS() {
        List<Monture>montures=montureRepository.findAll();
        List<MontureDto>montureDtos=montures.stream().
                map(monture -> mapperMonture.fromMonture(monture)).collect(Collectors.toList());

        return montureDtos;
    }
}
