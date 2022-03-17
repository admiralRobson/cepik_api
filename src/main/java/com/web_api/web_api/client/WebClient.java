package com.web_api.web_api.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WebClient {
    

    private  RestTemplate restTemplate = new RestTemplate();
    private final static String URL_PATH_VEHICLES = "https://api.cepik.gov.pl/";


    public String getCarVehicles(String voideship, String date_from) {
        
        return callgetMethod("pojazdy?wojewodztwo={voideship}&data_od=20210101", 
                                String.class, 
                                voideship, date_from);

    }

    // dodanie nowej metody, uniwersalnej dla rest api
    private <T> T callgetMethod(String urlPath, Class<T> responsetype, Object...objects)
    {
        
        return restTemplate.getForObject(URL_PATH_VEHICLES + urlPath, responsetype, objects);
        
    }

}
