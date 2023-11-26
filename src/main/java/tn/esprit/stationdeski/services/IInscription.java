package tn.esprit.stationdeski.services;

import tn.esprit.stationdeski.entities.Cours;
import tn.esprit.stationdeski.entities.Inscription;

import java.util.List;

public interface IInscription {
    public Inscription AddInscription(Inscription i);
    public Inscription updateInscription(Inscription i);
    public List<Inscription> findAllInscriptions();
    public Inscription findById(long idi);
    public void deleteInscription(long idi);

    public Inscription addInscriptionAndAssignSkuer(Inscription inscription , long  numSkirur);

    public Inscription assignRegistrationToCourse(Inscription inscription, long numCours);

}
