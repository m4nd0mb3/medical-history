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
@Entity(name = "registos_medicos")
public class RegistoMedico implements Serializable
{
    @Id
    @GeneratedValue
    private UUID idRegistoMedico;

    @Column(name = "data_exame")
    private Date dataExame;
    
    @Column(name = "diagnostico")
    private String diagnostico;
    
    @Column(name = "prescricao_medica")
    private String prescricaoMedica;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente idPaciente;
    
    @ManyToOne
    @JoinColumn(name = "id_clinica")
    private Clinica idClinica;
    
    @ManyToOne
    @JoinColumn(name = "id_exame")
    private Exame idExame;
}
