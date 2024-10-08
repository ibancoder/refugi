package com.lobita.refugi.controller;


import com.lobita.refugi.entity.Animals;
import com.lobita.refugi.repository.AnimalsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalsController {

    private final AnimalsRepository animalsRepository;

    public AnimalsController(AnimalsRepository animalsRepository) {
        this.animalsRepository = animalsRepository;
    }

    @GetMapping("/animal")
    public List<Animals> getAnimal() {
        return animalsRepository.findAll();
    }
}
