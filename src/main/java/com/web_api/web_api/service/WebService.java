package com.web_api.web_api.service;

import com.web_api.web_api.client.WebClient;
import com.web_api.web_api.controller.dtos.VehiceDto;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class WebService {
    
    
    private  RestTemplate restTemplate = new RestTemplate();
    private final static String URL_PATH = "https://api.cepik.gov.pl/";
    private final static String URL_PATH_VEHICLES = "https://api.cepik.gov.pl/pojazdy?wojewodztwo=";
    private final WebClient webClient;


    public String getCepik() 
    {
        String response = restTemplate.getForObject(URL_PATH, String.class);
        log.info(response);

        return response;
    }


    public VehiceDto getCars() {
        return webClient.getCarVehicles("06","20210101");

    }

}
