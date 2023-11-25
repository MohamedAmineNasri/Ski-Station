package tn.esprit.stationdeski.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stationdeski.entities.Abonnement;
import tn.esprit.stationdeski.services.AbonnementServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Abonnement")
public class AbonnementController {
    private AbonnementServiceImp abonnementServiceImp;
    @PostMapping("/addAbonnement")
    public Abonnement addAbonnement(@RequestBody Abonnement a) {
        return  abonnementServiceImp.AddAbonnement(a);
    }
    @PutMapping("/updateAbonnement")
    public Abonnement updateAbonnement(@RequestBody Abonnement a) {
        return  abonnementServiceImp.AddAbonnement(a);
    }

    @GetMapping("/getall")
    public List<Abonnement> findAllAbonnement() {
        return  abonnementServiceImp.findAllAbonnement();
    }
    @GetMapping("/get/{ida}")
    public Abonnement findById(@PathVariable long ida) {
        return  abonnementServiceImp.findById(ida);
    }
    @DeleteMapping("/delete/{ida}")
    public void deleteAbonnement(@PathVariable long ida) {
        abonnementServiceImp.deleteAbonnement(ida);
    }
}
