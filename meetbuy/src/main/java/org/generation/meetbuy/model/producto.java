package org.generation.meetbuy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


// Definimos tabla de MySQL
@Entity
@Table(name="producto")
public class producto {
	// Definimos llave primaria
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproducto", unique = true, nullable = false)
	private Long id;
	private String nombreP;
	private Double precioP;
	private Integer cantidadP;
	private String imgP;
	private String descripcionP;
	
	

	

	public producto(Long id, String nombreP, Double precioP, Integer cantidadP, String imgP, String descripcionP) {
		super();
		this.id = id;
		this.nombreP = nombreP;
		this.precioP = precioP;
		this.cantidadP = cantidadP;
		this.imgP = imgP;
		this.descripcionP = descripcionP;
	}

	public producto() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public Double getPrecioP() {
		return precioP;
	}

	public void setPrecioP(Double precioP) {
		this.precioP = precioP;
	}

	public Integer getCantidadP() {
		return cantidadP;
	}

	public void setCantidadP(Integer cantidadP) {
		this.cantidadP = cantidadP;
	}

	public String getImgP() {
		return imgP;
	}

	public void setImgP(String imgP) {
		this.imgP = imgP;
	}

	public String getDescripcionP() {
		return descripcionP;
	}

	public void setDescripcionP(String descripcionP) {
		this.descripcionP = descripcionP;
	}

	@Override
	public String toString() {
		return "producto [id=" + id + ", nombreP=" + nombreP + ", precioP=" + precioP + ", cantidadP=" + cantidadP
				+ ", imgP=" + imgP + ", descripcionP=" + descripcionP + "]";
	}

	
}