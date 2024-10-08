package com.lobita.refugi.controller;

import com.lobita.refugi.entity.Noticies;
import com.lobita.refugi.repository.NoticiasRepository;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class NoticiasController {

    private final NoticiasRepository noticiasRepository;

 
    public NoticiasController(NoticiasRepository noticiasRepository) {
        this.noticiasRepository = noticiasRepository;
    }

    @GetMapping("/noticia")
    public List<Noticies> getNoticia() {
        return noticiasRepository.findAll();
    }

    @GetMapping("/noticia/filtrada")
    public List<Noticies> getNoticia(@RequestParam LocalDateTime fecha) { return noticiasRepository.getAllByDataNoticiaAfter(fecha); }


}
