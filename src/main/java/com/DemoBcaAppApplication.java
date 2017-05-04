package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;

@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class}) 
@SpringBootApplication
public class DemoBcaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBcaAppApplication.class, args);
	}
}
