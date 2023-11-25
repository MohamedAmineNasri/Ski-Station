package tn.esprit.stationdeski.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stationdeski.entities.Moniteur;
import tn.esprit.stationdeski.services.MoniteurServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Moniteur")
public class MoniteurController {
    private MoniteurServiceImp moniteurServiceImp;
    @PostMapping("/addMoniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur m) {
        return  moniteurServiceImp.AddMoniteur(m);
    }
    @PutMapping("/updateMoniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur m) {
        return  moniteurServiceImp.AddMoniteur(m);
    }

    @GetMapping("/getallMoniteur")
    public List<Moniteur> findAllMoniteur() {
        return  moniteurServiceImp.findAllMoniteurs();
    }
    @GetMapping("/getMoniteur/{ida}")
    public Moniteur findById(@PathVariable long idm) {
        return  moniteurServiceImp.findById(idm);
    }
    @DeleteMapping("/delete/{ida}")
    public void deleteMoniteur(@PathVariable long idm) {
        moniteurServiceImp.deleteMoniteur(idm);
    }
}
