package org.generation.meetbuy.metodoDePago;

public class tarjeta {
		//Id
		private int id;
		private static int total=0;
		//Propiedades
		private String nombreCompletoTitular;
		private String numeroTarjeta;
		private String cvv;
		private String mesVencimiento;
		private String anoVencimiento;
		//Constructor
		public tarjeta(String nombreCompletoTitular, String numeroTarjeta, String cvv, String mesVencimiento,
				String anoVencimiento) {
			super();
			total++;
			this.id = total;
			this.nombreCompletoTitular = nombreCompletoTitular;
			this.numeroTarjeta = numeroTarjeta;
			this.cvv = cvv;
			this.mesVencimiento = mesVencimiento;
			this.anoVencimiento = anoVencimiento;
		}
		//Constructor vacio para el metodo POST
		public tarjeta() {
			super();
			total++;
			this.id = total;
		}
		
		//Getters y Setters
		public String getNombreCompletoTitular() {
			return nombreCompletoTitular;
		}
		public void setNombreCompletoTitular(String nombreCompletoTitular) {
			this.nombreCompletoTitular = nombreCompletoTitular;
		}
		public String getNumeroTarjeta() {
			return numeroTarjeta;
		}
		public void setNumeroTarjeta(String numeroTarjeta) {
			this.numeroTarjeta = numeroTarjeta;
		}
		public String getCvv() {
			return cvv;
		}
		public void setCvv(String cvv) {
			this.cvv = cvv;
		}
		public String getMesVencimiento() {
			return mesVencimiento;
		}
		public void setMesVencimiento(String mesVencimiento) {
			this.mesVencimiento = mesVencimiento;
		}
		public String getAnoVencimiento() {
			return anoVencimiento;
		}
		public void setAnoVencimiento(String anoVencimiento) {
			this.anoVencimiento = anoVencimiento;
		}
		public int getId() {
			return id;
		}
		@Override
		public String toString() {
			return "tarjeta [nombreCompletoTitular=" + nombreCompletoTitular + ", numeroTarjeta=" + numeroTarjeta
					+ ", cvv=" + cvv + ", mesVencimiento=" + mesVencimiento + ", anoVencimiento=" + anoVencimiento
					+ "]";
		}
		
		
	
}
