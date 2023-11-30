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
@Entity(name = "pacientes")
public class Paciente implements Serializable
{
    @Id
    @GeneratedValue
    private UUID idPaciente;

    @Column(name = "ultima_consulta", nullable = true)
    private Date ultimaConsulta;

    @OneToOne
    private Pessoa idPessoa;
}
