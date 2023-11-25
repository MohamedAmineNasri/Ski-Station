package tn.esprit.stationdeski.services;

import tn.esprit.stationdeski.entities.Piste;

import java.util.List;

public interface IPiste {
    public Piste AddPistePiste(Piste p);
    public Piste updatePiste(Piste p);
    public List<Piste> findAllPistes();
    public Piste findById(long idp);
    public void deletePiste(long idp);
}
