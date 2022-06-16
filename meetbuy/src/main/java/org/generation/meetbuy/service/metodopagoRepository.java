package org.generation.meetbuy.service;

import java.util.Optional;

import org.generation.meetbuy.model.metodopago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface metodopagoRepository extends JpaRepository <metodopago, Long> {
	@Query("SELECT p FROM metodopago p WHERE p.nombreT=?1")
	Optional<metodopago> findByName(String nombre);
}