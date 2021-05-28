package pl.coderslab.petrolpricesproject.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "gas_stations")
public class GasStations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "formatted_address", nullable = false)
    private String formattedAddress;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "opening_hours")
    private String openingHours;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    public GasStations(){
    }

    public GasStations(Long id, String formattedAddress, String name, String openingHours, BigDecimal price) {
        this.id = id;
        this.formattedAddress = formattedAddress;
        this.name = name;
        this.openingHours = openingHours;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
