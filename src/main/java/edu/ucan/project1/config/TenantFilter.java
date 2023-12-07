/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ucan.project1.config;

/**
 *
 * @author jonathanm
 */
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@Order(1)
class TenantFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
      FilterChain chain) throws IOException, ServletException {

//        String tenant = AuthenticationService.getTenant((HttpServletRequest) request);
//        TenantContext.setCurrentTenant(tenant);
        
        HttpServletRequest req = (HttpServletRequest) request;
        String tenantName = req.getHeader("X-TenantID");
        TenantContext.setCurrentTenant(tenantName);

        try {
            chain.doFilter(request, response);
        } finally {
            TenantContext.setCurrentTenant("");
        }

    }
}