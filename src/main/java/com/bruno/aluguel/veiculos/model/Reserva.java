package com.bruno.aluguel.veiculos.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "reserva")
public class Reserva {

    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Column
    private String nome;
    @Column
    private String CPF;

    //Resetar o banco para a JPA recriar as tabelas relacionadas e para o erro
    @OneToMany
    private List<Locadora> locadora = new ArrayList<>();
    @OneToMany
    private List<Veiculo> veiculo = new ArrayList<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public List<Locadora> getLocadora() {
        return locadora;
    }

    public void setLocadora(List<Locadora> locadora) {
        this.locadora = locadora;
    }

    public List<Veiculo> getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(List<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }
}
