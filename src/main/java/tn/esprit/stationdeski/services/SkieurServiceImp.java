package tn.esprit.stationdeski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stationdeski.entities.Skieur;
import tn.esprit.stationdeski.repositories.SkieurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SkieurServiceImp implements ISkieur{
    private SkieurRepository skieurRepository;
    @Override
    public Skieur AddSkieur(Skieur s) {
        return skieurRepository.save(s);
    }

    @Override
    public Skieur updateSkieur(Skieur s) {
        return skieurRepository.save(s);
    }

    @Override
    public List<Skieur> findAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur findById(long ids) {
        return skieurRepository.findById(ids).orElse(null);
    }

    @Override
    public void deleteSkieur(long ids) {
        skieurRepository.deleteById(ids);
    }
}
