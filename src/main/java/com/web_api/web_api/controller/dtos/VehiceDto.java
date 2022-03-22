package com.web_api.web_api.controller.dtos;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Component
public class VehiceDto {
    
    private long id; 
    private String type; 
    private VehiculeAttributesDto attributes;
}


