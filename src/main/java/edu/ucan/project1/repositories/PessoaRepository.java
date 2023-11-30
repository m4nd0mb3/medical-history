/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ucan.project1.repositories;

import edu.ucan.project1.entities.Pessoa;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ivandro.sousa
 */
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, UUID>{
    
}
