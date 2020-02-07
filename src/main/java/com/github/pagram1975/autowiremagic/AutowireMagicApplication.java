package com.github.pagram1975.autowiremagic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class AutowireMagicApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutowireMagicApplication.class, args);
	}

}
