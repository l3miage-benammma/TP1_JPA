package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="bikes")
public class BikeEntity {
    @Id
    @Column(name = "immatriculation")
    private String immatriculation;

    @Column(name = "capacité")
    private Integer capacity;

    @Column(name = "numero-cylindre")
    @Enumerated(EnumType.ORDINAL)
    private CylinderNumber cylinderNumber;

    @Column(name = "automatique")
    private boolean automatic;

    @Column(name = "shifter")
    private boolean Shifter;

    @Column(name = "type-shifter",length = 255)
    @Enumerated(EnumType.STRING)
    private ShifterType shifterType;

    @Column(name = "date_circulation")
    private LocalDate circulationDate;
}
