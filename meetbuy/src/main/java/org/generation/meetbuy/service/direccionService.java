package org.generation.meetbuy.service;

import java.util.ArrayList;

import org.generation.meetbuy.model.direccion;
import org.springframework.stereotype.Service;

@Service
public class direccionService {
public final ArrayList <direccion> lista = new ArrayList<direccion>();	
	
	public direccionService() {
		lista.add(new direccion(
				"Eduardo Elizondo",
				"110",
				"66700",
				"El Saladito",
				"Marin",
				"Nuevo Leon"
				));
		lista.add(new direccion(
				"Eduardo Elizondo",
				"210",
				"66700",
				"El Saladito",
				"Marin",
				"Nuevo Leon"
				));
		lista.add(new direccion(
				"Eduardo Elizondo",
				"310",
				"66700",
				"El Saladito",
				"Marin",
				"Nuevo Leon"
				));
	}
	
	public ArrayList<direccion> getDireccion() {
		return lista;
	}
	
	//Metodo para traer una sola direccion por id usando un foreach para recorrer todos los objetos
	public direccion getDireccion(Long dirId) {
		direccion tmpDir = null;//Esto evita el error 404
		for(direccion dir : lista) {
			if(dir.getId()==dirId) {
				tmpDir = dir;
			}
		}
		return tmpDir;
	}
		//Metodo para traer una direccion por un id

	//Metodo para agregar direccion (POST)
	public void addDireccion(direccion dir) {
		lista.add(dir);		
	}
	
	//Metodo para eliminar direccion desde id (DELETE)
	public void deleteDireccion(Long dirId) {
		for(direccion dir: lista) {
			if(dir.getId()==dirId){
				lista.remove(dir);
				break;
			}
		}
	}
	
	
}
