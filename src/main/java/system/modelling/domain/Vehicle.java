package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;
import system.modelling.domain.enums.VehicleStatus;
import system.modelling.domain.enums.VehicleType;

import java.util.List;

@Entity
@Data
public class Vehicle {

    @Id
    @GeneratedValue()
    private Long id;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "model_id")
    private VehicleModel vehicleModel;
    @Enumerated(EnumType.STRING)
    private VehicleType type;
    private Integer year;
    private String registrationNumber;
    private Double dailyRate;
    @Enumerated(EnumType.STRING)
    private VehicleStatus status;
    private String location;
    private Double rating;
    @OneToOne
    @JoinColumn(name = "vehicle_details_id")
    private VehicleDetails vehicleDetails;

    @OneToMany(mappedBy = "vehicle")
    private List<VehicleDocument> documents;
    @OneToMany(mappedBy = "vehicle")
    private List<Review> reviews;
    @OneToMany(mappedBy = "vehicle")
    private List<Rental> rentals;
    @OneToMany(mappedBy = "vehicle")
    private List<Insurance> insurances;

}
