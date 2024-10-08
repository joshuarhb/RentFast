package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;
import system.modelling.domain.enums.DriverStatus;
import system.modelling.domain.enums.DrivingExperience;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class DriverProfile {

    @Id
    @GeneratedValue()
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private Double hourlyRate;
    private String drivingLicenseNumber;
    @Enumerated(EnumType.STRING)
    private DrivingExperience drivingExperience;
    @Enumerated(EnumType.STRING)
    private DriverStatus driverStatus;
    private Double rating;
    private Integer completedRides;
    private LocalDate joinedAt;

    @OneToMany(mappedBy = "driver")
    private List<DriverHire> driverHires;
    @OneToMany(mappedBy = "driver")
    private List<Review> reviews;
}
