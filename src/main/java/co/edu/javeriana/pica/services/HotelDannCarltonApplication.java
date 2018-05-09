package co.edu.javeriana.pica.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class HotelDannCarltonApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelDannCarltonApplication.class, args);
	}
}
