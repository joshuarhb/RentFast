package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;
import system.modelling.domain.enums.PaymentMethod;
import system.modelling.domain.enums.PaymentStatus;
import system.modelling.domain.enums.PaymentType;
import system.modelling.domain.enums.RentalStatus;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Rental {

    @Id
    @GeneratedValue()
    private Long id;
    @ManyToOne
    @JoinColumn(name = "renter_id")
    private User renter;
    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
    private LocalDateTime startedAt;
    private LocalDateTime finishedAt;
    private Double price;
    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;
    @Enumerated(EnumType.STRING)
    private RentalStatus rentalStatus;
    private String pickUpLocation;
    private String dropOffLocation;

    @OneToMany(mappedBy = "rental")
    private List<Fine> fines;
}
