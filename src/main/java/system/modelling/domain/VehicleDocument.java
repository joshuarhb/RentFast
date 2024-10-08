package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.w3c.dom.DocumentType;
import system.modelling.domain.enums.MediaType;

@Entity
@Data
public class VehicleDocument {

    @Id
    @GeneratedValue()
    private Long id;
    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
    private String documentUrl;
    @Enumerated(EnumType.STRING)
    private MediaType mediaType;

}
