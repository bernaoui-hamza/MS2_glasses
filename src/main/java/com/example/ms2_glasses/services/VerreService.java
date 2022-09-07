package com.example.ms2_glasses.services;

import com.example.ms2_glasses.dto.VerreDTO;

import java.util.List;

public interface VerreService {
    public VerreDTO saveVerre(VerreDTO verreDTO);
    public VerreDTO getVerre(String id);
    public List<VerreDTO> lisVerreDtoList();
}
