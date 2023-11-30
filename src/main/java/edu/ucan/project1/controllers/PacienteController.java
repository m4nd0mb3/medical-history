/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ucan.project1.controllers;

import edu.ucan.project1.bootloader.ServidorBootLoader;
import edu.ucan.project1.entities.Paciente;
import edu.ucan.project1.https.utils.ResponseBody;
import edu.ucan.project1.services.PacienteService;
import edu.ucan.project1.services.implementacao.PacienteServiceImpl;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ivandro.sousa
 */
@RestController
@RequestMapping("paciente")
public class PacienteController extends BaseController 
{
    private static Logger LOGGER = LoggerFactory.getLogger(ServidorBootLoader.class);

    //hostserver.name=localhost
    @Value("${hostserver.name}")
    private String hostname;
    @Value("${hostserver.password}")
    private String password;
    @Value("${hostserver.port}")
    private String porta;
 
    @Autowired
    private PacienteServiceImpl service;

    @GetMapping
    public ResponseEntity<ResponseBody> listar() 
    {
        return this.ok("Pacientes Listados com sucesso.", this.service.findAll() );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseBody> obter(@PathVariable UUID id) 
    {
        Optional<Paciente> paciente = this.service.findById(id);
        if ( paciente.isPresent() )
            return this.ok("Paciente encontrado com sucesso.", paciente.get());
        return this.naoEncontrado("Paciente não encontrado", null);
    }

    @PostMapping
    public ResponseEntity<ResponseBody> criar(@RequestBody Paciente paciente) {
        return this.created("Paciente adicionado com sucesso.", this.service.criar(paciente) );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseBody> eliminar(@PathVariable("id") UUID id) {
        return this.ok("Paciente eliminado com sucesso.", this.service.eliminar(id) );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseBody> editar(@PathVariable("id") UUID id, @RequestBody Paciente paciente) {
        return this.ok("Paciente editado com sucesso.", (Paciente) service.editar(id, paciente));
    }

}
