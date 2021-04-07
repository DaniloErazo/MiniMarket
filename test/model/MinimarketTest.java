package model;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.DayMismatchException;
import exceptions.IdentificationException;

public class MinimarketTest {
	private Minimarket minimarket;
	
	public void setupScenary1() {
		minimarket = new Minimarket();
	}
	
	public void setupScenary2() throws IdentificationException, DayMismatchException {
		Minimarket minimarket = new Minimarket();
		minimarket.addPerson("CC", 1193029891, 2);
		minimarket.addPerson("CE", 37035011, 2);
		minimarket.addPerson("CC", 1085291278, 4);
	}

	@Test
	public void testAddPerson() throws IdentificationException, DayMismatchException {
		setupScenary1();
		minimarket.addPerson("CC", 1193029891, 6);
		assertEquals(1, minimarket.getPeople().size());
		assertEquals(1193029891, minimarket.getPeople().get(0).getIdNumber());
		assertEquals(1, minimarket.getAttempEntring());
		 
	}
	
	@Test
	public void testAddPerson2() throws IdentificationException, DayMismatchException {
		setupScenary1();
		
		Exception exception = assertThrows(IdentificationException.class, () -> {
			minimarket.addPerson("TI", 188844443, 2);
	    });
		
		String expected = "No se puede registrar con el tipo de identificación ingresada debido a las regulaciones";
		assertEquals(expected, exception.getMessage());
		assertEquals(1, minimarket.getAttempEntring());
	}
	
	@Test
	public void testAddPerson3() {
		setupScenary1();
		
		Exception exception = assertThrows(DayMismatchException.class, () -> {
			minimarket.addPerson("PP", 37035011, 5);
			
	    });
		
		String expected = "De acuerdo a las regulaciones de circulación, no puede ingresar. El antepenúltimo digito de la identificación ingresada no coincide con el día";
		assertEquals(expected, exception.getMessage());
		assertEquals(1, minimarket.getAttempEntring());
		
	}
	
	

}
