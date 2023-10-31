package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.Controller , com.example.Service, com.example.Security"})
@EntityScan("com.example.Entity")
@EnableJpaRepositories("com.example.Repository")
public class KeyCloakSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeyCloakSampleApplication.class, args);
	}

}
