package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;
import system.modelling.domain.enums.RentalStatus;
import system.modelling.domain.enums.SubscriptionType;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Subscription {

    @Id
    @GeneratedValue()
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Enumerated(EnumType.STRING)
    private SubscriptionType subscriptionType;
    private LocalDate startedAt;
    private LocalDate finishedAt;
    private Double renewalAmount;
    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;
}
