package tn.esprit.stationdeski.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stationdeski.entities.Inscription;
import tn.esprit.stationdeski.services.InscriptionServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Inscription")
public class InscriptionController  {
    private InscriptionServiceImp inscriptionServiceImp;
    @PostMapping("/addInscription")
    public Inscription addInscription(@RequestBody Inscription i) {
        return  inscriptionServiceImp.AddInscription(i);
    }
    @PutMapping("/updateInscription")
    public Inscription updateInscription(@RequestBody Inscription a) {
        return  inscriptionServiceImp.AddInscription(a);
    }

    @GetMapping("/getallInscription")
    public List<Inscription> findAllInscription() {
        return  inscriptionServiceImp.findAllInscriptions();
    }
    @GetMapping("/getInscription/{idi}")
    public Inscription findById(@PathVariable long idi) {
        return  inscriptionServiceImp.findById(idi);
    }
    @DeleteMapping("/deleteInscription/{idi}")
    public void deleteInscription(@PathVariable long idi) {
        inscriptionServiceImp.deleteInscription(idi);
    }

    @PostMapping("/addInscriptionAndAssignSkuer/{numSkirur}")
    public  Inscription addInscriptionAndAssignSkuer(@RequestBody Inscription inscription, @PathVariable long numSkirur){
        return inscriptionServiceImp.addInscriptionAndAssignSkuer(inscription,numSkirur);
    }

    @PostMapping("/assignRegistrationToCourse/{numCours}")
    public Inscription assignRegistrationToCourse(@RequestBody Inscription inscription, @PathVariable long numCours) {
        return inscriptionServiceImp.assignRegistrationToCourse(inscription,numCours);
    }
}
