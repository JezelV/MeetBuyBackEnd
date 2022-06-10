package org.generation.spring.usuarios;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //estamos diciendo a nuestro controlador que va a manejar la entidad o producto y en este caso, vamos a utilizar metodos GET, POST, PUT y DELETE, le decimos a Spring que esta clase es un controlador

@RequestMapping(path="/meetbuy/usuarios/") //Necesitamos una URL para poder traer los datos (Router)
public class usuariosController {
	
	//Variable del tipo usuarioService llamada prodService
	private final usuariosService userService;
		
	@Autowired //Es para el contexto, por que nosotros no podemos instanciar objetos cuando la aplicacion este desplegada, se tiene que definir todo desde antes
		
	public usuariosController(usuariosService userService) {
		this.userService = userService;
	}//Constructor
	
////////////////////////////Aqui empiezan las solicitudes//////////////////////////////////
	
	@GetMapping
	public List<usuarios> getUsuarios(){
		return userService.getUsuarios(); //quiero que regrese los prodcutos
	}
	
}