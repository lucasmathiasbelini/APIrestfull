package com.example.soundwave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("remedio")
public class remedios {
    @Autowired
    private remedioRepository remedioRepository;
    @PostMapping
    public void cadastrar(@RequestBody cadastropessoas dados){
        remedioRepository.save(new Remedio(dados));
    }
}
