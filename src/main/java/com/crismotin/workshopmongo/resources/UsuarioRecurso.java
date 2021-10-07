package com.crismotin.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crismotin.workshopmongo.Usuario;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioRecurso {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity <List<Usuario>> findAll() {
		Usuario cris = new Usuario("1", "Cristiane Motin", "crismotin2019@gmail.com");
		Usuario joao = new Usuario("2", "Joao Pedro", "joaopedro@gmail.com");
		List<Usuario> list = new ArrayList<>();
		list.addAll(Arrays.asList(cris, joao));
		return ResponseEntity.ok().body(list);
		
		
		
		
	}

	
	
}
