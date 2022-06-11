package org.generation.meetbuy.usuario;

import java.util.ArrayList;
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
				"369852147"));
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
}