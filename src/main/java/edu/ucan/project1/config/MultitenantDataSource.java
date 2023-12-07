/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ucan.project1.config;

/**
 *
 * @author jonathanm
 */
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultitenantDataSource extends AbstractRoutingDataSource {

    @Override
    protected String determineCurrentLookupKey() {
        return TenantContext.getCurrentTenant();
    }

}
