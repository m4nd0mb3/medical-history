/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ucan.project1.controllers;

import edu.ucan.project1.bootloader.ServidorBootLoader;
import edu.ucan.project1.entities.Pessoa;
import edu.ucan.project1.https.utils.ResponseBody;
import edu.ucan.project1.services.implementacao.PacienteServiceImpl;
import edu.ucan.project1.services.implementacao.PessoaServiceImpl;
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
@RequestMapping("pessoa")
public class PessoaController extends BaseController{
    private static Logger LOGGER = LoggerFactory.getLogger(ServidorBootLoader.class);

    //hostserver.name=localhost
    @Value("${hostserver.name}")
    private String hostname;
    @Value("${hostserver.password}")
    private String password;
    @Value("${hostserver.port}")
    private String porta;
 
    @Autowired
    private PessoaServiceImpl service;

    @GetMapping
    public ResponseEntity<ResponseBody> listar() 
    {
        return this.ok("Pessoas Listados com sucesso.", this.service.findAll() );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseBody> obter(@PathVariable UUID id) 
    {
        Optional<Pessoa> pessoa = this.service.findById(id);
        if ( pessoa.isPresent() )
            return this.ok("Pessoa encontrada com sucesso.", pessoa.get());
        return this.naoEncontrado("Pessoa não encontrada.", null);
    }

    @PostMapping
    public ResponseEntity<ResponseBody> criar(@RequestBody Pessoa pessoa) {
        return this.created("Pessoa adicionado com sucesso.", this.service.criar(pessoa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseBody> eliminar(@PathVariable("id") UUID id) {
        return this.ok("Pessoa eliminado com sucesso.", this.service.eliminar(id) );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseBody> editar(@PathVariable("id") UUID id, @RequestBody Pessoa paciente) {
        return this.ok("Pessoa editado com sucesso.", (Pessoa) service.editar(id, paciente));
    }
}
