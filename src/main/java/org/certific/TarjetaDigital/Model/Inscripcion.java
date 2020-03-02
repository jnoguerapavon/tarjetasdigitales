package org.certific.TarjetaDigital.Model;



public class Inscripcion {
	
	
	private String Nombre ;
	private String Apellido_Paterno;
	private String Apellido_Materno;
	private String Email;
	private String Telefono;
	private Programas programa;
	private Nivel nivel;
	private boolean Estado;
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido_Paterno() {
		return Apellido_Paterno;
	}
	public void setApellido_Paterno(String apellido_Paterno) {
		Apellido_Paterno = apellido_Paterno;
	}
	public String getApellido_Materno() {
		return Apellido_Materno;
	}
	public void setApellido_Materno(String apellido_Materno) {
		Apellido_Materno = apellido_Materno;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public Programas getPrograma() {
		return programa;
	}
	public void setPrograma(Programas programa) {
		this.programa = programa;
	}
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	public boolean isEstado() {
		return Estado;
	}
	public void setEstado(boolean estado) {
		Estado = estado;
	}	
	
	

}
