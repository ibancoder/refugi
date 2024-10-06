package com.lobita.refugi;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootConfiguration
@ComponentScan(basePackages = {"com.lobita.refugi.controller"})
@EnableJpaRepositories(basePackages = {"com.lobita.refugi.repository"})
public class RefugiConfig {

}
