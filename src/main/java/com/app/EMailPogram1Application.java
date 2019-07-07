package com.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EMailPogram1Application implements CommandLineRunner {

	
	@Override
	public void run(String... args) throws Exception {

		System.out.println("Done");
	}
	public static void main(String[] args) {
		SpringApplication.run(EMailPogram1Application.class, args);
	}

}
