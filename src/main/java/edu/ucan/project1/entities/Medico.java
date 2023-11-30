/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ucan.project1.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author ivandro.sousa
 */
@Getter
@Setter
@ToString
@Entity(name = "medicos")
public class Medico implements Serializable
{
    @Id
    @GeneratedValue
    private UUID idMedico;

    @Column(name = "nome", nullable = false)
    private String nome;

    @OneToOne
    private Pessoa idPessoa;
    
    @ManyToOne
    @JoinColumn(name = "id_clinica")
    private Clinica idClinica;
}
