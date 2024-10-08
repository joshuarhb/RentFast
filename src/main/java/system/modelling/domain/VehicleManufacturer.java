package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;
import system.modelling.domain.enums.VehicleStatus;
import system.modelling.domain.enums.VehicleType;

import java.util.List;

@Entity
@Data
public class VehicleManufacturer {

    @Id
    @GeneratedValue()
    private Long id;
    private String name;

    @OneToMany(mappedBy = "manufacturer")
    private List<VehicleModel> vehicles;

}
