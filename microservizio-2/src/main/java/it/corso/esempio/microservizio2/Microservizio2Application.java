package it.corso.esempio.microservizio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Microservizio2Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservizio2Application.class, args);
	}

}
