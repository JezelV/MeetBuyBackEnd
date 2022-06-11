package org.generation.meetbuy.metodoDePago;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
@Service
public class tarjetaService {
public final ArrayList <tarjeta> lista = new ArrayList<tarjeta>();	
	
	public tarjetaService() {
		lista.add(new tarjeta(
				"Guadalupe Gerardo Cortes Perez",
				"2240316024855294",
				"777",
				"02",
				"2023"
				));
		lista.add(new tarjeta(
				"Argemiro Haro",
				"2277282434208860",
				"860",
				"09",
				"2023"
				));
		lista.add(new tarjeta(
				"Juan Carlos",
				"2286119189219271",
				"621",
				"10",
				"2023"
				));
	}
	
	public ArrayList<tarjeta> getTarjeta() {
		return lista;
	}
	
	//Metodo para traer una sola tarjeta por id usando un foreach para recorrer todos los objetos
	public tarjeta getTarjeta(Long tarId) {
		tarjeta tmpTar = null;//Esto evita el error 404
		for(tarjeta tar : lista) {
			if(tar.getId()==tarId) {
				tmpTar = tar;
			}
		}
		return tmpTar;
	}
		//Metodo para traer una tarjeta por un id

	//Metodo para agregar tarjeta (POST)
	public void addTarjeta(tarjeta tar) {
		lista.add(tar);		
	}
	
	//Metodo para eliminar tarjeta desde id (DELETE)
	public void deleteTarjeta(Long tarId) {
		for(tarjeta tar: lista) {
			if(tar.getId()==tarId){
				lista.remove(tar);
				break;
			}
		}
	}
	
	
}