package com.bruno.aluguel.veiculos.repository;

import com.bruno.aluguel.veiculos.model.Veiculo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VeiculoRepository extends CrudRepository<Veiculo, Integer> {

    //?{1} são os valores dos parametros
    //o formato de comando não é SLQ, é JPQL
    @Query("select v from veiculo v inner join v.locadora l where l.cidade.id = ?1 and v.modelo = ?2 and v.preco between ?3 and ?4")
    List<Veiculo> bCidadeFaixa(int idCidade, String modelo, double precoInicial, double precoFinal);

    @Query("select v from veiculo v inner join v.locadora l where l.cidade.id = ?1 and v.preco between ?2 and ?3 and v.arcondicionado = ?4 and v.cambio = ?5")
    List<Veiculo> bCidadeFaixaArCambio(int idCidade, double precoInicial, double precoFinal, String arcondicionado, String cambio);

    @Query("select v from veiculo v inner join v.locadora l where l.cidade.id = ?1 and v.preco between ?2 and ?3 and v.arcondicionado = ?4 and v.cambio = ?5 and v.tipoCombustivel = ?6")
    List<Veiculo> bCidadeFaixaArCambioCombustivel(int idCidade, double precoInicial, double precoFinal, String arcondicionado, String cambio, String combustivel);

}
