package com.example.demo_docker.controller;

import com.example.demo_docker.entities.Voiture;
import com.example.demo_docker.repositories.VoitureRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voitures")
public class VoitureController {
    private VoitureRepository voitureRepository;


    public VoitureController(VoitureRepository voitureRepository) {
        this.voitureRepository = voitureRepository;
    }

    @PostMapping
    public Voiture addVoiture(@RequestBody Voiture voiture){
        return this.voitureRepository.save(voiture);
    }

    @GetMapping
    public List<Voiture> listVoiture(){
        return this.voitureRepository.findAll();
    }
}
