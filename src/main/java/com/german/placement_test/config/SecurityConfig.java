package com.german.placement_test.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.context.annotation.Bean;
@Configuration
public class SecurityConfig { 
    @Bean // New annotation
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception { // New method
        http
        .securityContext() // New method to replace csrf()
        .and()
        .authorizeHttpRequests() // Updated method to replace deprecated authorizeRequests()
        .requestMatchers("/api/users/register", "/api/users/login").permitAll(); // Changed antMatchers to requestMatchers
        return http.build();
    }
}