package com.ledzedev.springboot.datarest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Arrays;

/**
 * Código generado por Gerado Pucheta Figueroa
 * Twitter: @ledzedev
 * http://ledze.mx
 * 14/Nov/2016.
 */
@SpringBootApplication
public class LedzedevSpringbootDatarestRestfullMvcThymeleafApplication {
	private final static Logger log = LoggerFactory.getLogger(LedzedevSpringbootDatarestRestfullMvcThymeleafApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LedzedevSpringbootDatarestRestfullMvcThymeleafApplication.class, args);
	}


 	@Bean
	CommandLineRunner runner(RepositorioCuentas repositorioCuentas){
 		return x -> {
			Arrays.asList(new CuentaBancaria("Gerardo", "1000.00"),
					new CuentaBancaria("Ledze", "2000.00"),
					new CuentaBancaria("Maribel", "3000.00"),
					new CuentaBancaria("Santiago", "4000.00"),
					new CuentaBancaria("Yara", "5000.00"),
					new CuentaBancaria("Esperanza", "6000.00"),
					new CuentaBancaria("Paolo", "7000.00"),
					new CuentaBancaria("Sio", "8000.00"),
					new CuentaBancaria("Angel", "9000.00")
					)
			.forEach(repositorioCuentas::save);
			log.info("Carga inicial de cuentas bancarias terminada.");
		};
	}
}

