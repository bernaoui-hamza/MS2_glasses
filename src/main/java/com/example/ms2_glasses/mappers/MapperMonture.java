package com.example.ms2_glasses.mappers;

import com.example.ms2_glasses.dto.MontureDto;
import com.example.ms2_glasses.entities.Monture;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperMonture {
    Monture fromMontureDTO(MontureDto montureDto);
    MontureDto fromMonture(Monture monture);
}
