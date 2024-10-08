package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;
import system.modelling.domain.enums.DriverHireStatus;
import system.modelling.domain.enums.DriverStatus;
import system.modelling.domain.enums.DrivingExperience;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class DriverHire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private DriverProfile driver;
    private LocalDateTime hireStartTime;
    private LocalDateTime hireEndTime;
    private Double hourlyRate;
    private Double totalCost;
    @Enumerated(EnumType.STRING)
    private DriverHireStatus status;
}
