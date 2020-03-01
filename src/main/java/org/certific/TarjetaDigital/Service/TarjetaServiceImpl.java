package org.certific.TarjetaDigital.Service;

import java.util.List;

import javax.jws.WebService;

import org.certific.TarjetaDigital.Model.Tarjeta;
import org.certific.TarjetaDigital.Repository.TarjetaRepository;
import org.certific.TarjetaDigital.Repository.TarjetaRepositoryImpl;


@WebService(endpointInterface="org.certific.TarjetaDigital.Service.TarjetaService")
public class TarjetaServiceImpl implements TarjetaService {

	
	TarjetaRepository tarjetaRepository = new TarjetaRepositoryImpl();
	
	@Override
	public Tarjeta CrearTarjeta(Tarjeta tarjeta) {
		tarjetaRepository.CrearTarjeta(tarjeta);
		return tarjeta;
	}

	@Override
	public List<Tarjeta> ObtenerTodas() {
	
		return tarjetaRepository.ObtenerTodas();
	}
	
	
	

}
