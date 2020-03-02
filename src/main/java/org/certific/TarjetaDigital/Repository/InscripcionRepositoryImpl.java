package org.certific.TarjetaDigital.Repository;

import java.util.ArrayList;
import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.certific.TarjetaDigital.Model.Inscripcion;
import org.certific.TarjetaDigital.Model.Response;



public class InscripcionRepositoryImpl implements InscripcionRepository {

	
	private static List<Inscripcion> Inscripciones = new ArrayList<Inscripcion>();
	
	@Override
	public Response CrearInscripcion(Inscripcion inscripcion) {
		
		Response response = new Response();
		
	try {
		
		if (inscripcion.getNivel()==null || inscripcion.getPrograma()==null)
		{
			response.setError(true);
			response.setMessage("Programa o Nivel es Invalido");
			return response;
		}
		
		
		if (!IsEmailValido(inscripcion.getEmail()))
		{
			response.setError(true);
			response.setMessage("Email es Invalido");
			return response;
		}
		
		
		if (Existe(inscripcion.getEmail()))
		{
			response.setError(true);
			response.setMessage("Email ya existe");
			return response;
		}
		
		
		
		Inscripciones.add(inscripcion);
	
		response.setError(false);
		response.setMessage("Exitoso");
		
	} catch (Exception e) {
		
		response.setError(true);
		response.setMessage(e.getMessage());
		
	}
	
	return response;
		
		
	}

	@Override
	public List<Inscripcion> ObtenerInscripciones() {
		
		return Inscripciones;
	}
	
	
	boolean IsEmailValido(String Email)
	{
		Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

		Matcher mather = pattern.matcher(Email);

        if (mather.find() == true) {
           return true;
        } else {
            return false;
        }
	}
	
	
	
	boolean Existe(String Email)
	{
		
		
		boolean ExisteItem=false;
		List<Inscripcion> Lista = ObtenerInscripciones();
		
		for (Inscripcion game: Lista) {
		   
			if (game.getEmail().toUpperCase().equals(Email.toUpperCase()))
			{
				return true;
			}
		}
		
		
		return ExisteItem;
		
	}
	


}

