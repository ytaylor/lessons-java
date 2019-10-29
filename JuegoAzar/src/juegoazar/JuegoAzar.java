package juegoazar;

import java.util.Scanner;

/*
 * Realiza un programa juego_azar2.java que: 
 * obtenga un número al azar entre 1 y 1000,
 * solicite un número al usuario por el teclado,
		Si el número no está entre 1 y 1000 se muestra un mensaje de error,
		Si está entre 1 y 1000 y no es igual al número al azar muestra un mensaje indicando si es mayor o menor, y 
		Vuelve a solicitar otro número al usuario,
		Si es igual al número al azar el programa finaliza y muestra un mensaje de enhorabuena,
		Si después de 7 intentos no se ha acertado el número al azar, el programa finaliza y 
		Se muestra un mensaje indicando cuál era el número al azar,
		Cuando el programa finaliza indica siempre cuántas intentos se han realizado.
 * */

public class JuegoAzar {

	public static void main(String[] args) {
		
		int numeroAleatorio, numeroUsuario, numeroIntentos=0;
		boolean encontrado= false; 
		Scanner sc = new Scanner(System.in);
		
		numeroAleatorio = (int) (Math.random() * 1000 )+ 1;
		System.out.println("Para saber el numero: "+ numeroAleatorio);	
			do {
				System.out.println("Adivina el numero: ");
				numeroUsuario = sc.nextInt(); 
				
				if(numeroUsuario<1 || numeroAleatorio>1000) {
					System.out.println("El numero debe estar comprendido entre 1 y 1000");
					encontrado = true; 
				}
				else {
				if(numeroAleatorio == numeroUsuario) {
					encontrado = true; 
					System.out.println("Enhorabuena");
					System.out.println("Lo ha superado con estos intentos" + numeroIntentos);
					
				}
				else {
					encontrado = false; 
					System.out.println("Numero Incorrecto");
					numeroIntentos++; 
				}
				
				if(numeroIntentos>8) {
					encontrado = true; 
				}
				}
			}while(!encontrado); 
			
			if(numeroIntentos>=7) {
				System.out.println("No lo ha superado. El numero aleatorio era" + numeroAleatorio);

			}
		

	}

}
