package com.danielcristianoti;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.danielcristianoti.domain.Usuario;
import com.danielcristianoti.repositories.UsuarioRepository;

@SpringBootApplication
public class ApiDc23Application implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepositoy;

	public static void main(String[] args) {
		SpringApplication.run(ApiDc23Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario u1 = new Usuario(null, "Daniel","dc","123");
		Usuario u2 = new Usuario(null, "Ana","dc","123");
		Usuario u3 = new Usuario(null, "Maria","dc","123");
		Usuario u4 = new Usuario(null, "Wanderley","dc","123");
		

		usuarioRepositoy.saveAll(Arrays.asList(u1,u2,u3,u4));

	}

}
