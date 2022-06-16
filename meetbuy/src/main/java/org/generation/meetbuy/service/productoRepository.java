package org.generation.meetbuy.service;

import java.util.Optional;

import org.generation.meetbuy.model.producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface productoRepository extends JpaRepository <producto, Long> {
	@Query("SELECT p FROM producto p WHERE p.nombreP=?1")
	Optional<producto> findByName(String nombre);
}