package fr.uga.l3miage.tp1.exo2.models;
import javax.persistence.*;
import fr.uga.l3miage.tp1.exo2.enums.typeAccount;

public class netflix_account {
    @Id
    private Long id;

    @Column(name = "nb_devices")
    private Integer nb_devices;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_account")
    private typeAccount typeAccount;

    @Column(name = "uuid_user")
    private String uuidUser;

    @OneToOne
    @JoinColumn(name = "uuid_user", referencedColumnName = "uuid") // uuid_user est une clé étrangère
    private netflix_user netflixUser;
}
