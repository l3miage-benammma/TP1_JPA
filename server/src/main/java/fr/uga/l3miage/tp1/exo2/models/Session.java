package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.util.UUID;

@Table(name="session")
public class Session {
    @Id
    @Column
    private UUID idSession;

    @Column
    private String lastCommand;

    @Column
    private String currentDir;

    @Column
    private boolean lock;

    @OneToOne
    private User user;
}
