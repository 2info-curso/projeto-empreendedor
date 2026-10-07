package br.com.infoa.backend.projeto_empreendedor.models;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")

public class Produto {
    @Id 
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column (name = "nome")
    private String nome;

    @Column (name = "datafabricacao")
    private String datafabricacao;

    @Column (name = "preco")
    private Double preco;

@ManyToMany 
    @JoinTable (
        name = "empreendedor_produto", 
        joinColumns = @JoinColumn(name = "id_produto"),
        inverseJoinColumns = @JoinColumn(name = "id_empreendedor") 
    )
    private List<Empreendedor> empreendedores;

    public Produto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatafabricacao() {
        return datafabricacao;
    }

    public void setDatafabricacao(String datafabricacao) {
        this.datafabricacao = datafabricacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List<Empreendedor> getEmpreendedores() {
        return empreendedores;
    }
    public void setEmpreendedores(List<Empreendedor> empreendedores) {
        this.empreendedores = empreendedores;
    }

   
    public Produto(Integer id, String nome, String datafabricacao, Double preco, List<Empreendedor> empreendedores) {
        this.id = id;
        this.nome = nome;
        this.datafabricacao = datafabricacao;
        this.preco = preco;
        this.empreendedores = empreendedores;
    }

}

