package pl.coderslab.petrolpricesproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.petrolpricesproject.entity.GasStationUser;

public interface GasStationsUserRepository extends JpaRepository<GasStationUser, Long> {
}
