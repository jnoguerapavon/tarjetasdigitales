package org.certific.TarjetaDigital.Model;

public class Response {
	
	
	private boolean Error;
	private String Message;
	
	
	public boolean isError() {
		return Error;
	}
	public void setError(boolean error) {
		Error = error;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	
	
	public Response()
	{
		this.Error= true;
		this.Message="Consulte con el Administrador";
	}
	

}
