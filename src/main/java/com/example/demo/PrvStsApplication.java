package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrvStsApplication implements CommandLineRunner {

	@Autowired
	personRepo tabelata;
	
	public static void main(String[] args) {
		SpringApplication.run(PrvStsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Zdravejte!");
		Person ognen = new Person("Ognen", "Sekuloski", 15);
		Person bojan = new Person("Bojan", "Sekuloski", 10);
		tabelata.save(ognen);
		tabelata.save(bojan);

	}
}
