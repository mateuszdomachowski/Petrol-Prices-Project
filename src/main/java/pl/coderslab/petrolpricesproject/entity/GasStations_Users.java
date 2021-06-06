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
public class GasStations_Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "gasStations_id", insertable = false, updatable = false)
    private GasStations gasStations;

    @ManyToOne
    @JoinColumn(name = "users_id", insertable = false, updatable = false)
    private Users users;

}
