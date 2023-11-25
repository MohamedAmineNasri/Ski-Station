package tn.esprit.stationdeski.services;

import tn.esprit.stationdeski.entities.Abonnement;

import java.util.List;

public interface IAbonnement {
    public Abonnement AddAbonnement(Abonnement A);
    public Abonnement updateAbonnement(Abonnement A);
    public List<Abonnement> findAllAbonnement();
    public Abonnement findById(long idA);
    public void deleteAbonnement(long idA);
}
