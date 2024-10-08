package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Insurance {

    @Id
    @GeneratedValue()
    private Long id;
    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
    private String providerName;
    private String policyNumber;
    private LocalDate validFrom;
    private LocalDate validUntil;
}
