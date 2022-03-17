package com.web_api.web_api.controller.dtos;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class VehiculeAttributesDto {
    
    private long vehicle_id; 
    private String marka; 
    private String kategoria_pojazd; 
    private String typ; 
    private String model; 
    private String wariant; 
    private String rodzaj_pojazdu; 
    private String pochodzenie_pojazdu; 
    private String rok_produkcji; 
    private Date data_pierwszej_rejestracji_w_kraju; 
    private int pojemnosc_skokowa_silnika; 
    private int masa_wlasna; 
    private String rodzaj_paliwa; 
    private String kod;
}
