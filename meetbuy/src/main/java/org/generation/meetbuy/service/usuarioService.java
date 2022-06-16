package org.generation.meetbuy.service;

import java.util.List;
import java.util.Optional;
import org.generation.meetbuy.model.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.generation.meetbuy.utils.SHAUtil;

@Service
public class usuarioService {
	
	//Definimos repositorio
	private final usuarioRepository userRepository;
	
	//Inicializamos
	@Autowired
	public usuarioService(usuarioRepository userRepository) {
		this.userRepository = userRepository; 
	}
	
	//Metodo login para usuarios
	public boolean login(String usuario, String contrasenia) {
		boolean res = false;
		Optional<usuario> user = userRepository.findByUsername(usuario);
		if(user.isPresent()) {
			if(user.get().getContrasenia().equals(SHAUtil.createHash(contrasenia))) {
				res=true;
			}
		}
		return res;
	}
	
	//Comenzar a utilizar metodos en nuestro repositorio
	//Get usuarios
	public List<usuario> getUsuarios() {
		return userRepository.findAll();
	}

	public usuario getUsuario(Long userId) {
		return userRepository.findById(userId).orElse(null);
	}

	public void addUsuario(usuario user) {
		// Verificar si existe
		Optional<usuario> usuarioByName = userRepository.findByName(user.getNombre());
		if(usuarioByName.isPresent()) {
			throw new IllegalStateException("El usuario ya existe"); // Lanza error en caso de que exista
		} else {
			user.setContrasenia(SHAUtil.createHash(user.getContrasenia()));
			userRepository.save(user); // Guarda los datos en caso de que no exista
		}			
	}
	
	// Revisamos si existe el usuario
	// If true = se elimina
	// If false = no se elimina y lanzamos exception
	public void deleteUsuario(Long userId) {
		if(userRepository.findById(userId) != null) {
			userRepository.deleteById(userId);
		} else {
			throw new IllegalStateException("El usuario no existe");
		}		
	}

	public void updateUsuario(Long userId, String usuario, String nombre, String contrasenia, String correo,
			String telefono) {
		// Verifica si existe
		if(userRepository.findById(userId) != null) {
			// Vamos a setear cada parametro
			usuario u = userRepository.findById(userId).get();
			if(usuario != null) u.setUsuario(usuario);
			if(nombre != null) u.setNombre(nombre);
			if(contrasenia != null) u.setContrasenia(contrasenia);
			if(correo != null) u.setCorreo(correo);
			if(telefono != null) u.setTelefono(telefono);
			// Guardamos de forma persistente
			userRepository.save(u);
		} else {
			// Lanzamos exception
			throw new IllegalStateException("El usuario no existe");
		}
	}		
}