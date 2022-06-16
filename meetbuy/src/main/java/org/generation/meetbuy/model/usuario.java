package org.generation.meetbuy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;

//Definimos tabla MySQL
@Entity
@Table(name="usuario")
public class usuario {
	//propiedades
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String usuario;
	private String nombre;
	private String contrasenia;
	private String correo;
	private String telefono;
	
	@ManyToOne
	@JoinColumn(name="direccion_fk_usuario")
	@JsonBackReference
	private direccion direccion;
	
	//Constructor
	public usuario(Long id, String usuario, String nombre, String contrasenia, String correo, String telefono) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.correo = correo;
		this.telefono = telefono;
	}
	
	//Constructor vacio
	public usuario() {

	}
	
	//Getter y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "usuario [id=" + id + ", usuario=" + usuario + ", nombre=" + nombre + ", contrasenia=" + contrasenia
				+ ", correo=" + correo + ", telefono=" + telefono + "]";
	}
}
