package com.bruno.aluguel.veiculos.controller;

import com.bruno.aluguel.veiculos.model.Reserva;
import com.bruno.aluguel.veiculos.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReservaController {

    @Autowired
    private ReservaRepository repository;

    //cadastrar reserva de veículo
    @PostMapping(path = "/reservar/incluir")
    public Reserva salvar(@RequestBody Reserva reserva){

        return repository.save(reserva);
    }

    //deletar reserva de veículo
    @GetMapping(path = "/reservar/deletar/{id}")
    public void deletar(@PathVariable("id") int id){
        repository.deleteById(id);
    };

    @GetMapping(path = "/reservar/buscar/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
}
