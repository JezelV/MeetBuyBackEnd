package org.generation.meetbuy.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="direccion")
public class direccion {
	//Propiedades
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iddireccion", unique = true, nullable = false)
	private Long iddireccion;
	private String calle;
	private String numero;
	private String codigopostal;
	private String colonia;
	private String municipio;
	private String estado;
	
	@OneToMany(mappedBy= "direccion")
	@JsonManagedReference
	private List<usuario> usuario;
	
	//Constructor
	public direccion(Long iddireccion, String calle, String numero, String codigopostal, String colonia,
			String municipio, String estado, List<usuario> usuario) {
		super();
		this.iddireccion = iddireccion;
		this.calle = calle;
		this.numero = numero;
		this.codigopostal = codigopostal;
		this.colonia = colonia;
		this.municipio = municipio;
		this.estado = estado;
		this.usuario = usuario;
	}
	
	//Contructor vacio
	public direccion() {
		
	}
	
	//Getters y Setters
	public Long getIddireccion() {
		return iddireccion;
	}

	public void setIddireccion(Long iddireccion) {
		this.iddireccion = iddireccion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCodigopostal() {
		return codigopostal;
	}

	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
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

	public List<usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<usuario> usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "direccion [iddireccion=" + iddireccion + ", calle=" + calle + ", numero=" + numero + ", codigopostal="
				+ codigopostal + ", colonia=" + colonia + ", municipio=" + municipio + ", estado=" + estado
				+ ", usuario=" + usuario + "]";
	}
	
}