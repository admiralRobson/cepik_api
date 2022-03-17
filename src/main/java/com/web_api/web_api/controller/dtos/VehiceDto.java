package com.web_api.web_api.controller.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehiceDto {
    
    private long id; 
    private String type; 
    private VehiculeAttributesDto attributes;
}


