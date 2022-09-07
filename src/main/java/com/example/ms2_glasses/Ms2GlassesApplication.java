package com.example.ms2_glasses;

import com.example.ms2_glasses.dto.*;
import com.example.ms2_glasses.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class Ms2GlassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ms2GlassesApplication.class, args);
    }
@Bean
    CommandLineRunner commandLineRunner(MontureService montureService, SalesService salesService,
                                        VerreService verreService, PerchaseService perchaseService,
                                        FournisseurService fournisseurService){
        return args -> {
            montureService.saveMonture(new MontureDto("c01","2XFT5","cyan","USA"));
FournisseurDTO fournisseurDTO=new FournisseurDTO("fo1","mohamed","casa ");
            fournisseurService.saveFournisseur(fournisseurDTO);

            montureService.saveMonture(new MontureDto("c02","99AAT5","majenta","UK"));
       salesService.saveSales(new SalesDTO("s1","nom1","10"));
            salesService.saveSales(new SalesDTO("s2","nom2","20"));
            salesService.saveSales(new SalesDTO("s3","nom3","30"));
            verreService.saveVerre(new VerreDTO("v1","verre1","indonisie"));
            verreService.saveVerre(new VerreDTO("v2","verre2","Allemagne"));
            verreService.saveVerre(new VerreDTO("v3","verre3","France"));
            perchaseService.savePerchase(new PerchaseDTO("per1","perchase1",33,fournisseurDTO));
            perchaseService.savePerchase(new PerchaseDTO("pe2","perchase2",12,fournisseurDTO));

        };
    }
}
