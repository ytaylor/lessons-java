package main;

import java.util.Scanner;

import modelo.Biblioteca;

public class Main {

	static Biblioteca biblioteca = new Biblioteca(2);
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int opcion=-1; 
		do {
			System.out.println("1-Add Libro, 2-Add Socio ");
			opcion= sc.nextInt();
			switch (opcion) {
			case 1:
				addLibro();
				break;
			case 2:
				addSocio();
				break;
			default:
				break;
			}
		}while(opcion != 5);

	}
	

	public static void addLibro() {
		System.out.println("Dime el isbn Libro");
		String isbn= sc.next(); 
		System.out.println("Dime el titulo Libro");
		String titulo= sc.next(); 
		int resultado= biblioteca.addLibro(isbn, titulo);
		if(resultado == 0) {
			System.out.println("Libro insertado correctamente");
		}else {
			System.out.println("Ya existe un libro con ese ISBN");
		}
	}
	
	public static void addSocio() {
		
		System.out.println("Dime el dni");
		String dni= sc.nextLine(); 
		sc.next(); //Limpiar el buffer
		
		System.out.println("Dime el usuario");
		String nombre= sc.nextLine();
		sc.next(); //Limpiar el buffer
		
		System.out.println("Dime el password");
		String contraseña= sc.nextLine();
		sc.next(); //Limpiar el buffer
		
		int resultado= biblioteca.addSocio(dni, nombre, contraseña);
		if(resultado == 0) {
			System.out.println("Usuario insertado correctamente");
		}else {
			System.out.println("Ya existe un usuario con ese DNI");
		}
	}
}
