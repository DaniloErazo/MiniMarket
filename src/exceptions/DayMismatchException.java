package exceptions;

	@SuppressWarnings("serial")
	public class DayMismatchException extends Exception {
		
		public DayMismatchException() {
			super("De acuerdo a las regulaciones de circulaci�n, no puede ingresar. "
					+ "El antepen�ltimo digito de la identificaci�n ingresada no coincide con el d�a");
		}
	
	}
