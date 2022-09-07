package com.example.ms2_glasses.web;

import com.example.ms2_glasses.dto.MontureDto;
import com.example.ms2_glasses.dto.PerchaseDTO;
import com.example.ms2_glasses.dto.SalesDTO;
import com.example.ms2_glasses.dto.VerreDTO;
import com.example.ms2_glasses.services.MontureService;
import com.example.ms2_glasses.services.PerchaseService;
import com.example.ms2_glasses.services.SalesService;
import com.example.ms2_glasses.services.VerreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "api")
public class GlasseRestApi {

    MontureService montureService;
    SalesService salesService;
    VerreService verreService;
    PerchaseService perchaseService;

    public GlasseRestApi(MontureService montureService, SalesService salesService, VerreService verreService, PerchaseService perchaseService) {
        this.montureService = montureService;
        this.salesService = salesService;
        this.verreService=verreService;
        this.perchaseService=perchaseService;
    }

    @GetMapping(path = "/getMonture/{id}")
    public MontureDto getMonture(@PathVariable(name = "id") String id) {
        return montureService.getMouture(id);
    }

    @GetMapping(path = "/listMonture")
    public List<MontureDto> listMonture() {
        return montureService.MONTURE_DTOS();
    }

    @GetMapping(path = "/listSales")
    public List<SalesDTO> listSales() {
        return salesService.salesList();
    }

    @GetMapping(path = "/getSale/{id}")
    public SalesDTO salesDTO(@PathVariable(name = "id") String id) {
        return salesService.getSales(id);

    }
    @GetMapping(path = "/getVerre/{id}")
    public VerreDTO getVerre (@PathVariable(name = "id") String id)
    {return verreService.getVerre(id);}

    @GetMapping(path = "/listVerre")
    public List<VerreDTO> verreDTOS(){
        return verreService.lisVerreDtoList();
    }
    @GetMapping(path = "/listPerchases")
    public List<PerchaseDTO> perchaseDTOS(){
        return perchaseService.listPerchase();
    }
    @GetMapping(path = "/getPerchase/{id}")
    public PerchaseDTO getPerchase(@PathVariable(name = "id") String id){
        return perchaseService.getPerchase(id);
    }

}
