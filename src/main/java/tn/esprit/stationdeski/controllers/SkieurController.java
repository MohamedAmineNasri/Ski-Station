package tn.esprit.stationdeski.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stationdeski.entities.Skieur;
import tn.esprit.stationdeski.services.SkieurServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Skieur")
public class SkieurController {
    private SkieurServiceImp skieurServiceImp;
    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur s) {
        return  skieurServiceImp.AddSkieur(s);
    }
    @PutMapping("/updateSkieur")
    public Skieur updateSkieur(@RequestBody Skieur s) {
        return  skieurServiceImp.updateSkieur(s);
    }

    @GetMapping("/getallSkieur")
    public List<Skieur> findAllSkieur() {
        return  skieurServiceImp.findAllSkieurs();
    }
    @GetMapping("/getSkieur/{ids}")
    public Skieur findById(@PathVariable long ids) {
        return  skieurServiceImp.findById(ids);
    }
    @DeleteMapping("/deleteSkieur/{ids}")
    public void deleteSkieur(@PathVariable long ids) {
        skieurServiceImp.deleteSkieur(ids);
    }
}
