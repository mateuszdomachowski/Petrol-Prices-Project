package pl.coderslab.petrolpricesproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table
public class GasStationUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "gasStations_id", referencedColumnName = "place_id",insertable = false, updatable = false)
    private GasStation gasStationsId;

    @ManyToOne
    @JoinColumn(name = "users_id",insertable = false, updatable = false)
    private User usersId;

}
