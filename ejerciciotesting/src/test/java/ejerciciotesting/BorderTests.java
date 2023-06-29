package ejerciciotesting;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BorderTests {

	
	/*Imaginando que sabemos los requisitos, testearemos los valores límite 18 y 99, ambos incluidos en los valores válidos*/
	
	@Test
	public void testEdadUpLimit_true() {
		int edad = 99;
		
		assertTrue(EmailValidator.edadEsValido(edad));
	}
	
	@Test
	public void testEdadUpLimit_false() {
		int edad = 100;
		
		assertFalse(EmailValidator.edadEsValido(edad));
	}
	
	@Test
	public void testEdadDownLimit_true() {
		int edad = 18;
		
		assertTrue(EmailValidator.edadEsValido(edad));
	}
	
	@Test
	public void testEdadDownLimit_false() {
		int edad = 17;
		
		assertFalse(EmailValidator.edadEsValido(edad));
	}
	
}
