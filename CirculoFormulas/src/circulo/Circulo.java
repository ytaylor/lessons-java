package circulo;

import java.util.Scanner;

/*Pide el radio de un círculo y muestra el diámetro, el perímetro y el área.*/


public class Circulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Dime el radio del ciculo");
		int radio = sc.nextInt(); 
		
		double perimetro = 2*Math.PI*radio; 
		double  area = 2*Math.PI*(Math.pow(radio, 2)); 
		System.out.print("El diametro del circulo es" + (radio*2));
		System.out.print("El perimetro del circulo es" + perimetro);
		System.out.print("El area del circulo es" + area);
	}
}
