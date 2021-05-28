package pl.coderslab.petrolpricesproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.petrolpricesproject.service.GasStationsService;

@Controller
public class GasStationsController {

    private GasStationsService gasStationsService;

    public GasStationsController(GasStationsService gasStationsService) {
        this.gasStationsService = gasStationsService;
    }

    @GetMapping("/gas")
    public String listGasStations(Model model) {
        model.addAttribute("gas", gasStationsService.getAllGasStations());
        return "gas";
    }
}
