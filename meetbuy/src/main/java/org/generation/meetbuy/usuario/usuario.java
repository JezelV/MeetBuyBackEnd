package org.generation.meetbuy.usuario;

public class usuario {
	//propiedades
	private String usuario;
	private String nombre;
	private String contrasenia;
	private String correo;
	private String telefono;
	
	//Id
	private int id;
	private static int total = 0;
	
	//Constructor
	public usuario(String usuario, String nombre, String contrasenia, String correo, String telefono) {
		super();
		total++;
		this.id=total;
		this.usuario = usuario;
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.correo = correo;
		this.telefono = telefono;
	}
	
	//Getters y Setters
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

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "usuario [usuario=" + usuario + ", nombre=" + nombre + ", contrasenia=" + contrasenia
				+ ", correo=" + correo + ", telefono=" + telefono + "]";
	}
}
