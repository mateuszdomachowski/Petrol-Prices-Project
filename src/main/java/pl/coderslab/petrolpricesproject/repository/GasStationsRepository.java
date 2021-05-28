package pl.coderslab.petrolpricesproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.petrolpricesproject.entity.GasStations;

@Repository
public interface GasStationsRepository extends JpaRepository<GasStations, Long> {



}
