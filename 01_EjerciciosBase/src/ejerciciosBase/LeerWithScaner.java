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
		
		System.out.println("El tamano" + nombre.length() + " el apellidos es " + apellidos.length()) ;


	}

	
}
