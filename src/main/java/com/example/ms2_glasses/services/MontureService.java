package com.example.ms2_glasses.services;

import com.example.ms2_glasses.dto.MontureDto;

import java.util.List;

public interface MontureService {
    public MontureDto saveMonture(MontureDto montureDto);
    public MontureDto getMouture(String id);
    public List<MontureDto> MONTURE_DTOS();

}
