package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;
import system.modelling.domain.enums.PaymentStatus;
import system.modelling.domain.enums.ViolationType;

import java.time.LocalDate;

@Entity
@Data
public class Fine {

    @Id
    @GeneratedValue()
    private Long id;
    @ManyToOne
    @JoinColumn(name = "rental_id")
    private Rental rental;
    @Enumerated(EnumType.STRING)
    private ViolationType violationType;
    private Double amount;
    private LocalDate dateIssued;
}
