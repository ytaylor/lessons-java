package ejerciciosBase;

import java.util.Scanner;

/*Alcance: Uso de bucles y arrays*/

public class ArraysStrings {
	/*
	 * 1- PREGUNTAR CUANTOS NOMBRES VA A INSERTAR
	 * 2- HACER UN ARREGLO DEL TAMAÑO QUE HAYA ESPECIFICADO EL USUARIO PARA INSERTAR LOS NOMBRES
	 * 3- INSERTAR LOS NOMBRES DE LOS USUARIOS
	 * 4- ELIMINAR TODOS LOS NOMBRES DE UN USUARIO ESPECIFICADO POR TECLADO
	 * 5- ACTUALIZAR TODOS NOMBRE DE UN USUARIO ESPECIFICADO POR TECLADO
	 * 5.1- ACTUALIZAR EL LISTADO DE NOMBRES AGREGANDO UN NUMERO DELANTE: (1-CARLOS, 2-MARIA, 3-LUIS.... )
	 * 6- VISUALIZAR LOS NOMBRES DE LOS USUARIOS
	 * 7- HACER UN MENU CON TODAS ESTAS OPCIONES
	 * */
	Scanner sc = new Scanner(System.in); 
	String [] lista_nombres;//Declaro el array sin inicializar
	
	public void menu() {
		int op; 
		do {
			System.out.print("1-Insertar..");
			System.out.print("2-Eliminar...");
			System.out.print("3-Modificar ..");
			System.out.print("4-Modificar agregando numero...");
			System.out.print("5-Visualizar...");
			System.out.print("6-Salir...");
			op = sc.nextInt(); 
		
		switch (op) {
		case 1:
			cargar();
			break;
		case 2:
			eliminar();
			break;
		case 3:
			actualizar();
			break;
		case 4:
			actualizarNombreConNumeros();
			break;
		case 5:
			visualizar();
			break;
		default:
			break;
		}
			
		}while(op!=6);
		
	}
	public void cargar() {
		System.out.print("Dime la cantidad de usuarios que vas a insertar");
		int tamanno= sc.nextInt(); 
		lista_nombres = new String[tamanno]; 
		for (int i = 0; i < lista_nombres.length; i++) {
			System.out.print("Dime el nombre del usuario" + (i+1));
			lista_nombres[i]= sc.next(); 
			sc.nextLine(); 
		}
		System.out.print("Los usuarios se han insertado satisfactoriamente");
	}
	
	public void eliminar() {
		System.out.print("Dime el nombre a eliminar");
		String nombre= sc.next(); 
		for (int i = 0; i < lista_nombres.length; i++) {
			if(lista_nombres[i].equals(nombre)) {
				lista_nombres[i]= null; 
			}
		}
		System.out.print("Los usuarios se han eliminado satisfactoriamente");
	}
	
	public void actualizar() {
		System.out.print("Dime el nombre a actualizar");
		String nombre= sc.next(); 
		for (int i = 0; i < lista_nombres.length; i++) {
			if(lista_nombres[i].equals(nombre)) {
				lista_nombres[i]= nombre; 
			}
		}
		System.out.print("Los usuarios se han actualizado satisfactoriamente");
		
	}
	public void visualizar() {
		for (int i = 0; i < lista_nombres.length; i++) {
			System.out.print(lista_nombres[i]);
		}
	}
	
	public void actualizarNombreConNumeros() {
		for (int i = 0; i < lista_nombres.length; i++) {
			String nombre = lista_nombres[i]; 
			nombre = (i+1)+" - "+nombre;  // Para crear este formato 1-CARLOS, 2-MARIA, 3-LUIS.... )
			lista_nombres[i]=nombre; 	
		}
	}

}
