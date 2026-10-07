package br.com.infoa.backend.projeto_empreendedor.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

  @Entity
  @Table(name = "empreendedor")

public class Empreendedor { 
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    @Column(name = "id")
    private Integer id; 
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "cpf")
    private String cpf;
    
    @Column(name = "data_nascimento")
    private String dataNascimento;

    @OneToMany
    @JoinColumn(name = "id_empreendedor")
    private List<Endereco> enderecos;

      @ManyToMany
    @JoinTable (
        name = "empreendedor_produto",
        joinColumns = @JoinColumn(name = "id_empreendedor"),
        inverseJoinColumns = @JoinColumn(name = "id_produto")
    )
    private List<Produto> produtos;

      public Empreendedor() {
      }

      public Empreendedor(Integer id, String nome, String cpf, String dataNascimento, List<Endereco> enderecos,
            List<Produto> produtos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.enderecos = enderecos;
        this.produtos = produtos;
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

      public String getCpf() {
          return cpf;
      }

      public void setCpf(String cpf) {
          this.cpf = cpf;
      }

      public String getDataNascimento() {
          return dataNascimento;
      }

      public void setDataNascimento(String dataNascimento) {
          this.dataNascimento = dataNascimento;
      }

      public List<Endereco> getEnderecos() {
          return enderecos;
      }

      public void setEnderecos(List<Endereco> enderecos) {
          this.enderecos = enderecos;
      }

      public List<Produto> getProdutos() {
          return produtos;
      }

      public void setProdutos(List<Produto> produtos) {
          this.produtos = produtos;
      }

    }