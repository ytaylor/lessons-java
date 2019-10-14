package ejerciciosBase;

import java.util.Scanner;

/*
 * ARRAY DE 20 POSICIONES QUE GUARDARA LOS PRECIOS DE DIFERENTES PRODUCTOS. 
 * ARRAY CON 20 PRODUCTOS. 
 * DONDE CADA POSICIONES DEL ARREGLO DE PRECIOS CORRESPONDE AL PRODUCTO EN LA MISMA POSICIÓN. 
 * REALIZAR LAS SIGUIENTES OPCIONES: 
 * 1- PEDIR POR TECLADO INICIALAMNETE 10 PRODUCTOS CON SUS 10 PRECIOS.
 * 2- VISUALIZR CADA PRODUCTO CON SU PRECIO
 * 3- ELIMINAR UN PRODUCTO CON SU PRECIO
 * 4- ACTUALIZAR EL PRECIO DE UN PRODUCTO
 * */

public class ArraysDouble {
	
	double precios[] = new double[20]; 
	String nombres[] = new String[20]; 
	Scanner sc =new Scanner(System.in); 
	
	
	public void insertar() {
	for (int i = 0; i < 10; i++) {
		System.out.println("Dime el producto");
		String producto= sc.nextLine();

		System.out.println("Dime el precio");
		double precio= sc.nextDouble();
		
		nombres[i]= producto;
		precios[i]= precio; 
		}
	}
	
	public void visualizar() {
		for (int i = 0; i < nombres.length; i++) {
			if(nombres[i]!=null) {
			System.out.println("Producto:"+nombres[i]+", "+"Precio"+precios[i]);
			}
		}	
	}
	
	public void eliminar() {
		System.out.println("Dime el producto");
		String producto= sc.nextLine();
		for (int i = 0; i < nombres.length; i++) {
			if(nombres[i].equals(producto)) {
				nombres[i]= null; 
				precios[i]=0;
				break;
			}
		}
	}
	
	public void actualizarPrecio() {
		System.out.println("Dime el producto");
		String producto= sc.nextLine();

		System.out.println("Dime el precio");
		double precio= sc.nextDouble();
		
		for (int i = 0; i < nombres.length; i++) {
			if(nombres[i].equals(producto)) {
				precios[i]=precio;
				break;
			}
		}
		
	}
	
	
	

}
