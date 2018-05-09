package co.edu.javeriana.pica.controller;

import java.util.Calendar;
import java.util.Date;

import co.edu.javeriana.pica.model.Reserva;
import co.edu.javeriana.pica.persistence.Persistencia;

public class Controlador {
	private  Persistencia persistencia;
	
	public Controlador() {
		this.persistencia = new Persistencia();
	}
	
	public  Reserva consultarReserva(String nroReserva) {
		return persistencia.getObject(nroReserva);
	}
	
	public  String crearReserva(Reserva reserva) {
		String llave = new String();
		if(reserva == null) {
			return llave;
		}else {
			Date fechaActual = new Date();
			 StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("R-");
			stringBuilder.append(fechaActual.getYear());
			stringBuilder.append(fechaActual.getMonth());
			stringBuilder.append(fechaActual.getDate());
			stringBuilder.append(fechaActual.getHours());
			stringBuilder.append(fechaActual.getMinutes());
			stringBuilder.append(fechaActual.getSeconds());
			llave = stringBuilder.toString();
			reserva.setEstadoReserva("RESERVADO");
			reserva.setNroReserva(llave);
			String mes = Calendar.getInstance().get(Calendar.MONTH)<10?"0"+(Calendar.getInstance().get(Calendar.MONTH)+1):""+Calendar.getInstance().get(Calendar.MONTH);
			reserva.setFechaReserva(""+Calendar.getInstance().get(Calendar.YEAR)+"-"+mes+"-"+Calendar.getInstance().get(Calendar.DATE));
			persistencia.saveObject(llave, reserva);
		}
		return llave;
	}
	
	public  boolean cancelarReserva(String nroReserva) {
		return persistencia.deleteObject(nroReserva);
	}
	
}
