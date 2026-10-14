package br.com.infoa.backend.projeto_empreendedor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infoa.backend.projeto_empreendedor.services.EmpreendedorService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController 
@RequestMapping ("/empreendedor")
public class EmpreendedorController {

    @Autowired 
    private EmpreendedorService empreendedorService;

    @GetMapping("/contar")
    public Long contar() {
        return empreendedorService.contar();
    }
    
    
}
