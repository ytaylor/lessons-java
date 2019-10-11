package Almacen;

import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {
	
	static Scanner teclado = new Scanner(System.in); 
	static ArrayList<Producto> productosAlamcen = new ArrayList(); 
	static ArrayList<Pedido> pedidosAlamcen = new ArrayList(); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static public void Hacerpedido()
	{
		Pedido pnew = new Pedido(); 
		
	
		System.out.println("Dime el nombre de los productos");
		String nombre = teclado.next(); 
		System.out.println("Dime la cantidad de los productos");
		int cantidad = teclado.nextInt(); 
		
		Producto product = new Producto(); 
		product.setNombre(nombre);
		product.setCantidad(cantidad);
		
		pedidosAlamcen.add(pnew); 
		
		
	}
}
