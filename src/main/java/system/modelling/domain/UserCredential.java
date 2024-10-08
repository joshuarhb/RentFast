package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class UserCredential {

    @Id
    @GeneratedValue()
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String email;
    private String password;
}
