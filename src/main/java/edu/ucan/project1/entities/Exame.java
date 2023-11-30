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
@Entity(name = "exames")
public class Exame implements Serializable
{
    @Id
    @GeneratedValue
    private UUID idExame;

    @Column(name = "data_exame")
    private Date dataExame;
    
    @Column(name = "resultado")
    private String resultado;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente idPaciente;
    
    @ManyToOne
    @JoinColumn(name = "id_clinica")
    private Clinica idClinica;
    
    @ManyToOne
    @JoinColumn(name = "id_tipo_exame")
    private TipoExame idTipoExame;
}
