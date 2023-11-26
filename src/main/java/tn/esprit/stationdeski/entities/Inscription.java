package tn.esprit.stationdeski.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInscription;
    private int numSemaine;

    @ManyToOne
    private Skieur skieur;

    @ManyToOne
    private Cours cours;
}
