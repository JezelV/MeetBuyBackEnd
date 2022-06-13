package org.generation.meetbuy.direccion;

import java.util.List;
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
	@CrossOrigin(origins="http://127.0.0.1:5501")

	public class direccionController {
	private final direccionService dirService;
		
		@Autowired
		
		public direccionController(direccionService dirService) {
			this.dirService = dirService;
		}
		
	////////////////////////////Aqui empiezan las solicitudes//////////////////////////////////
		
		@GetMapping
		public List<direccion> getDireccion(){
			return dirService.getDireccion(); //quiero que regrese la direccion
		}
		
		//Solicitud GET para una sola direccion desde su id
		@GetMapping (path="{dirID}")
		public direccion getDireccion(@PathVariable("dirID")Long dirId){
			return dirService.getDireccion(dirId);
		}
		
		//metodo POST para crear nuevos direcciones
		@PostMapping
		public void addDireccion(@RequestBody direccion dir) {
			dirService.addDireccion(dir);
		}
		
		//metodo DELETE para eliminar una direccion desde su id
		@DeleteMapping (path="{dirID}")
		public void deleteDireccion(@PathVariable("dirID")Long dirId) {
			dirService.deleteDireccion(dirId);
		}
	}