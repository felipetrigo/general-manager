package com.util.general_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class GeneralManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneralManagerApplication.class, args);
	}

}
