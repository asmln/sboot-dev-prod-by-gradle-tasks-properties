package com.example.sbootconsole;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbootConsoleApplication implements CommandLineRunner {

	@Value("${app.name}")
	private String name;

	@Value("${app.profile}")
	private String profile;

	public static void main(String[] args) {
		SpringApplication.run(SbootConsoleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello from " + profile + " " + name);
	}
}
