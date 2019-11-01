package letraDNI;

import java.util.Scanner;

public class letraDNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.print("Dime el DNI");
		String dni = sc.next();	
		if(dni.length()==8){
			int dniInteger= Integer.parseInt(dni); 
			int numero = dniInteger%23; 
	        String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
	        String letra = letras[numero];
		String NIF = dni + letra;	
	        System.out.println("El NIF es: "+ NIF);
		}else
		{
			System.out.print("La cantidad de numeros es incorrecta");
		}

	}

}
