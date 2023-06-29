package ejerciciotesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {
	
	
	//Aqui probamos 5 usuarios distintos
	
	@Test
	public void testValidator_pablo_true() {
		String email = "Pablo@formacionmail.com";
		int edad = 23;
		
		assertTrue(EmailValidator.emailEsValido(email) && EmailValidator.edadEsValido(edad));
	}
	
	@Test
	public void testValidator_ramon_true() {
		String email = "ramon@perritoscalientes.com";
		int edad = 67;
		
		assertTrue(EmailValidator.emailEsValido(email) && EmailValidator.edadEsValido(edad));
	}
	
	@Test
	public void testValidator_irene_true() {
		String email = "IRENE.GUT.Ort@rrhhmail.com";
		int edad = 25;
		
		assertTrue(EmailValidator.emailEsValido(email) && EmailValidator.edadEsValido(edad));
	}
	
	@Test
	public void testValidator_luciana_true() {
		String email = "lUCIANAESTETICA@fmail.com";
		int edad = 30;
		
		assertTrue(EmailValidator.emailEsValido(email) && EmailValidator.edadEsValido(edad));
	}
	
	@Test
	public void testValidator_jose_true() {
		String email = "A.R.Jose@gestoria.com";
		int edad = 35;
		
		assertTrue(EmailValidator.emailEsValido(email) && EmailValidator.edadEsValido(edad));
	}
	
	
	
	// El resto de tests unitarios
	
	
	@Test
	public void testValidator_false() {
		String email = "Pabloformacionmail.com";
		int edad = 15;
		
		assertFalse(EmailValidator.emailEsValido(email) && EmailValidator.edadEsValido(edad));
	}
	
	@Test
	public void testEmail_true() {
		String email = "Pablo@formacionmail.com";
		
		assertTrue(EmailValidator.emailEsValido(email));
		
	}
	
	@Test
	public void testEmail_false() {
		String email = "Pabloformacionmail.com";
		
		assertFalse(EmailValidator.emailEsValido(email));
	}
	
	@Test
	public void testEdad_true() {
		int edad = 30;
		
		assertTrue(EmailValidator.edadEsValido(edad));
	}
	
	@Test
	public void testEdad_false() {
		int edad = 15;
		
		assertFalse(EmailValidator.edadEsValido(edad));
	}
}
