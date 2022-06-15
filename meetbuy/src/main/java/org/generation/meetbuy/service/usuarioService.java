package org.generation.meetbuy.service;

import java.util.ArrayList;

import org.generation.meetbuy.model.usuario;
import org.springframework.stereotype.Service;

@Service
public class usuarioService {
	
public final ArrayList <usuario> lista = new ArrayList<usuario>();	
	
	public usuarioService() {
		lista.add(new usuario("JuanC11",
				"Juan Carlos Flores",
				"12345",
				"juan@gmail.com",
				"2212037976"));
		lista.add(new usuario("Arge69",
				"Argemiro Haro",
				"98765",
				"arge@gmail.com",
				"3698521475"));
		lista.add(new usuario("Licht23",
				"Jessica Lopez",
				"hola123",
				"Jessica@gmail.com",
				"1122334455"));
	}
	
	public ArrayList<usuario> getUsuario() {
		return lista;
	}
	
	//Metodo para traer un solo producto por id usando un foreach para recorrer todos los objetos
	public usuario getUsuario(Long userId) {
		usuario tmpUser = null;//Esto evita el error 404
		for(usuario user : lista) {
			if(user.getId()==userId) {
				tmpUser = user;
			}
		}
		return tmpUser;
	}
		//Metodo para traer un objeto por un id

	//Metodo para agregar usuarios (POST)
	public void addUsuario(usuario user) {
		lista.add(user);		
	}
	
	//Metodo para cambiar parametros de los usuarios (PUT)
	public void updateUsuarios(Long userId, String usuario, String nombre, String contrasenia, String correo,
			String telefono) {
		for(usuario user: lista) {
			if(user.getId()==userId) {
				if(usuario!=null) user.setUsuario(usuario);
				if(nombre!=null) user.setNombre(nombre);
				if(contrasenia!=null) user.setContrasenia(contrasenia);
				if(correo!=null) user.setCorreo(correo);
				if(telefono!=null) user.setTelefono(telefono);
			}
		}
	}
	
	//Metodo para eliminar usuario (DELETE)
	public void deleteUsuario(Long userId) {
		for(usuario user: lista) {
			if(user.getId()==userId){
				lista.remove(user);
				break;
			}
		}
	}
	
	//Metodo GET de un usuario por correo
	public usuario getUsuario(String userCorreo) {
		usuario tmpUser = null;
		for(usuario user: lista) {
			if(user.getCorreo()==userCorreo) {
				tmpUser = user;
			}
		}
		return tmpUser;
	}
	
	
}
