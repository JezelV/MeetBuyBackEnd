package org.generation.meetbuy.model;

public class producto {
	//Propiedades
	private String nombreP;
	private Double precioP;
	private Integer cantidadP;
	private String imgP;
	private String categoriaP;
	private String descripcionP;
	
	//Id
	private int id;
	private static int total = 0;
	
	//Constructor 
	public producto(String nombreP, Double precioP, Integer cantidadP, String imgP, String categoriaP,
			String descripcionP) {
		super();
		total++;
		this.id=total;
		this.nombreP = nombreP;
		this.precioP = precioP;
		this.cantidadP = cantidadP;
		this.imgP = imgP;
		this.categoriaP = categoriaP;
		this.descripcionP = descripcionP;
	}
	
	//Constructor vacio POST
	public producto() {
		super();
		total++;
		this.id=total;
	}
	
	//Getters y Setters
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

	public String getCategoriaP() {
		return categoriaP;
	}

	public void setCategoriaP(String categoriaP) {
		this.categoriaP = categoriaP;
	}

	public String getDescripcionP() {
		return descripcionP;
	}

	public void setDescripcionP(String descripcionP) {
		this.descripcionP = descripcionP;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "producto [nombreP=" + nombreP + ", precioP=" + precioP + ", cantidadP=" + cantidadP + ", imgP=" + imgP
				+ ", categoriaP=" + categoriaP + ", descripcionP=" + descripcionP + "]";
	}
}
