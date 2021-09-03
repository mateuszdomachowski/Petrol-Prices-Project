package pl.coderslab.petrolpricesproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
@RequiredArgsConstructor
public class GasStationsDataClient {

    private static final String GET_ALL_GASSTATIONS_API = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=52.286981,21.079256&radius=5000&type=gas_station&key=AIzaSyCu7-2B-oQTbOAsryc1z1LAPaMiZYxWrsw";

    public static void getGasStationsResponse() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(GET_ALL_GASSTATIONS_API))
                .build();

//        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
