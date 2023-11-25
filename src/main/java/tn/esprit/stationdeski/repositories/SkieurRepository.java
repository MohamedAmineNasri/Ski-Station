package tn.esprit.stationdeski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationdeski.entities.Skieur;

public interface SkieurRepository extends JpaRepository<Skieur, Long> {
}
