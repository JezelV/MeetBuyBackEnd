package org.generation.spring.usuarios;


import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
//Constructor para crear la lista de usuarios
public class usuariosService {
	
	//Aqui ira mi arreglo de productos
		public final ArrayList <usuarios> lista = new ArrayList<usuarios>();
		
		public usuariosService() {
			lista.add(new usuarios("JuanC11",
					"Juan Carlos Flores",
					"12345",
					"juan@gmail.com",
					"2212037976"));
			lista.add(new usuarios("Arge69",
					"Argemiro Haro",
					"98765",
					"arge@gmail.com",
					"369852147"));
		}

		public ArrayList<usuarios> getUsuarios() {
			return lista;
		}
}
