package tn.esprit.stationdeski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stationdeski.entities.Abonnement;
import tn.esprit.stationdeski.repositories.AbonnementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AbonnementServiceImp implements IAbonnement{
    private AbonnementRepository abonnementRepository;
    @Override
    public Abonnement AddAbonnement(Abonnement A) {
        return abonnementRepository.save(A);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement A) {
        return abonnementRepository.save(A);
    }

    @Override
    public List<Abonnement> findAllAbonnement() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement findById(long idA) {
        return abonnementRepository.findById(idA).orElse(null);
    }

    @Override
    public void deleteAbonnement(long idA) {
        abonnementRepository.deleteById(idA);
    }
}
