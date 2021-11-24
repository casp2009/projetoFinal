package com.bruno.aluguel.veiculos.model;

import javax.persistence.*;

@Entity(name = "veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column
    private String placa;
    @Column
    private String modelo;
    @Column
    private String anoFab;
    @Column
    private String tipoCombustivel;
    @Column
    private String cambio; //automatico ou manual
    @Column
    private String arcondicionado;
    @Column
    private double preco;
    @Column
    private String reservado;

    @ManyToOne
    private Locadora locadora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(String anoFab) {
        this.anoFab = anoFab;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String isArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(String arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String isReservado() {
        return reservado;
    }

    public void setReservado(String reservado) {
        this.reservado = reservado;
    }

    public Locadora getLocadora() {
        return locadora;
    }

    public void setLocadora(Locadora locadora) {
        this.locadora = locadora;
    }
}
