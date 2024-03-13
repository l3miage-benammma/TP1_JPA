package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FederationEntity {

    @Id
    private Long id;

    private String name;

    @Column(name = "is_fage_membership")
    private boolean isFageMembership;

    @ManyToMany (mappedBy = "federation")
    private Set<AssociationEntity> associations;
}
