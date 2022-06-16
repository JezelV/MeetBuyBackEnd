package org.generation.meetbuy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Definimos tabla de MySQL
@Entity
@Table(name="metodopago")
public class metodopago {
	// Definimos llave primaria
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "idmetodopago", unique = true, nullable = false)
		private Long id;
		private String nombreT;
		private String numeroT;
		private String cvv;
		private String mesT;
		private String añoT;
		public metodopago(Long id, String nombreT, String numeroT, String cvv, String mesT, String añoT) {
			super();
			this.id = id;
			this.nombreT = nombreT;
			this.numeroT = numeroT;
			this.cvv = cvv;
			this.mesT = mesT;
			this.añoT = añoT;
		}
		
		public metodopago() {}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNombreT() {
			return nombreT;
		}

		public void setNombreT(String nombreT) {
			this.nombreT = nombreT;
		}

		public String getNumeroT() {
			return numeroT;
		}

		public void setNumeroT(String numeroT) {
			this.numeroT = numeroT;
		}

		public String getCvv() {
			return cvv;
		}

		public void setCvv(String cvv) {
			this.cvv = cvv;
		}

		public String getMesT() {
			return mesT;
		}

		public void setMesT(String mesT) {
			this.mesT = mesT;
		}

		public String getAñoT() {
			return añoT;
		}

		public void setAñoT(String añoT) {
			this.añoT = añoT;
		}

		@Override
		public String toString() {
			return "metodoPago [id=" + id + ", nombreT=" + nombreT + ", numeroT=" + numeroT + ", cvv=" + cvv + ", mesT="
					+ mesT + ", añoT=" + añoT + "]";
		}
		
		
}
