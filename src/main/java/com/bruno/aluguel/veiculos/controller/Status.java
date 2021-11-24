package com.bruno.aluguel.veiculos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Status {

    @GetMapping(path = "/api/status")
    public String check(){
        return "Online!";
    }


}
