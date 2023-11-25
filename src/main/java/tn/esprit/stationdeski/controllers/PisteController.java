package tn.esprit.stationdeski.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stationdeski.entities.Piste;
import tn.esprit.stationdeski.services.PisteServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Piste")
public class PisteController {
    private PisteServiceImp pisteServiceImp;
    @PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste p) {
        return  pisteServiceImp.AddPistePiste(p);
    }
    @PutMapping("/updatePiste")
    public Piste updatePiste(@RequestBody Piste p) {
        return  pisteServiceImp.updatePiste(p);
    }

    @GetMapping("/getallPiste")
    public List<Piste> findAllPiste() {
        return  pisteServiceImp.findAllPistes();
    }
    @GetMapping("/getPiste/{ida}")
    public Piste findById(@PathVariable long idp) {
        return  pisteServiceImp.findById(idp);
    }
    @DeleteMapping("/deletePiste/{ida}")
    public void deletePiste(@PathVariable long idp) {
        pisteServiceImp.deletePiste(idp);
    }
}
