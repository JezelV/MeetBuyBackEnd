
package org.generation.meetbuy.controller;

import java.util.List;

import org.generation.meetbuy.model.usuario;
import org.generation.meetbuy.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //estamos diciendo a nuestro controlador que va a manejar la entidad o producto y en este caso, vamos a utilizar metodos GET, POST, PUT y DELETE, le decimos a Spring que esta clase es un controlador
@RequestMapping(path="/Meet&Buy/usuario/")
@CrossOrigin(origins="*")

public class usuarioController {
	
	private final usuarioService userService;
	
	@Autowired
	public usuarioController(usuarioService userService) {
		this.userService = userService;
	}
	
	//Get usuarios
	@GetMapping
	public List<usuario> getUsuarios(){
		return userService.getUsuarios();
	}
	
	//Get usuario
	@GetMapping(path="{userId}")
	public usuario getUsuario(@PathVariable("userId")Long userId) {
		return userService.getUsuario(userId);
	}
	
	//Add usuario
	@PostMapping
	public void addUsuario(@RequestBody usuario user) {
		userService.addUsuario(user);
	}
	
	//Delete usuario
	@DeleteMapping(path="{userId}")
	public void deleteUsuario(@PathVariable("userId")Long userId) {
		userService.deleteUsuario(userId);
	}
	
	//Update usuario
	@PutMapping(path="{userId}")
	public void updateUsuario(@PathVariable("userId")Long userId,
			@RequestParam(required=false) String usuario,
			@RequestParam(required=false) String nombre,
			@RequestParam(required=false) String contrasenia,
			@RequestParam(required=false) String correo,
			@RequestParam(required=false) String telefono) {
		userService.updateUsuario(userId, usuario, nombre, contrasenia, correo, telefono);
	}
}
