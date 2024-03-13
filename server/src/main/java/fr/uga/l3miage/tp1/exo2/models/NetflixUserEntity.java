package fr.uga.l3miage.tp1.exo2.models;
import fr.uga.l3miage.tp1.exo2.enums.Sex;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "netflix_user")
public class NetflixUserEntity {

    @Id
    @Column
    private Long id;

    @Column
    private String uuid;

    @Column
    private String lastname;

    @Column
    private String firstname;

    @Enumerated(EnumType.STRING)
    @Column(length = 2)
    private Sex sex;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @OneToOne
    private NetflixAccountEntity netflixAccount;
}
