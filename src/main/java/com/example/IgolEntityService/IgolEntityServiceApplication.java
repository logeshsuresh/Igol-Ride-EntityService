package com.example.IgolEntityService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class IgolEntityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IgolEntityServiceApplication.class, args);
	}

}
