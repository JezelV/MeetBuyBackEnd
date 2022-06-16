package org.generation.meetbuy.service;

import java.util.List;
import java.util.Optional;

import org.generation.meetbuy.model.producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productoService {
	// Definimos repositorio
	private final productoRepository prodRepository;
	
	// Inicializamos
	@Autowired
	public productoService(productoRepository prodRepository) {
		this.prodRepository = prodRepository;
	}

	// Comenzar a utilizar metodos de nuestro Repository
	// Get productos
	public List<producto> getProducto() {
		return prodRepository.findAll();
	}

	// Get producto
	public producto getProducto(Long prodId) {
		return prodRepository.findById(prodId).orElse(null);
	}

	// SET producto
	public void addProducto(producto prod) {
		// Verificar si existe
		Optional<producto> productoByName = prodRepository.findByName(prod.getNombreP());
		if(productoByName.isPresent()) {
			throw new IllegalStateException("El producto ya existe"); // Lanza error en caso de que exista
		} else {
			prodRepository.save(prod); // Guarda los datos en caso de que no exista
		}	
	}

	// Revisamos si existe el producto
	// If true = se elimina
	// If false = no se elimina y lanzamos exception
	public void deleteProducto(Long prodId) {
		if(prodRepository.findById(prodId) != null) {
			prodRepository.deleteById(prodId);
		} else {
			throw new IllegalStateException("El producto no existe");
		}
	}

	public void updateProducto(Long prodId, String nombreP, Double precioP, Integer cantidadP, String imgP, String descripcionP) {
		// Verifica si existe
		if(prodRepository.findById(prodId) != null) {
			// Vamos a setear cada parametro
			producto p = prodRepository.findById(prodId).get();
			if(nombreP != null) p.setNombreP(nombreP);
			if(precioP != null) p.setPrecioP(precioP);
			if(cantidadP !=0) p.setCantidadP(cantidadP);
			if(imgP != null) p.setImgP(imgP);
			if(descripcionP != null) p.setDescripcionP(descripcionP);
			
			// Guardamos de forma persistente
			prodRepository.save(p);
		} else {
			// Lanzamos exception
			throw new IllegalStateException("El producto no existe");
		}
	}
	
}
