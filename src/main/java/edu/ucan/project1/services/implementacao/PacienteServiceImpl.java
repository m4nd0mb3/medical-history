/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ucan.project1.services.implementacao;

import edu.ucan.project1.entities.Paciente;
import edu.ucan.project1.repositories.PacienteRepository;
import edu.ucan.project1.services.PacienteService;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author ivandro.sousa
 */
@Service
public class PacienteServiceImpl extends AbstractService<Paciente, UUID> implements PacienteService<Paciente, UUID>
{
    
    
    @Override
    public List<Paciente> pacientesDoentes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Paciente editar(UUID id, Paciente entidade) {
        entidade.setIdPaciente(id);
        return super.editar(id, entidade);
    }
}
