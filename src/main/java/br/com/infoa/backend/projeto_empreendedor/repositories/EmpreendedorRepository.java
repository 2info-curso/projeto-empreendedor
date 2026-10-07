package br.com.infoa.backend.projeto_empreendedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infoa.backend.projeto_empreendedor.models.Empreendedor;

public interface EmpreendedorRepository extends JpaRepository<Empreendedor, Integer> {
    
}
