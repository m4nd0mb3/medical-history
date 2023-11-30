/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ucan.project1.bootloader;


import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author ivandro.sousa
 */
@Service
public class ServidorBootLoader 
{

    //hostserver.name=localhost
    @Value("${hostserver.name}")
    private String hostname;
    @Value("${hostserver.password}")
    private String password;
    @Value("${hostserver.port}")
    private String porta;

        
    @PostConstruct
    protected void init() {
        System.out.println( String.format("Servidor: %s \n Palavra-passe: %s \n Porta: %s", hostname, password, porta));
    }
    
}
