package com.example.ms2_glasses.services;


import com.example.ms2_glasses.dto.SalesDTO;

import java.util.List;

public interface SalesService {
    public SalesDTO saveSales(SalesDTO salesDTO);
    public SalesDTO getSales(String id);
    public List<SalesDTO> salesList();
}
