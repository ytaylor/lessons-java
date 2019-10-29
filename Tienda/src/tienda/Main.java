package tienda;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Tienda td  = new Tienda(); 
	
	public static void main(String[] args) {
		System.out.println("Dime el nombre del producto");
		String nombre = sc.next(); 

		System.out.println("Dime el precio del producto");
		float precio = sc.nextFloat(); 

		System.out.println("Dime el tipo del producto");
		String tipo = sc.next(); 

		System.out.println("Dime el codigo del producto");
		int codigo = sc.nextInt(); 
		
		td.addProducto(nombre, precio, tipo, codigo);
		
		

	}

}
