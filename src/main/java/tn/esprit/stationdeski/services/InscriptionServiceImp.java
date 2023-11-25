package tn.esprit.stationdeski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stationdeski.entities.Inscription;
import tn.esprit.stationdeski.repositories.InscriptionRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionServiceImp implements IInscription{
    private InscriptionRepository inscriptionRepository;
    @Override
    public Inscription AddInscription(Inscription i) {
        return inscriptionRepository.save(i);
    }

    @Override
    public Inscription updateInscription(Inscription i) {
        return inscriptionRepository.save(i);
    }

    @Override
    public List<Inscription> findAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription findById(long idi) {
        return inscriptionRepository.findById(idi).orElse(null);
    }

    @Override
    public void deleteInscription(long idi) {
        inscriptionRepository.deleteById(idi);
    }
}
