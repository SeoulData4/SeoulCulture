package com.squad.seoulculture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SeoulCultureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeoulCultureApplication.class, args);
	}

}
