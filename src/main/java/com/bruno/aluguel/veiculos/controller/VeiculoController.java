package com.bruno.aluguel.veiculos.controller;


import com.bruno.aluguel.veiculos.model.Veiculo;
import com.bruno.aluguel.veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController(value = "")
public class VeiculoController {

    @Autowired
    private VeiculoRepository repository;

    @GetMapping(path = "/veiculo/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/veiculo/incluir")
    public Veiculo salvar(@RequestBody Veiculo veiculo){
        return repository.save(veiculo);
    }

    //consultar veículo por cidade, modelo e faixa de preço
    @GetMapping(path = "/veiculo/buscaCidadeModeloFaixapreco/{idCidade}/{modelo}/{precoIni}:{precoFin}")
    public List<Veiculo> bCidadeFaixa( @PathVariable("idCidade") int idCidade,
                                       @PathVariable("modelo") String modelo,
                                       @PathVariable("precoIni") double precoInicial,
                                       @PathVariable("precoFin") double precoFinal){
        return repository.bCidadeFaixa(idCidade, modelo, precoInicial, precoFinal);
    }

   //consultar veículo por cidade, faixa de preço, ar condicional e tipo de câmbio
    @GetMapping(path = "/veiculo/buscaCidadeFaixaPrecoArCambio/{idCidade}/{precoIni}:{precoFin}/{arCondicionado}/{cambio}")
    public List<Veiculo> bCidadeFaixaArCambio( @PathVariable("idCidade") int idCidade,
                                               @PathVariable("precoIni") double precoInicial,
                                               @PathVariable("precoFin") double precoFinal,
                                               @PathVariable("arCondicionado") String arcondicionado,
                                               @PathVariable("cambio") String cambio
                                               ){
        return repository.bCidadeFaixaArCambio(idCidade, precoInicial, precoFinal, arcondicionado, cambio);
    }

    //consultar veículo por cidade, faixa de preço, ar condicional e tipo de câmbio e combustivel
    @GetMapping(path = "/veiculo/buscaCidadeFaixaPrecoArCambioCombustivel/{idCidade}/{precoIni}:{precoFin}/{arCondicionado}/{cambio}/{combustivel}")
    public List<Veiculo> bCidadeFaixaArCambioCombustivel( @PathVariable("idCidade") int idCidade,
                                                          @PathVariable("precoIni") double precoInicial,
                                                          @PathVariable("precoFin") double precoFinal,
                                                          @PathVariable("arCondicionado") String arcondicionado,
                                                          @PathVariable("cambio") String cambio,
                                                          @PathVariable("combustivel") String combustivel){
        return repository.bCidadeFaixaArCambioCombustivel(idCidade, precoInicial, precoFinal, arcondicionado, cambio, combustivel);
    }
}
