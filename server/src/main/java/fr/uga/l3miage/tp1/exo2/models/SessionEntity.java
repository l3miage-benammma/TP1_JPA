package fr.uga.l3miage.tp1.exo2.models;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "session")
public class SessionEntity {

    @Id
    @GeneratedValue
    private UUID idSession;

    @Column(name = "last_command")
    private String lastCommand;

    @Column(name = "current_dir")
    private String currentDir;

    @Column
    private boolean lock;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "idUser")
    private UserEntity user;
}