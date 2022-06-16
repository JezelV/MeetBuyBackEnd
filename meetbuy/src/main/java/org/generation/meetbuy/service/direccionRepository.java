package org.generation.meetbuy.service;

import java.util.Optional;	
import org.generation.meetbuy.model.direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface direccionRepository extends JpaRepository<direccion, Long>{
	@Query("SELECT d FROM direccion d WHERE d.calle=?1")
	Optional<direccion> findByName(String calle);
}
