package edu.ucan.project1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;


@Setter
@Getter
@ToString
@Entity(name = "clinicas")
public class Clinica
{
    @Id
    @GeneratedValue
    private UUID idClinica;

    @Column(name = "nome")
    private String nome;

    @Column(name = "endereco", nullable = false)
    private String endereco;
}
