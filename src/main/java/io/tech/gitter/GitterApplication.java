package io.tech.gitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitterApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitterApplication.class, args);
		System.out.println("Hello Worldd!!");
	}

}
