package org.generation.spring.entities;



public class usuarios {
	//propiedades
	private String usuario;
	private String nombre;
	private String contrasenia;
	private String correo;
	private String telefono;
	private int id;
	private static int total = 0;
	
	//Constructor
	public usuarios(String usuario, String nombre, String contrasenia, String correo, String telefono) {
		super();
		total++;
		this.id = total;
		this.usuario = usuario;
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.correo = correo;
		this.telefono = telefono;
	}
	
	//Getters
	public String getUsuario() {
		return usuario;
	}


	
	public String getNombre() {
		return nombre;
	}


	public String getContrasenia() {
		return contrasenia;
	}


	public String getCorreo() {
		return correo;
	}


	public String getTelefono() {
		return telefono;
	}
	
	public int getId() {
		return id;
	}
	
	// Setters
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	@Override
	public String toString() {
		return "usuarios [usuario=" + usuario + ", nombre=" + nombre + ", contraseña=" + contrasenia + ", correo="
				+ correo + ", telefono=" + telefono + "]";
	}
	
	
}
