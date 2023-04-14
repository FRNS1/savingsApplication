package com.savings.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savings.app.models.usuario;

public interface usuarioRepository extends JpaRepository<usuario, Long> {
	
	usuario findById(long id);
	
}
