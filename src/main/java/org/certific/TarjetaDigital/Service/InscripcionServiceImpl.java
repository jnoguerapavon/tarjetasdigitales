package org.certific.TarjetaDigital.Service;

import java.util.List;

import javax.jws.WebService;

import org.certific.TarjetaDigital.Model.Inscripcion;
import org.certific.TarjetaDigital.Model.Response;
import org.certific.TarjetaDigital.Repository.InscripcionRepository;
import org.certific.TarjetaDigital.Repository.InscripcionRepositoryImpl;



@WebService(endpointInterface="org.certific.TarjetaDigital.Service.InscripcionService")
public class InscripcionServiceImpl implements InscripcionService {

	
	InscripcionRepository inscripcionRepository = new InscripcionRepositoryImpl();
	
	@Override
	public Response CrearInscripcion(Inscripcion inscripcion) {
		
		return inscripcionRepository.CrearInscripcion(inscripcion);
	}
	@Override
	public List<Inscripcion> ObtenerInscripciones() {
		
		return inscripcionRepository.ObtenerInscripciones();
	}

}