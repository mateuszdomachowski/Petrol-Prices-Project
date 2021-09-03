package pl.coderslab.petrolpricesproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.petrolpricesproject.entity.GasStation;
import pl.coderslab.petrolpricesproject.entity.GasStationUser;

@Repository
public interface GasStationsRepository extends JpaRepository<GasStation, Long> {

//    @Query("SELECT GasStation FROM GasStation gastation INNER JOIN GasStationUser gasstationuser ON gastation.id = gasstationuser.gasStationsId INNER JOIN User user ON " +
//            "")
//    public GasStationUser findGasStationsById(Integer id);
}
