package libros;

import java.util.Scanner;

public class Libros {
	
	static Scanner sc = new Scanner(System.in); 
	static String libros[]; 

	public static void main(String[] args) {
		insertarLibros();
		
	}
	
	public static void insertarLibros() {
		System.out.print("Dime el # de libros");
		int numero = sc.nextInt();
		libros = new String[numero];
		String isbn="";
		for (int i = 0; i < libros.length; i++) {
	
			do {
			System.out.print("Dime el ISBN");
			isbn= sc.next();
			}while(comprobarLibroEsta(isbn)==true);
			//Conprobar si esta el arreglo
			
			if(comprobarLibroEsta(isbn)==false) {
				libros[i]=isbn; 
			}
		}		
	}
	//Si return true: el libro esta 
	//Si retun false: el libro no esta
	public static boolean comprobarLibroEsta(String isbn) 
	{
		for (int i = 0; i < libros.length; i++) {
			if(libros[i].equals(isbn)) {
				return true; 
			}
		}
		return false; 
	}


}
