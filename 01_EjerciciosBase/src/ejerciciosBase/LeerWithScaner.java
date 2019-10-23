package ejerciciosBase;

import java.util.Scanner;


public class LeerWithScaner {

	public static void main(String[] args) {
	cadena();
		
	}
	
	public static void cadena(){
		
		Scanner sc = new Scanner(System.in); //scanf
		String nombre=""; 
		
		do {
			System.out.println("Dime el nombre"); //printf
			nombre = sc.nextLine(); 
			if(nombre.equals("alejandro")) {
				System.out.print(nombre);
			}
			
		}while(!nombre.equals("yane")); 
		
		/*while(nombre!="yane") {
			System.out.println("Dime el nombre"); //printf
			nombre = sc.nextLine();	
		}
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Dime el nombre"); //printf
			nombre = sc.nextLine(); 
			
		}
		System.out.println("Dime edad"); //printf
		
		int edad = sc.nextInt(); 
		
		System.out.println("Dime el apellido");
		String apellidos = sc.nextLine(); 
		

		//indexof: letra que esta en una posicion
		System.out.println(nombre.indexOf("")); 
		
		//Substring: devuelve un string dado posiciones
		System.out.println(nombre.substring(2, 4));
		
		
		System.out.println("El tamano" + nombre.length() + " el apellidos es " + apellidos.length()) ;
*/

	}

	
}
