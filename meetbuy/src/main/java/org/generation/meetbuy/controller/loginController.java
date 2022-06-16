package org.generation.meetbuy.controller;

//import org.generation.ecommercedb.model.Usuario;
//import org.generation.ecommercedb.service.UsuarioService;
import org.generation.meetbuy.model.usuario;
import org.generation.meetbuy.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/Meet&Buy/login/")
@CrossOrigin("*")
public class loginController {
	
	private final usuarioService userService;
	
	@Autowired
	public loginController(usuarioService userService) {
		this.userService = userService;
	}
	
	@PostMapping
	public String login(@RequestBody usuario user) {
		String res = "Usuario y/o contraseña invalidos";
		if(userService.login(user.getUsuario(),user.getContrasenia())) {
			res="Datos correctos";
		}
		return res;
	}
	
}
