package fr.uga.l3miage.tp1.exo2.models;

import org.hibernate.Session;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name="User")
public class User {
    @Id
    @Column
    private Long idUser;

    @Column
    private boolean SSO;

    @Column
    private OffsetDateTime lastConnexion;
    @OneToOne(mappedBy = "Session")
    private Session session;
}
