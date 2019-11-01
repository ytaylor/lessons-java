package ecuacionSegundoGrado;

import java.util.Scanner;

/*
 * 
 * Pide los coeficientes a, b, c, de una ecuación de segundo grado, y muestra la solución, 
 * las dos soluciones o indica que no tiene soluciones.
 * Nota: la ecuación de segundo grado se supone: a*x^2 + b*x + c = 0
 * */

public class EcuacionSegundoGrado {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Dime el coeficiente a");
		int a = sc.nextInt();
		System.out.print("Dime el coeficiente b");
		int b = sc.nextInt();
		System.out.print("Dime el coeficiente c");
		int c = sc.nextInt();
		
		
		double temporal =(Math.pow(b, 2) * 4*a *c);
		if(temporal>=0) {
		double res1 = (-b+Math.sqrt(temporal))/(2*a);
		double res2 = (-b-Math.sqrt(temporal))/(2*a);
		System.out.println("El resultado de la ecuación de segundo grado es"+ res1);
		System.out.println("El resultado de la ecuación de segundo grado es"+ res2);
		}
		else {
			System.out.println("No tiene solucion real");

		}
		
		
		
	}

}
