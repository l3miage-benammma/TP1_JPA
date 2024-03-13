package fr.uga.l3miage.tp1.exo3.models;
import javax.persistence.*;
import fr.uga.l3miage.tp1.exo3.enums.BrandType;

import java.util.Set;

@Entity
@Table(name="brand_miage")
public class BrandEntity {
    @Id
    @Column(name = "siretNumber", length = 11)
    private String siretNumber;

    @Column(name = "company_name")
    private String companyName;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private BrandType type;

    @ManyToOne
    private Set<ProductEntity> products;
}
