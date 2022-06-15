package org.generation.meetbuy.controller;

import java.util.List;

import org.generation.meetbuy.model.tarjeta;
import org.generation.meetbuy.service.tarjetaService;
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
@RequestMapping(path="/Meet&Buy/tarjeta/")
@CrossOrigin(origins="http://127.0.0.1:5501")
public class tarjetaController {
	private final tarjetaService tarService;
	
	@Autowired
	
	public tarjetaController(tarjetaService tarService) {
		this.tarService = tarService;
	}
	
////////////////////////////Aqui empiezan las solicitudes//////////////////////////////////
	
	@GetMapping
	public List<tarjeta> getTarjeta(){
		return tarService.getTarjeta(); //quiero que regrese la tarjeta
	}
	
	//Solicitud GET para una sola tarjeta desde su id
	@GetMapping (path="{tarID}")
	public tarjeta getTarjeta(@PathVariable("tarID")Long tarId){
		return tarService.getTarjeta(tarId);
	}
	
	//metodo POST para crear nuevas tarjetas
	@PostMapping
	public void addTarjeta(@RequestBody tarjeta tar) {
		tarService.addTarjeta(tar);
	}
	
	//metodo DELETE para eliminar una tarjeta desde su id
	@DeleteMapping (path="{tarID}")
	public void deleteTarjeta(@PathVariable("tarID")Long tarId) {
		tarService.deleteTarjeta(tarId);
	}
}
