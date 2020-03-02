package org.certific.TarjetaDigital.Repository;

import java.util.List;

import org.certific.TarjetaDigital.Model.Inscripcion;
import org.certific.TarjetaDigital.Model.Response;



public interface InscripcionRepository {
	
Response CrearInscripcion (Inscripcion inscripcion);
	
	List<Inscripcion> ObtenerInscripciones();

}
