package com.apibusca.buscarapidaapi.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "produtos")
public class Produto implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nomeProduto;

    @Column
    private Integer qntestoque;

    @Column
    private Float preco;

    public Long getId() {
        return id;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getQntestoque() {
        return qntestoque;
    }

    public void setQntestoque(Integer qntestoque) {
        this.qntestoque = qntestoque;
    }
}
