package com.example.ms2_glasses.mappers;

import com.example.ms2_glasses.dto.PerchaseDTO;
import com.example.ms2_glasses.entities.Perchase;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperPerchace1 {
    Perchase fromPerchaseDTO(PerchaseDTO perchaseDTO);
    PerchaseDTO fromPerchase(Perchase perchase);
}
