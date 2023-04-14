package com.savings.app.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savings.app.models.usuario;
import com.savings.app.repository.usuarioRepository;

@RestController
@RequestMapping(value="/api")
public class usuarioResoure {
	
	@Autowired
	usuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	public List<usuario> listaUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/usuarios/{id}")
	public usuario encontraUsuarioPorId(@PathVariable(value="id") long id) {
		return usuarioRepository.findById(id);
	}
	
	@PostMapping("/usuarios")
	public usuario criaUsuario(@RequestBody usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
