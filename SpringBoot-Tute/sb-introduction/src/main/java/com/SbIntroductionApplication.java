package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SbIntroductionApplication {

	private Logger LOGGER = Logger.getLogger(this.getClass().getName());
	public static void main(String[] args) {
		SpringApplication.run(SbIntroductionApplication.class, args);
	}
}
