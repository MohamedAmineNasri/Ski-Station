package tn.esprit.stationdeski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationdeski.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long> {
}
