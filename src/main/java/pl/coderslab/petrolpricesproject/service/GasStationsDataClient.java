package pl.coderslab.petrolpricesproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.coderslab.petrolpricesproject.entity.GasStations;

@Component
@RequiredArgsConstructor
public class GasStationsDataClient {

    private static final String AUTHORIZATION_HEADER = "AIzaSyCu7-2B-oQTbOAsryc1z1LAPaMiZYxWrsw";

    private final RestTemplate  restTemplate;
    private final String authorizationToken;


}
