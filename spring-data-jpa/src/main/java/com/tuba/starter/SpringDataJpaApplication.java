package com.tuba.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // bu anotasyonun olduğu sınıf starter olur.İsim farklı olabilir ama starter yazılması kolaylık olur
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
