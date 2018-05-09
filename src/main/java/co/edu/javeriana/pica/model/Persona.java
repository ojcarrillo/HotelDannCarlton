package co.edu.javeriana.pica.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persona {
	private String nombre;
	private String apellido;
	private char genero;
	private boolean titular;
	private String nroIdentificacion;
	private String tipoIdentificacion;
	
	public Persona(String nombre,String apellido,char genero,boolean titular,String nroIdentificacion,String tipoIdentificacion) {
		this.nombre = nombre ;
		this.apellido =  apellido;
		this.genero =  genero;
		this.titular =  titular;
		this.nroIdentificacion =  nroIdentificacion;
		this.tipoIdentificacion =  tipoIdentificacion;
	}

	public Persona() {
		this.nombre = "" ;
		this.apellido =  "";
		this.genero =  ' ';
		this.titular =  false;
		this.nroIdentificacion =  "";
		this.tipoIdentificacion =  "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public boolean isTitular() {
		return titular;
	}

	public void setTitular(boolean titular) {
		this.titular = titular;
	}

	public String getNroIdentificacion() {
		return nroIdentificacion;
	}

	public void setNroIdentificacion(String nroIdentificacion) {
		this.nroIdentificacion = nroIdentificacion;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	
	
	
}
