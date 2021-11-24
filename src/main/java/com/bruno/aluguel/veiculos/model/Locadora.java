package com.bruno.aluguel.veiculos.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity(name = "locadora")
public class Locadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column
    private String nome;
    @Column
    private String endereco;

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @ManyToOne
    private Cidade cidade;

    @OneToMany
    private List<Veiculo> veiculo = new ArrayList<>();


}
