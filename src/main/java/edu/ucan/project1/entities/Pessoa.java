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
@Entity(name = "pessoas")
public class Pessoa
{
    @Id
    @GeneratedValue
    private UUID idPessoa;

    @Column(name = "numero_bi", nullable = false)
    private String numeroBi;

    @Column(name = "data_nascimento", nullable = true)
    private LocalDate dataNascimento;

    @Column(name = "nome")
    private String nome;
}
