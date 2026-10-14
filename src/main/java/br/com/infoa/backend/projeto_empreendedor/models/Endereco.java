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
@Table(name = "endereco")

public class Endereco {
    @Id 
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY) 
    @Column(name = "id")
    private Integer id;

    @Column (name = "logradouro")
    private String logradouro;

    @Column (name = "numero")
    private String numero;

    @Column (name = "cep")
    private String cep;

     @ManyToMany
    @JoinTable (
        name = "empreendedor_produto",
        joinColumns = @JoinColumn(name = "id_empreendedor" , referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "id_produto" , referencedColumnName = "id")
    )
    private List<Produto> produtos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Endereco() {
    }

    public Endereco(Integer id, String logradouro, String numero, String cep, List<Produto> produtos) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
