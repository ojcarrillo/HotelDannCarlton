package co.edu.javeriana.pica.services;

import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.pica.controller.Controlador;
import co.edu.javeriana.pica.model.Reserva;
import co.edu.javeriana.pica.model.Response;

@RestController
@RequestMapping("/")
public class ServicioOrdenes {
	private Controlador controller = new Controlador();
	
	
	@RequestMapping(value="/obtenerReserva/{numero}",method= RequestMethod.GET, produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE} ,headers = "Accept=application/xml")
	public Reserva getReserva(@PathVariable("numero") String numeroReserva) {
		return controller.consultarReserva(numeroReserva);
	}
	
	@CrossOrigin
	@RequestMapping(value="/realizarReserva/",method= RequestMethod.POST,consumes={MediaType.APPLICATION_JSON_VALUE} ,produces={MediaType.APPLICATION_XML_VALUE} ,headers = "Accept=application/json")
	@ResponseBody
	public Response realizarReserva(@RequestBody Reserva reserva) {
		Response response = new Response("","",new Date());
		String nroReserva = controller.crearReserva(reserva);
		if(nroReserva != null && !nroReserva.equals("")) {
			response.setEstado("RESERVADO");
			response.setRespuesta(nroReserva);
		}else {
			response.setEstado("ERROR");
			response.setRespuesta("ERROR AL RESERVAR, INTENTE DE NUEVO MAS TARDE");
		}
		return response;
	}
	
	@RequestMapping(value="/cancelarReserva/{numero}",method= RequestMethod.POST, produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE} ,headers = "Accept=application/xml")
	public Response cancelarReserva(@PathVariable("numero") String numeroReserva) {
		Response response = new Response("CANCELACIÓN EXITOSA","CANCELADO",new Date());
		boolean resultado = controller.cancelarReserva(numeroReserva);
		if(!resultado) {
			response.setEstado("ERROR");
			response.setRespuesta("LA RESERVA NO EXISTE, ERROR AL CANCELAR RESERVA");
		}
		return response;
	}
	

}
