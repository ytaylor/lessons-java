package ejerciciosBase;

import java.util.Scanner;

public class LeerWithScaner {

	public static void main(String[] args) {
	cadena();
		
	}
	
	public static void cadena(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el nombre");
		String nombre = sc.nextLine(); 
		
		System.out.println("Dime el apellido");
		String apellidos = sc.nextLine(); 
		
		//indexof: letra que esta en una posicion
		System.out.println(nombre.indexOf("")); 
		
		//Substring: devuelve un string dado posiciones
		System.out.println(nombre.substring(2, 4));
		
		
		System.out.println("El tamano" + nombre.length() + " el apellidos es " + apellidos.length()) ;


	}

	
}
