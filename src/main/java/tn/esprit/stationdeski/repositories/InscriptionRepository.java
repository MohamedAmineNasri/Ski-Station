package tn.esprit.stationdeski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationdeski.entities.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
}
