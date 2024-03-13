package fr.uga.l3miage.tp1.exo2.models;

import org.hibernate.Session;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name="User")
public class User {
    @Id
    private Long idUser;

    private boolean SSO;

    private OffsetDateTime lastConnexion;
    @OneToOne
    private Session session;
}
