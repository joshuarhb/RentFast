package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;
import system.modelling.domain.enums.ViolationType;

import java.time.LocalDate;

@Entity
@Data
public class Promotion {

    @Id
    @GeneratedValue()
    private Long id;
    private String code;
    private String description;
    private Double discountPercentage;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double isActive;
}
