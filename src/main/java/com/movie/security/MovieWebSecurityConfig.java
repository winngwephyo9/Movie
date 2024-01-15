package com.movie.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MovieWebSecurityConfig {

  @Bean
  public SecurityFilterChain applicationSecurity(HttpSecurity http) throws Exception {
    http.cors(cors -> cors.disable())
        .csrf(csrf -> csrf.disable())
        .sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        .formLogin(login -> login.disable())
        .securityMatcher("/**")
        .authorizeHttpRequests(registry -> registry.requestMatchers("/api/v1/movies")
                                                   .permitAll());

    return http.build();

  }
}
