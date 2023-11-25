package tn.esprit.stationdeski.services;

import tn.esprit.stationdeski.entities.Abonnement;
import tn.esprit.stationdeski.entities.Cours;

import java.util.List;

public interface ICours {
    public Cours AddCours(Cours c);
    public Cours updateCours(Cours c);
    public List<Cours> findAllCours();
    public Cours findById(long idc);
    public void deleteCours(long idc);
}
