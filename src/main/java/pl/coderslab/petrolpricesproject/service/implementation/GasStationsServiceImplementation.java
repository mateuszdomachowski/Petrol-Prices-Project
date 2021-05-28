package pl.coderslab.petrolpricesproject.service.implementation;

import org.springframework.stereotype.Service;
import pl.coderslab.petrolpricesproject.entity.GasStations;
import pl.coderslab.petrolpricesproject.repository.GasStationsRepository;
import pl.coderslab.petrolpricesproject.service.GasStationsService;

import java.util.List;

@Service
public class GasStationsServiceImplementation implements GasStationsService {

    private GasStationsRepository gasStationsRepository;

    public GasStationsServiceImplementation(GasStationsRepository gasStationsRepository) {
        this.gasStationsRepository = gasStationsRepository;
    }

    @Override
    public List<GasStations> getAllGasStations() {
        return gasStationsRepository.findAll();
    }
}
