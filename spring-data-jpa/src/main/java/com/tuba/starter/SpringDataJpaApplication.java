package com.tuba.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages= {"com.tuba"}) //Projedeki tum entityleri gormesi icin
@ComponentScan(basePackages = "com.tuba")//Rest controller, controller,service,
											//repository gibi anotasyonlarinin 
											//spring konteynirda bean'ninin 
												//olusmasini saglar 
@EnableJpaRepositories(basePackages = "com.tuba") // Jpa Repo.lari projede aktif etmek icin
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
