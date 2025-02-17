package numeroCifras;

import java.util.Scanner;

/*
 * Pide un número entre 0 y 99999, e indica cuántas cifras tiene.
 * */
public class NumeroCifras {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String numero;
		
		do {
		//Solución con un string 
		System.out.println("Dime un numero entre  1 y 99999");
		 numero = sc.next(); 
		if(numero.length()>1 && numero.length()<5) {
		System.out.println("La longitud del numero es "+numero.length());
		}
		else {
			System.out.println("El numero introducido está fuera del rango especificado");
		}
		}while(numero.length()<1 || numero.length()>5);
		
		//Solucion con formato Numerico
        int n, cifras;
        String car;
        do{
            System.out.print("Introduce un número entero: ");
            n = sc.nextInt();
            cifras= 0;    //esta variable es el contador de cifras
            while(n!=0){             //mientras a n le queden cifras
                    n = n/10;         //le quitamos el último dígito
                   cifras++;          //sumamos 1 al contador de cifras
            }
            System.out.println("El número tiene " + cifras+ " cifras");
            System.out.print("Continuar? ");
            car = sc.next();
        }while(car!="n" && car != "N");   
		
		
	}

}
