package tn.esprit.stationdeski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationdeski.entities.Abonnement;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
}
