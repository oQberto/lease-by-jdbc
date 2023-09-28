package by.lease.entity;

import by.lease.entity.enums.Furnished;
import by.lease.entity.enums.ParkingType;
import by.lease.entity.enums.PropertyType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "about")
public class About {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "property_type")
    @Enumerated(value = STRING)
    private PropertyType propertyType;

    @Column(name = "parking_type")
    @Enumerated(value = STRING)
    private ParkingType parkingType;

    @Column(name = "lease_term")
    private LocalDate leaseTerm;

    @Column(name = "short_term")
    private LocalDate shortTerm;

    @Column(name = "furnished")
    @Enumerated(STRING)
    private Furnished furnished;

    @Column(name = "year_built")
    private LocalDate yearBuilt;
}
