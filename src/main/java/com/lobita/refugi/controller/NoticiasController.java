package com.lobita.refugi.controller;

import com.lobita.refugi.entity.Noticias;
import com.lobita.refugi.repository.NoticiasRepository;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticiasController {

    private final NoticiasRepository noticiasRepository;

 
    public NoticiasController(NoticiasRepository noticiasRepository) {
        this.noticiasRepository = noticiasRepository;
    }

    @GetMapping("noticia")
    public List<Noticias> getNoticia() {
        return noticiasRepository.findAll();
    }


}
