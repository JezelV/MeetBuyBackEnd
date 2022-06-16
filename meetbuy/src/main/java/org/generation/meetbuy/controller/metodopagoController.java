package org.generation.meetbuy.controller;

import java.util.List;

import org.generation.meetbuy.model.metodopago;
import org.generation.meetbuy.service.metodopagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/Meet&Buy/metodopago/")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class metodopagoController {
private final metodopagoService metodoPService;
	
	@Autowired
	public metodopagoController(metodopagoService metodoPService) {
		this.metodoPService = metodoPService;
	}
	
	// Get MetodoPago
	@GetMapping
	public List<metodopago> getMetodoPago() {
		return metodoPService.getMetodoPago();
	}
	
	// Get MetodoPago
	@GetMapping(path="{mpId}")
	public metodopago getMetodoPago(@PathVariable("mpId")Long mpId) {
		return metodoPService.getMetodoPago(mpId);
	}
	
	// ADD MetodoPago
	@PostMapping
	public void addMetodoPago(@RequestBody metodopago mp) {
		metodoPService.addMetodoPago(mp);
	}
	
	@DeleteMapping(path="{mpId}")
	public void deleteMetodoPago(@PathVariable("mpId") Long mpId) {
		metodoPService.deleteMetodoPago(mpId);
	}
}
