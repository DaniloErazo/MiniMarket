package exceptions;

	@SuppressWarnings("serial")
	public class DayMismatchException extends Exception {
		
		public DayMismatchException() {
			super("De acuerdo a las regulaciones de circulación, no puede ingresar. "
					+ "El antepenúltimo digito de la identificación ingresada no coincide con el día");
		}
	
	}
