package tn.esprit.stationdeski.services;

import tn.esprit.stationdeski.entities.Skieur;

import java.util.List;

public interface ISkieur {
    public Skieur AddSkieur(Skieur s);
    public Skieur updateSkieur(Skieur s);
    public List<Skieur> findAllSkieurs();
    public Skieur findById(long ids);
    public void deleteSkieur(long ids);
}
