package com.example.ms2_glasses.services;

import com.example.ms2_glasses.dto.SalesDTO;
import com.example.ms2_glasses.entities.Sales;
import com.example.ms2_glasses.mappers.MapperSales;
import com.example.ms2_glasses.mappers.MapperSales1;
import com.example.ms2_glasses.mappers.MapperSales2;
import com.example.ms2_glasses.repositories.SalesRepository;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class SalesServiceImpl implements SalesService {
    MapperSales2 mapperSales;
    SalesRepository salesRepository;

    public SalesServiceImpl(MapperSales2 mapperSales, SalesRepository salesRepository) {
        this.mapperSales = mapperSales;
        this.salesRepository = salesRepository;
    }

    @Override
    public SalesDTO saveSales(SalesDTO salesDTO) {
        Sales sales = mapperSales.fromSalesDTO(salesDTO);;
       // sales.fromSalesDTO(salesDTO);
       // sales.setId(salesDTO.getId());
        sales = salesRepository.save(sales);
        SalesDTO salesDTO1 = mapperSales.fromSales(sales);
        return salesDTO1;
    }

    @Override
    public SalesDTO getSales(String id) {
        Sales sales = salesRepository.findById(id).get();
        SalesDTO salesDTO = mapperSales.fromSales(sales);
        return salesDTO;
    }

    @Override
    public List<SalesDTO> salesList() {
        List<Sales> salesList = salesRepository.findAll();
        List<SalesDTO> salesDTOS = salesList.stream().map(sales ->
                mapperSales.fromSales(sales)).collect(Collectors.toList());


        return salesDTOS;
    }
}
