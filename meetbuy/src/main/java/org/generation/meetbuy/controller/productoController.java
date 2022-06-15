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
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //estamos diciendo a nuestro controlador que va a manejar la entidad o producto y en este caso, vamos a utilizar metodos GET, POST, PUT y DELETE, le decimos a Spring que esta clase es un controlador
@RequestMapping(path="/Meet&Buy/producto/")
@CrossOrigin(origins="http://127.0.0.1:5501")

public class productoController {
	
	private final productoService prodService;
	
	@Autowired
	
	public productoController(productoService prodService) {
		this.prodService = prodService;
	}
	
////////////////////////////Aqui empiezan las solicitudes//////////////////////////////////
	
	@GetMapping
	public List<producto> getProducto(){
		return prodService.getProducto();
	}
	
	//Solicitud GET para un solo producto
	@GetMapping (path="{prodID}")
	public producto getProducto(@PathVariable("prodID") Long prodId) {
		return prodService.getProducto(prodId);
	}
	
	
	//Solicitud GET para categorias
	@GetMapping (path="{categoria}")
	public List<producto> getProducto(@PathVariable("categoria") String prodCategoria){
		return prodService.getProducto(prodCategoria);
	}
	
	@PostMapping
	public void addProducto(producto prod) {
		prodService.addProducto(prod);
	}
	
	@PutMapping(path="{prodID}")
	public void updateProducto(@PathVariable("prodID")Long prodId,
			@RequestParam (required = false) String nombreP,
			@RequestParam (required = false) Double precioP,
			@RequestParam (required = false) Integer cantidadP,
			@RequestParam (required = false) String imgP,
			@RequestParam (required = false) String categoriaP,
			@RequestParam (required = false) String descripcionP){
		prodService.updateProdcuto(prodId, nombreP, precioP, cantidadP, imgP, categoriaP, descripcionP);
	}
	
	@DeleteMapping(path="{prodID}")
	public void deleteProducto(@PathVariable("prodID")Long prodId) {
		prodService.deleteProducto(prodId);
	}
}