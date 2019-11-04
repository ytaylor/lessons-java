package numeroInvertido;

import java.util.Scanner;

/*
 * Pide un número entre 0 y 99999 y mostrar las cifras al revés.
 * */

public class NumeroInvertido {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String numero;
		
		do {
		//Solución con un string 
		System.out.println("Dime un numero entre  1 y 99999");
		 numero = sc.next(); 
		if(numero.length()>1 && numero.length()<5) {
		 String numeros[] = numero.split(""); 
		 String numeroInvertido = "";
		 for (int i = 0; i < numeros.length; i++) {
			numeroInvertido = numeroInvertido+""+numeros[i];
		}
		 System.out.println("El numero invertido es "+ numeroInvertido);
		}
		else {
			System.out.println("El numero introducido está fuera del rango especificado");
		}
		}while(numero.length()<1 || numero.length()>5);
		
		
		//Solución con formato Numerico
        int n, cifrasInvertidas, resto;
        String car;
        do{
            System.out.print("Introduce un número entero: ");
            n = sc.nextInt();
            cifrasInvertidas= 0;    //esta variable será el numero invertido
            while(n!=0){             //mientras a n le queden cifras
                    resto = n%10;
                    cifrasInvertidas = cifrasInvertidas* 10+ resto;
                    n =n/10; 
            }
            System.out.println("El número invertido es " + cifrasInvertidas);
            System.out.print("Continuar? ");
            car = sc.next();
        }while(car!="n" && car != "N");   
		
		
	}


}
