package system.modelling.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue()
    private Long id;
    private String name;
    private String surname;
    private String phoneNumber;
    private Boolean isDriver;
    private LocalDateTime createdDate;
    private Double rating;

    @OneToMany(mappedBy = "user")
    private List<Address> addresses;
    @OneToOne(mappedBy = "user")
    private UserCredential userCredential;
    @OneToMany(mappedBy = "user")
    private List<Vehicle> vehicles;
    @OneToOne(mappedBy = "user")
    private DriverProfile driverProfile;
    @OneToMany(mappedBy = "user")
    private List<DriverHire> driverHires;
    @OneToMany(mappedBy = "reviewer")
    private List<Review> reviews;
    @OneToMany(mappedBy = "user")
    private List<Review> reviewList;
    @OneToMany(mappedBy = "renter")
    private List<Rental> rentals;
    @OneToMany(mappedBy = "user")
    private List<Subscription> subscriptions;
}
