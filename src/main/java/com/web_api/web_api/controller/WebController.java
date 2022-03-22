package com.web_api.web_api.controller;

import com.web_api.web_api.controller.dtos.VehiceDto;
import com.web_api.web_api.service.WebService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class WebController {
    
    private final WebService webService;

    @GetMapping("/webs")
    public String getWebS(){
        
        return webService.getCepik();
    }


    @GetMapping("/cars")
    public VehiceDto getCars() {
        return webService.getCars();
    }
}
