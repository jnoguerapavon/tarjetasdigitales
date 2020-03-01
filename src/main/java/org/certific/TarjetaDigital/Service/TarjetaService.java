package org.certific.TarjetaDigital.Service;

import java.util.List;

import javax.jws.WebService;

import org.certific.TarjetaDigital.Model.Tarjeta;

@WebService
public interface TarjetaService {
	
	

	Tarjeta CrearTarjeta(Tarjeta tarjeta);
	
	List<Tarjeta> ObtenerTodas();

}
