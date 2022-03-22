package com.web_api.web_api.client;

import com.web_api.web_api.controller.dtos.VehiceDto;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WebClient {
    

    private  RestTemplate restTemplate = new RestTemplate();
    private final static String URL_PATH_VEHICLES = "https://api.cepik.gov.pl/";


    public VehiceDto getCarVehicles(String wojewodztwo, String date_from) {
        
        // return URL_PATH_VEHICLES +String.format("pojazdy?wojewodztwo=%s&data-od=%s", wojewodztwo, date_from);

        return callgetMethod(String.format("pojazdy?wojewodztwo=%s&data-od=%s", wojewodztwo, date_from), VehiceDto.class, wojewodztwo, date_from);

    

    }

    // dodanie nowej metody, uniwersalnej dla rest api
    private <T> T callgetMethod(String urlPath, Class<T> responsetype, Object...objects)
    {
        
        return restTemplate.getForObject(URL_PATH_VEHICLES + urlPath, responsetype, objects);
        
    }

}
