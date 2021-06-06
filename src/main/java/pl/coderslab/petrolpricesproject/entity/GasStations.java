package pl.coderslab.petrolpricesproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "gas_stations")
public class GasStations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "place_id", nullable = false)
    private String placeId;

    @Column(name = "formatted_address", nullable = false)
    private String formattedAddress;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "opening_hours")
    private String openingHours;

    @Column(name = "price_95")
    private BigDecimal price95;

    @Column(name = "price_98")
    private BigDecimal price98;

    @Column(name = "price_Diesel")
    private BigDecimal priceDiesel;

    @Column(name = "price_Gas")
    private BigDecimal priceGas;

    @Column(name = "price_update_date", nullable = false)
    private OffsetDateTime priceUpdateDate;

    @OneToMany(mappedBy = "gasStations")
    private Set<GasStations_Users> gasStationsUsers;


}

