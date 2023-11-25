package tn.esprit.stationdeski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stationdeski.entities.Moniteur;
import tn.esprit.stationdeski.repositories.MoniteurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MoniteurServiceImp implements IMoniteur{
    private MoniteurRepository moniteurRepository;
    @Override
    public Moniteur AddMoniteur(Moniteur m) {
        return moniteurRepository.save(m);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur m) {
        return moniteurRepository.save(m);
    }

    @Override
    public List<Moniteur> findAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur findById(long idm) {
        return moniteurRepository.findById(idm).orElse(null);
    }

    @Override
    public void deleteMoniteur(long idm) {
        moniteurRepository.deleteById(idm);
    }
}
