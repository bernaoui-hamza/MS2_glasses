package com.example.ms2_glasses.services;

import com.example.ms2_glasses.dto.FournisseurDTO;
import com.example.ms2_glasses.dto.PerchaseDTO;
import com.example.ms2_glasses.entities.Perchase;

import java.util.List;

public interface PerchaseService {
    public PerchaseDTO savePerchase (PerchaseDTO fournisseur);
    public PerchaseDTO getPerchase(String id);
    public List<PerchaseDTO> listPerchase();}
