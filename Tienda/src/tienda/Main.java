package tienda;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Tienda td  = new Tienda(); 
	
	public static void main(String[] args) {
		
		int opcion = -1; 
		do {
			 System.out.println("1)Insertar, 2)AddStock, 3) Mostrar Catalogo -1)Salir");
			 opcion = sc.nextInt(); 
			 
			 switch (opcion) {
			case 1:
				insertarProductos();
				break;
			case 2:
				añadirStock();
				break;
			case 3:
				mostrarCatalogo();
				break;
			default:
				break;
			}
			
		} while (opcion !=-1 );

	}
	
	public static void insertarProductos() {
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

	public static void añadirStock() {
		System.out.println("Dime el codigo del producto");
		int codigo = sc.nextInt(); 
		
		System.out.println("Dime la cantidad de kilogramos del producto");
		float kilogramos = sc.nextFloat();
		
		int respuesta = td.addStock(codigo, kilogramos); 
		if(respuesta == 0) {
			System.out.println("Stock Insertado correcatamnete");
		}
		if(respuesta == -2) {
			System.out.println("Producto No encontrado");
		}
		if(respuesta == -3) {
			System.out.println("Los kilogramos no pueden ser negativos");
		}
	}
	
	public static void mostrarCatalogo() {
		
		Producto lista[]= td.mostrarCatalogo();
		
		for (int i = 0; i < lista.length; i++) {
		
			
			if(lista[i]!=null) {
			System.out.println(lista[i].getCodigo() + " - "+ lista[i].getNombre());
			System.out.println(lista[i].getTipo());
			System.out.println("Stock : "+ lista[i].getStock());
			System.out.println("Precio : "+ lista[i].getPrecio() + " €/kg");
			}
		}
	}
	
}
