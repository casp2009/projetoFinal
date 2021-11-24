package com.bruno.aluguel.veiculos.controller;

import com.bruno.aluguel.veiculos.model.Locadora;
import com.bruno.aluguel.veiculos.repository.LocadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocadoraController {

    @Autowired
    private LocadoraRepository repository;

    @GetMapping(path = "/locadora/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/locadora/incluir")
    public Locadora salvar(@RequestBody Locadora locadora){
        return repository.save(locadora);
    }

    @PostMapping(path = "/locadora/{cidade}/{preco}-{}/")
    public Locadora Buscar(@RequestBody Locadora locadora){
        return repository.save(locadora);
    }
}
