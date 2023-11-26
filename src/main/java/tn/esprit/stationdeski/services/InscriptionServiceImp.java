package tn.esprit.stationdeski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stationdeski.entities.Cours;
import tn.esprit.stationdeski.entities.Inscription;
import tn.esprit.stationdeski.entities.Skieur;
import tn.esprit.stationdeski.repositories.CoursRepository;
import tn.esprit.stationdeski.repositories.InscriptionRepository;
import tn.esprit.stationdeski.repositories.SkieurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionServiceImp implements IInscription{
    private InscriptionRepository inscriptionRepository;
    private SkieurRepository skieurRepository;
    private CoursRepository coursRepository;
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

    @Override
    public Inscription addInscriptionAndAssignSkuer(Inscription inscription, long numSkirur) {
        Skieur skieur = skieurRepository.findById(numSkirur).orElse(null);
        inscription.setSkieur(skieur);
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription assignRegistrationToCourse(Inscription inscription, long numCours) {
        Cours cours = coursRepository.findById(numCours).orElse(null);
        inscription.setCours(cours);
        return inscriptionRepository.save(inscription);
    }
}
