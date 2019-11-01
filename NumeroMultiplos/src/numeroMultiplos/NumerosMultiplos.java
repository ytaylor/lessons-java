package numeroMultiplos;

import java.util.Scanner;

/*Pide dos números e indica si uno es múltiplo del otro, o no.*/

public class NumerosMultiplos {
	
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Dime el primer numero");
		int numero1 = sc.nextInt();
		System.out.print("Dime el segundo numero");
		int numero2 = sc.nextInt(); 
		
		if(numero1%numero2 == 0) {
			System.out.println("El numero 1 es multiplo del numero 2");
		}
		else {
			System.out.println("El numero 1 no es multiplo del numero 2");
		}
		if(numero2%numero1 == 0) {
			System.out.println("El numero 2 es multiplo del numero 1");
		}
		else {
			System.out.println("El numero 2 no es multiplo del numero 1");
		}
		
		if(numero1%numero2 != 0 && numero2%numero1 != 0) {
			System.out.println("Ninguno de los dos son multiplos");
		}	
	}
}
