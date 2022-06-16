package org.generation.meetbuy.controller;


import java.util.List;

import org.generation.meetbuy.model.producto;
import org.generation.meetbuy.service.productoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/Meet&Buy/producto/")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
        RequestMethod.PUT })
public class productoController {
	private final productoService prodService;
	
	@Autowired
	public productoController(productoService prodService) {
		this.prodService = prodService;
	}
	
	// Get Productos
	@GetMapping
	public List<producto> getProducto() {
		return prodService.getProducto();
	}
	
	// Get Producto
	@GetMapping(path="{prodId}")
	public producto getProducto(@PathVariable("prodId")Long prodId) {
		return prodService.getProducto(prodId);
	}
	
	// ADD Producto
	@PostMapping
	public void addProducto(@RequestBody producto prod) {
		prodService.addProducto(prod);
	}
	
	@DeleteMapping(path="{prodId}")
	public void deleteProducto(@PathVariable("prodId") Long prodId) {
		prodService.deleteProducto(prodId);
	}
	
	// Update producto
	@PutMapping(path="{prodId}")
	public void updateProducto(@PathVariable("prodId") Long prodId,
			@RequestParam(required=false) String nombreP,
			@RequestParam(required=false) Double precioP,
			@RequestParam(required=false) Integer cantidadP,
			@RequestParam(required=false) String imgP,
			@RequestParam(required=false) String descripcionP)
			{
		prodService.updateProducto(prodId, nombreP,precioP,cantidadP,imgP,descripcionP);
	}
	
	
	
	
	
	
}
