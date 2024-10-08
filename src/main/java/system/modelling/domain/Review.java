package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;
import system.modelling.domain.enums.ReviewType;

import java.time.LocalDateTime;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "reviewer_id")
    private User reviewer;
    @Enumerated(EnumType.STRING)
    private ReviewType reviewType;
    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
    @ManyToOne
    @JoinColumn(name = "driver_profile_id")
    private DriverProfile driverProfile;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private Integer rating;
    private String comment;
    private LocalDateTime reviewedAt;
}
