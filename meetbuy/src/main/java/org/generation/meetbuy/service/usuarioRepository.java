package org.generation.meetbuy.service;

import java.util.Optional;	
import org.generation.meetbuy.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface usuarioRepository extends JpaRepository<usuario, Long>{
	//
	@Query("SELECT u FROM usuario u WHERE u.nombre=?1")
	Optional<usuario> findByName(String nombre);
	
	//Query para buscar usuarios en la tabla usuario
	@Query("SELECT u FROM usuario u WHERE u.usuario =?1")
    Optional<usuario> findByUsername(String usuario);
}
