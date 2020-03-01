
package org.certific.TarjetaDigital;

import javax.jws.WebService;

@WebService(endpointInterface = "org.certific.TarjetaDigital.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public String SayByte(String Nombre) {
		// TODO Auto-generated method stub
		return "Adios" + Nombre;
	}
}

