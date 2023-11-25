package tn.esprit.stationdeski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stationdeski.entities.Cours;
import tn.esprit.stationdeski.repositories.CoursRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CoursServiceImp implements ICours{
    private CoursRepository coursRepository;
    @Override
    public Cours AddCours(Cours c) {
        return coursRepository.save(c);
    }

    @Override
    public Cours updateCours(Cours c) {
        return coursRepository.save(c);
    }

    @Override
    public List<Cours> findAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public Cours findById(long idc) {
        return coursRepository.findById(idc).orElse(null);
    }

    @Override
    public void deleteCours(long idc) {
        coursRepository.deleteById(idc);
    }
}
