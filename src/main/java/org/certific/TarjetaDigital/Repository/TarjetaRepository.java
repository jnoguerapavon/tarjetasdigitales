package org.certific.TarjetaDigital.Repository;

import java.util.List;

import org.certific.TarjetaDigital.Model.Tarjeta;

public interface TarjetaRepository {
	
	
	Tarjeta CrearTarjeta(Tarjeta tarjeta);
	
	List<Tarjeta> ObtenerTodas();
	
	

}
