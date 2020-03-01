package org.certific.TarjetaDigital.Repository;

import java.util.ArrayList;
import java.util.List;

import org.certific.TarjetaDigital.Model.Tarjeta;

public class TarjetaRepositoryImpl implements TarjetaRepository {

	
	private static List<Tarjeta> TarjetasDigitales = new ArrayList<Tarjeta>();
	
	@Override
	public Tarjeta CrearTarjeta(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		
		TarjetasDigitales.add(tarjeta);
		
		return tarjeta;
	}

	@Override
	public List<Tarjeta> ObtenerTodas() {
		return TarjetasDigitales;
	}
	
	

}
