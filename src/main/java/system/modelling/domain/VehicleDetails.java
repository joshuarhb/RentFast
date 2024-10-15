package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;
import system.modelling.domain.enums.FuelType;

@Entity
@Data
public class VehicleDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean hasSelfDriving;
    private Boolean hasBluetoothAudioConnectivity;
    private Boolean hasComplimentaryWater;
    private Boolean hasHeatedSeats;
    private Integer numberOfSeats;
    private Integer numberOfDoors;
    @Enumerated(EnumType.STRING)
    private FuelType fuelType;

    @OneToOne(mappedBy = "vehicleDetails")
    private Vehicle vehicle;

}