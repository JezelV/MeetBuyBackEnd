package org.generation.meetbuy.service;

import java.util.List;
import java.util.Optional;
import org.generation.meetbuy.model.direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class direccionService {
	
	//Definimos repositorio
	private final direccionRepository dirRepository;
	
	//Inicializamos
	@Autowired
	public direccionService(direccionRepository dirRepository) {
		this.dirRepository = dirRepository;
	}
	
	//Comenzar a utilizar metodos en nuestro repositorio
	//Get direcciones
	public List<direccion> getDirecciones() {
		return dirRepository.findAll();
	}

	public direccion getDireccion(Long dirId) {
		return dirRepository.findById(dirId).orElse(null);
	}

	public void addDireccion(direccion dir) {
		// Verificar si existe
		Optional<direccion> direccionByName = dirRepository.findByName(dir.getCalle());
		if(direccionByName.isPresent()) {
			throw new IllegalStateException("La direccion ya existe"); // Lanza error en caso de que exista
		} else {
			dirRepository.save(dir); // Guarda los datos en caso de que no exista
		}	
	}
	
	// Revisamos si existe la direccion
	// If true = se elimina
	// If false = no se elimina y lanzamos exception
	public void deleteDireccion(Long dirId) {
		if(dirRepository.findById(dirId) != null) {
			dirRepository.deleteById(dirId);
		} else {
			throw new IllegalStateException("La direccion no existe");
		}	
	}
}
