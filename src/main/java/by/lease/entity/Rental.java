package by.lease.entity;

import by.lease.entity.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "rental")
public class Rental {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(fetch = LAZY)
    private List<Image> images;

    @Column(name = "status")
    @Enumerated(value = STRING)
    private Status status;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "about_id")
    private About about;
}
