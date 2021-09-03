package pl.coderslab.petrolpricesproject.service;

import org.springframework.stereotype.Service;
import pl.coderslab.petrolpricesproject.entity.GasStation;

import java.util.List;

@Service
public interface GasStationsService {
    List<GasStation> getAllGasStations();


}
