package com.example.springbootstarterdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan("com.example")
public class SpringBootStarterDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterDataJpaApplication.class, args);
		System.out.println("server stated");
	}

}
