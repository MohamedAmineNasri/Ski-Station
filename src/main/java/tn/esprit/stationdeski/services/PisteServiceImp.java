package tn.esprit.stationdeski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stationdeski.entities.Piste;
import tn.esprit.stationdeski.repositories.PisteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteServiceImp implements IPiste{
    private PisteRepository pisteRepository;
    @Override
    public Piste AddPistePiste(Piste p) {
        return pisteRepository.save(p);
    }

    @Override
    public Piste updatePiste(Piste p) {
        return pisteRepository.save(p);
    }

    @Override
    public List<Piste> findAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste findById(long idp) {
        return pisteRepository.findById(idp).orElse(null);
    }

    @Override
    public void deletePiste(long idp) {
        pisteRepository.deleteById(idp);
    }
}
