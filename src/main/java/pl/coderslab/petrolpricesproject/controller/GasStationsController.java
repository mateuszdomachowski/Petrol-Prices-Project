package pl.coderslab.petrolpricesproject.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.petrolpricesproject.repository.GasStationsRepository;
import pl.coderslab.petrolpricesproject.service.GasStationsDataClient;
import pl.coderslab.petrolpricesproject.service.GasStationsService;

import java.io.IOException;
import java.net.http.HttpClient;

@Controller
public class GasStationsController {

    private GasStationsService gasStationsService;
    private GasStationsRepository gasStationsRepo;

    public GasStationsController(GasStationsService gasStationsService, GasStationsRepository gasStationsRepo) {
        this.gasStationsService = gasStationsService;
        this.gasStationsRepo = gasStationsRepo;
    }

    @GetMapping("/mygasstations")
    public String listGasStations(Model model) {
        return "my_gas_stations";
    }

    @GetMapping("/test")
    public @ResponseBody void test() throws IOException, InterruptedException {
        GasStationsDataClient.getGasStationsResponse();
    }
 }
