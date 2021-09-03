package pl.coderslab.petrolpricesproject.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Component
@Table(name = "gas_stations")
public class GasStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "place_id", nullable = false, unique = true)
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

    @OneToMany(mappedBy = "gasStationsId", fetch = FetchType.LAZY)
    private Set<GasStationUser> gasStationsUsers;


}

