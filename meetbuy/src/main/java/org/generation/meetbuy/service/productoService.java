package org.generation.meetbuy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.generation.meetbuy.model.producto;
import org.generation.meetbuy.model.usuario;
import org.springframework.stereotype.Service;

@Service
public class productoService {
	
	public final ArrayList <producto> lista = new ArrayList<producto>();
	
	public productoService() {
		lista.add(new producto("Papas Sabritas",
				15.5,
				50,
				"papasSabritas.jpg",
				"Comida",
				"Papas sabritas de 180 grms."));
		lista.add(new producto("Refrigerador Samsung",
				15000.00,
				2000,
				"refri.jpg",
				"Electrodomesticos",
				"Refri potente."));
		lista.add(new producto("Televisor LG",
				12000.00,
				1000,
				"tele.jpg",
				"Electrodomesticos",
				"Tele 4k FullHD papau."));
	}

	//Metodo Get para la lista
	public List<producto> getProducto() {
		return lista;
	}
	
	//Metodo Get por id
	public producto getProducto(Long prodId) {
		producto tmpProd = null;
		for(producto prod: lista){
			if(prod.getId()==prodId){
				tmpProd = prod;
			}
		}
		return tmpProd;
	}
	
	//Metodo Get para categoria
	public List<producto> getProducto(String prodCategoria){
		List<producto> tmpList = null;
		for(producto prod: lista){
			if(prod.getCategoriaP()==prodCategoria) {
				tmpList.add(prod);
			}
		}
		return tmpList;
	}
	
	//Metodo Post 
	public void addProducto(producto prod) {
		lista.add(prod);		
	}
	
	//Metodo Put
	public void updateProdcuto(Long prodId, String nombreP, Double precioP, Integer cantidadP, String imgP,
			String categoriaP, String descripcionP) {
		for(producto prod: lista) {
			if(prod.getId()==prodId) {
				if(nombreP!=null) prod.setNombreP(nombreP);
				if(precioP!=null) prod.setPrecioP(precioP);
				if(cantidadP!=null) prod.setCantidadP(cantidadP);
				if(imgP!=null) prod.setImgP(imgP);
				if(categoriaP!=null) prod.setCategoriaP(categoriaP);
				if(descripcionP!=null) prod.setDescripcionP(descripcionP);
			}
		}
	}
	
	//Metodo Delete
	public void deleteProducto(Long prodId) {
		for(producto prod: lista) {
			if(prod.getId()==prodId){
				lista.remove(prod);
				break;
			}
		}
	}
}
