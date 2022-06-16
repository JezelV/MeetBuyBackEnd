package org.generation.meetbuy.controller;

import java.util.List;

import org.generation.meetbuy.model.direccion;
import org.generation.meetbuy.service.direccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
	
@RestController //estamos diciendo a nuestro controlador que va a manejar la entidad o producto y en este caso, vamos a utilizar metodos GET, POST, PUT y DELETE, le decimos a Spring que esta clase es un controlador
@RequestMapping(path="/Meet&Buy/direccion/")
@CrossOrigin(origins="*")

public class direccionController {
	
	private final direccionService dirService;
	
	@Autowired
	public direccionController(direccionService dirService) {
		this.dirService = dirService;
	}
	
	//Get direcciones
	@GetMapping
	public List<direccion> getDirecciones(){
		return dirService.getDirecciones();
	}
	
	//Get direccion
	@GetMapping(path="{dirId}")
	public direccion getDireccion(@PathVariable("dirId")Long dirId) {
		return dirService.getDireccion(dirId);
	}
	
	//Add direccion
	@PostMapping
	public void addDireccion(@RequestBody direccion dir) {
		dirService.addDireccion(dir);
	}
	
	//Delete direccion
	@DeleteMapping(path="{dirId}")
	public void deleteDireccion(@PathVariable("dirId")Long dirId) {
		dirService.deleteDireccion(dirId);
	}
}