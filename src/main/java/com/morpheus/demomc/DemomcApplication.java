package com.morpheus.demomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.morpheus.demomc.domain.Categoria;
import com.morpheus.demomc.repositories.CategoriaRepository;

@SpringBootApplication
public class DemomcApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepostory;
	
	public static void main(String[] args) {
		SpringApplication.run(DemomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		categoriaRepostory.saveAll(Arrays.asList(cat1,cat2));
		
	}

}

