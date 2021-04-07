package exceptions;

@SuppressWarnings("serial")
	public class IdentificationException extends Exception {

	
	public IdentificationException() {
		super("No se puede registrar con el tipo de identificación ingresada debido a las regulaciones");
	}


}
