package ejerciciosBase;

/*
 * 
 *     8. Un programa que carga dos números enteros por teclado y a continuación va a mostrar un menú. 
1.Indicar si alguno de los dos divide al otro, da igual cual al cual.
2.Visualizar la división real de los dos.
3.Potencia del primero elevado al segundo
4.Salir
 *
 * 
 * */

import java.util.Scanner;

public class NumerosEnteros {
	static int numero1 =-1; 
	static int numero2 =-1; 

	public static void inicial() {
	
		Scanner tx = new Scanner(System.in);  
		System.out.println("Dime el primer numero");
		numero1 = tx.nextInt(); 
		System.out.println("Dime el segundo numero");
		numero2 = tx.nextInt(); 
		
		System.out.println("1-Un numero divide al otro");
		System.out.println("2-Division Real"); 
		System.out.println("3-Potencia");
		System.out.println("4-Salir");

		System.out.println("Elija la opcion del menú");
		int op= tx.nextInt(); 
		switch (op) {
		case 1:
			division(); 
			break;
		case 2:
			divisionReal(numero1, numero2); 
			break;
		case 3:
			potencia(numero1, numero2); 
			break;
		case 4:
			System.exit(0);
			break;

		default:
			break;
		}
		
	}
	
	public static void division() {
		if(numero1%numero2==0) {
			System.out.println("El numero 1 divide al numero 2");
		}
		else {
			if(numero2%numero1 ==0)
			{
				System.out.println("El numero 2 divide al numero 1");

			}
			else
			{
				System.out.println("No tienen divison entera");

			}
		}
		
	} 
	public static void divisionReal(int numero1, int numero2) {} 
	public static void potencia(int numero1, int numero2) {} 

}
