package fr.uga.l3miage.tp1.exo2.models;
import javax.persistence.*;
import fr.uga.l3miage.tp1.exo2.enums.typeAccount;
@Table(name = "netflix_account")
public class NetflixAccountEntity {
    @Id
    private Long id;

    @Column(name = "nb_devices")
    private Integer nb_devices;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_account")
    private typeAccount typeAccount;

    @Column(name = "uuid_user")
    private String uuidUser;

    @OneToOne(mappedBy = "netflix_account")
    private NetflixUserEntity netflixUser;
}
