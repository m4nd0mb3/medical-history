/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ucan.project1.services.implementacao;

import edu.ucan.project1.entities.Pessoa;
import edu.ucan.project1.services.PessoaService;
import java.util.UUID;
import org.springframework.stereotype.Service;

/**
 *
 * @author ivandro.sousa
 */
@Service
public class PessoaServiceImpl extends AbstractService<Pessoa, UUID> implements PessoaService{

    @Override
    public Pessoa editar(UUID id, Pessoa entidade) {
        entidade.setIdPessoa(id);
        return super.editar(id, entidade); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }


   
}
