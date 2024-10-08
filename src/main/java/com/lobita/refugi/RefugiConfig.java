package com.lobita.refugi;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@SpringBootConfiguration
@ComponentScan(basePackages = {"com.lobita.refugi.controller"})
@EnableJpaRepositories(basePackages = {"com.lobita.refugi.repository"})
public class RefugiConfig {

    @Bean
    public OpenAPI usersMicroserviceOpenAPI() {
        return new OpenAPI().info(new Info().title("40-all API").description("API 40-all").version("1.0"));
    }
}
