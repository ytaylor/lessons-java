package ejerciciosBase;

import java.io.Console;


public class ReadWithConsole {

	public void CargaDatos() {
		Console csl = System.console();
		String nombre= csl.readLine(); 
		
		char[] password = csl.readPassword();
		for (int i = 0; i < password.length; i++) {
			
		}
		
	}
}
