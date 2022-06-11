package org.generation.meetbuy.usuario;

import java.util.List;
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
@CrossOrigin(origins="http://127.0.0.1:5500/index.html")

public class usuarioController {
private final usuarioService userService;
	
	@Autowired
	
	public usuarioController(usuarioService userService) {
		this.userService = userService;
	}
	
////////////////////////////Aqui empiezan las solicitudes//////////////////////////////////
	
	@GetMapping
	public List<usuario> getUsuario(){
		return userService.getUsuario(); //quiero que regrese los prodcutos
	}
	
	//Solicitud GET para un solo producto
	@GetMapping (path="{userID}")
	public usuario getUsuario(@PathVariable("userID")Long userId){
		return userService.getUsuario(userId);
	}
	
	//metodo POST para crear nuevos usuarios
	@PostMapping
	public void addUsuario(/*@RequestBody*/ usuario user) {
		userService.addUsuario(user);
	}
	
	
	//metodo PUT para modificar un producto ya existente
	@PutMapping (path="{userID}")
	public void updateUsuario(@PathVariable("userID")Long userId,
		@RequestParam (required = false) String usuario,
		@RequestParam (required = false) String nombre,
		@RequestParam (required = false) String contrasenia,
		@RequestParam (required = false) String correo,
		@RequestParam (required = false) String telefono){
		userService.updateUsuarios (userId, usuario, nombre, contrasenia, correo, telefono);
	}//updateProducto
	
	@DeleteMapping (path="{userID}")
	public void deleteUsuario(@PathVariable("userID")Long userId) {
		userService.deleteUsuario(userId);
	}
}
