package com.example.ms2_glasses.mappers;

import com.example.ms2_glasses.dto.SalesDTO;
import com.example.ms2_glasses.entities.Sales;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperSales1 {
    Sales fromSalesDTO(SalesDTO salesDTO);
    SalesDTO fromSales(Sales sales);
}
