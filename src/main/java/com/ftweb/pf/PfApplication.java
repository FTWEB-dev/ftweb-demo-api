package com.ftweb.pf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.ftweb.pf.repository")
public class PfApplication {

	public static void main(String[] args) {
		SpringApplication.run(PfApplication.class, args);
	}

}
