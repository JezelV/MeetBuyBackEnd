package org.generation.meetbuy.model;

public class direccion {
	//Id
	private int id;
	private static int total=0;
	//Propiedades
	private String calle;
	private String numeroInt;
	private String codigoPostal;
	private String colonia;
	private String municipio;
	private String estado;
	
	//Constructor
	public direccion(String calle, String numeroInt, String codigoPostal, String colonia,
			String municipio, String estado) {
		super();
		total++;
		this.id = total;
		this.calle = calle;
		this.numeroInt = numeroInt;
		this.codigoPostal = codigoPostal;
		this.colonia = colonia;
		this.municipio = municipio;
		this.estado = estado;
	}
	//Constructor vacio para el metodo POST
	public direccion() {
		super();
		total++;
		this.id = total;
	}
	
	//Getters y Setters
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumeroInt() {
		return numeroInt;
	}
	public void setNumeroInt(String numeroInt) {
		this.numeroInt = numeroInt;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "direccion [calle=" + calle + ", numeroInt=" + numeroInt + ", codigoPostal="
				+ codigoPostal + ", colonia=" + colonia + ", municipio=" + municipio + ", estado=" + estado + "]";
	}
	
}