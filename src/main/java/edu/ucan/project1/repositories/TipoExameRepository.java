/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ucan.project1.repositories;

import edu.ucan.project1.entities.TipoExame;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jonathanm
 */
public interface TipoExameRepository extends JpaRepository<TipoExame, UUID>{
    
}
