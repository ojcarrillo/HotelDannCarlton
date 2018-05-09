package co.edu.javeriana.pica.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.format.annotation.DateTimeFormat;

@XmlRootElement
public class Reserva implements Serializable {
	private String nroReserva,habitacion,hotel,tipoHabitacion,estadoReserva,fechaReserva,fechaIngreso,fechaSalida;
	private int nroHabitaciones,cantidadPersonas;
	private List<Persona> residentes;
	
	public Reserva() {
		this.nroReserva = "";
		this.habitacion = "";
		this.hotel= "";
		this.fechaReserva = "";
		this.fechaIngreso = "";
		this.fechaSalida = "";
		this.nroHabitaciones=0;
		this.tipoHabitacion="";
		this.cantidadPersonas=0;
		this.estadoReserva="";
		this.residentes = new ArrayList<Persona>();
	}

	
	public Reserva(String nroReserva, String habitacion, String hotel, String fechaReserva,
				   int nroHabitaciones,String tipoHabitacion,int cantidadPersonas,List<Persona> residentes,String estadoReserva) {
		this.nroReserva = nroReserva;
		this.habitacion = habitacion;
		this.hotel= hotel;
		this.fechaReserva = fechaReserva;
		this.nroHabitaciones=nroHabitaciones;
		this.tipoHabitacion=tipoHabitacion;
		this.cantidadPersonas=cantidadPersonas;
		this.estadoReserva=estadoReserva;
		this.residentes=residentes;
	}


	public String getNroReserva() {
		return nroReserva;
	}


	public void setNroReserva(String nroReserva) {
		this.nroReserva = nroReserva;
	}


	public String getHabitacion() {
		return habitacion;
	}


	public void setHabitacion(String habitacion) {
		this.habitacion = habitacion;
	}


	public String getFechaReserva() {
		return fechaReserva;
	}


	public void setFechaReserva(String fechaReserva) {
		this.fechaReserva = fechaReserva;
	}


	public String getHotel() {
		return hotel;
	}


	public void setHotel(String hotel) {
		this.hotel = hotel;
	}


	public int getNroHabitaciones() {
		return nroHabitaciones;
	}


	public void setNroHabitaciones(int nroHabitaciones) {
		this.nroHabitaciones = nroHabitaciones;
	}


	public String getTipoHabitacion() {
		return tipoHabitacion;
	}


	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}


	public int getCantidadPersonas() {
		return cantidadPersonas;
	}


	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}


	public List<Persona> getResidentes() {
		return residentes;
	}


	public void setResidentes(List<Persona> residentes) {
		this.residentes = residentes;
	}


	public String getEstadoReserva() {
		return estadoReserva;
	}


	public void setEstadoReserva(String estadoReserva) {
		this.estadoReserva = estadoReserva;
	}


	public String getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public String getFechaSalida() {
		return fechaSalida;
	}


	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
	
	
}
