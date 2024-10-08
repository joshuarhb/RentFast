package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class VehicleModel {

    @Id
    @GeneratedValue()
    private Long id;
    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private VehicleManufacturer manufacturer;
    private String name;

    @OneToMany(mappedBy = "vehicleModel")
    private List<Vehicle> vehicles;

}
