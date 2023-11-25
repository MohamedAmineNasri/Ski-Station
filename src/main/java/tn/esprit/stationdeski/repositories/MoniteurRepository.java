package tn.esprit.stationdeski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationdeski.entities.Moniteur;

public interface MoniteurRepository extends JpaRepository<Moniteur,Long > {
}
