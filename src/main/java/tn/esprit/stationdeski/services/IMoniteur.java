package tn.esprit.stationdeski.services;

import tn.esprit.stationdeski.entities.Moniteur;

import java.util.List;

public interface IMoniteur {
    public Moniteur AddMoniteur(Moniteur m);
    public Moniteur updateMoniteur(Moniteur m);
    public List<Moniteur> findAllMoniteurs();
    public Moniteur findById(long idm);
    public void deleteMoniteur(long idm);
}
