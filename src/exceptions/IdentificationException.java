package exceptions;

@SuppressWarnings("serial")
	public class IdentificationException extends Exception {

	
	public IdentificationException() {
		super("No se puede registrar con el tipo de identificaci�n ingresada debido a las regulaciones");
	}


}
