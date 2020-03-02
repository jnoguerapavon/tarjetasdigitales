package org.certific.TarjetaDigital.Service;

import java.util.List;

import javax.jws.WebService;

import org.certific.TarjetaDigital.Model.Inscripcion;
import org.certific.TarjetaDigital.Model.Response;



@WebService
public interface InscripcionService {
	
	
	Response CrearInscripcion (Inscripcion inscripcion);
	
	List<Inscripcion> ObtenerInscripciones();

}
