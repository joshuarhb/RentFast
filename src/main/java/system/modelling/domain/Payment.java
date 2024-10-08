package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;
import system.modelling.domain.enums.PaymentMethod;
import system.modelling.domain.enums.PaymentStatus;
import system.modelling.domain.enums.PaymentType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Payment {

    @Id
    @GeneratedValue()
    private Long id;
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;
    private Double amount;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    private LocalDateTime date;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @OneToOne(mappedBy = "payment")
    private Rental rental;
    @OneToOne(mappedBy = "payment")
    private Subscription subscription;

}
