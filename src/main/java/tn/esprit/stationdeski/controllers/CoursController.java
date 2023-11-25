package tn.esprit.stationdeski.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stationdeski.entities.Abonnement;
import tn.esprit.stationdeski.entities.Cours;
import tn.esprit.stationdeski.services.CoursServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Cours")
public class CoursController {
    private CoursServiceImp coursServiceImp;
    @PostMapping("/addCours")
    public Cours addCours(@RequestBody Cours c) {
        return  coursServiceImp.AddCours(c);
    }
    @PutMapping("/updateCours")
    public Cours updateCours(@RequestBody Cours c) {
        return  coursServiceImp.updateCours(c);
    }

    @GetMapping("/getallCours")
    public List<Cours> findAllCours() {
        return  coursServiceImp.findAllCours();
    }
    @GetMapping("/getCours/{ida}")
    public Cours findById(@PathVariable long idc) {
        return  coursServiceImp.findById(idc);
    }
    @DeleteMapping("/deleteCours/{ida}")
    public void deleteCours(@PathVariable long ida) {
        coursServiceImp.deleteCours(ida);
    }
}
