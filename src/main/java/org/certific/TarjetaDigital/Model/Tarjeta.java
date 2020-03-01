package org.certific.TarjetaDigital.Model;

public class Tarjeta {

	/**
	 * 
	 */
	private String nombreEntidad;
	private String numeroTarjeta;
	private String fechaCaducidad;
	private String nombreTitular;
	private String CVV;
	private Marca Marc;
	
	public String getNombreEntidad() {
		return nombreEntidad;
	}
	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public String getCVV() {
		return CVV;
	}
	public void setCVV(String cVV) {
		CVV = cVV;
	}
	public Marca getMarc() {
		return Marc;
	}
	public void setMarc(Marca marc) {
		Marc = marc;
	}
	
	
}
