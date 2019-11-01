package ordenarTresNumeros;

import java.util.Scanner;

/* 
 * Realiza un programa seleccion_switch1 que pida tres números de cualquier tipo por teclado.
 *  Y muestre un mensaje con los tres números ordenados. 
 *
 * */

public class OrdenarTresNumeros {
	
	public static void main(String[] args) {
		int n1, n2, n3;
		String respuesta = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el primer numero");
		n1= sc.nextInt();
		System.out.println("Dime el segundo numero");
		n2= sc.nextInt();
		System.out.println("Dime el tercero numero");
		n3= sc.nextInt();
		
		//If ternario de ejemplo
		String x = (n1>=n2 && n1>=n3)? (n2>=n3)?"n1,n2,n3": "n1,n3,n2":null; 
		
		if(n1>=n2 && n1>=n3) { //n1 es el mayor
			if(n2>=n3) { //n2 segundo mayor
				respuesta = "n1,n2,n3"; 
			}
			else
			{
				respuesta = "n1,n3,n2";//n3 segunda posición
			}
		}
		
		if(n2>=n3 && n2>=n1) { //n2 es el mayor
			if(n1>=n3) { 
				respuesta = "n2,n1,n3"; 
			}
			else
			{
				respuesta = "n2,n3,n1";
			}
		}
		
		if(n3>=n2 && n3>=n1) { //n3 es el mayor
			if(n2>=n1) { 
				respuesta = "n3,n2,n1"; 
			}
			else
			{
				respuesta = "n3,n1,n2";
				
			}
		}
		
		switch (respuesta) {
		case "n1,n2,n3":
			System.out.println("Los numeros ordenados de mayor a menor son: "+n1 +","+ n2 +","+ n3);
			break;
		case "n1,n3,n2":
			System.out.println("Los numeros ordenados de mayor a menor son: "+n1 +","+ n3 +","+ n2);
			break;
			
		case "n2,n1,n3":
			System.out.println("Los numeros ordenados de mayor a menor son: "+n2 +","+ n1 +","+ n3);
			break;
			
		case "n2,n3,n1":
			System.out.println("Los numeros ordenados de mayor a menor son: "+n2 +","+ n3 +","+ n1);
			break;
			
		case "n3,n2,n1":
			System.out.println("Los numeros ordenados de mayor a menor son: "+n3 +","+ n2 +","+ n1);
			break;
			
		case "n3,n1,n2":
			System.out.println("Los numeros ordenados de mayor a menor son: "+n3 +","+ n1 +","+ n2);
			break;
			
		default:
			break;
		}
		
	}

}
