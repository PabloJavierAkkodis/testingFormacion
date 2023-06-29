package ejerciciotesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^(.+)@(.+)$", Pattern.CASE_INSENSITIVE);


	public static void main(String[] args) {
		if (emailEsValido( "Pablo@pablo.com") && edadEsValido(18) ){
			System.out.println("Correo OK");
		}else {
			System.out.println("Correo MAL!!");

		}
	}
	
	public static boolean emailEsValido(String email) {
		
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
	    
		return matcher.matches();
	}
	
	
	public static boolean edadEsValido(int edad) {
		return edad < 100 && edad > 17;
	}

}
