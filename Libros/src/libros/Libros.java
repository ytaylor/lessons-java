package libros;

import java.util.Scanner;


/*Solucion sin Objetos*/
public class Libros {
	
	static Scanner sc = new Scanner(System.in); 
	static String libros[];  //Los isbn de los libros 
	static int numEjemplares[]; //los numeros de ejemplares

	public static void main(String[] args) {
		int option = -1; 
		do {
			System.out.print("1-NoLibros, 2-Libros,  3-Ejemplares, 4-Venta, 5- Salir");
			option =sc.nextInt();
			
			switch (option) {
			case 1:
				//nolibros();
				break;
			case 2:
				insertarLibros();
				break;
			case 3:
				insertarEjemplares();
				break;
			case 4:
				venta(); 
				break;
			default:
				break;
			}
		}while(option !=5); 
	}
	
	
	
	public static void insertarEjemplares() {
		numEjemplares = new int[libros.length];
		for (int i = 0; i < libros.length; i++) {
			System.out.println("Introduce el número de ejemplares del libro con ISBN"+ libros[i]);
			numEjemplares[i] = sc.nextInt(); 
		}		
	}
	
	public static void venta() {
		System.out.println("Introduce el ISBN del libro que quiere comprar");
		String isbn = sc.next();
		if(comprobarLibroEsta(isbn)==true) {
			System.out.println("Introduce la cantidad de ejemplares que quiere comprar");
			int num = sc.nextInt(); 
			
			for (int i = 0; i < libros.length; i++) {
				if(libros[i]!=null) {
					if(libros[i].equals(isbn)) {
						if(numEjemplares[i]>= num) {
							numEjemplares[i]= numEjemplares[i]-num; 
						}
						else {
							System.out.print("No hay suficientes ejemplares");
						}
					}
				}
			}

		}else {
			System.out.print("El libro con ese ISBN no existe");
		}

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
			if(libros[i]!=null) { //Solo hacer la operacion cuando libros en i es distinto de null
			if(libros[i].equals(isbn)) { //Verificar su el isbn introducido
				return true; 
			}
			}
		}
		return false; 
	}

	

}
