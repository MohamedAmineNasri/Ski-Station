package tn.esprit.stationdeski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationdeski.entities.Piste;

public interface PisteRepository extends JpaRepository<Piste, Long> {
}
