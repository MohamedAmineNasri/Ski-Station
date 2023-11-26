package tn.esprit.stationdeski.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkieur;
    private String nomS;
    private String prenomS;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String ville;
    @JsonIgnore
    @ManyToMany(mappedBy = "skieurs")
    private Set<Piste> pistes;

    @OneToMany(mappedBy = "skieur")//one to many mapped by fili 3Ndou cardinalié a9al
    private Set<Inscription>inscriptions;

    @OneToOne
    private Abonnement abonnementList;
}
