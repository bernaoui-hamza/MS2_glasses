package com.example.ms2_glasses.mappers;

import com.example.ms2_glasses.dto.VerreDTO;
import com.example.ms2_glasses.entities.Verre;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperVerre {
    Verre fromVerreDto(VerreDTO verreDTO);
    VerreDTO fromVerre(Verre verre);

}
