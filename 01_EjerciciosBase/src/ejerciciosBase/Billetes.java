package ejerciciosBase;

import java.util.*;

public class Billetes {
	
	/*
	 * Realice un programa que dado un importe en euros 
	 * nos indique el mínimo número de billetes y la cantidad sobrante 
	 * que se pueden utilizar para obtener dicha cantidad. 
	 * (Ejemplo: 232 euros: 1 billete de 200 euros, 1 billete de 20, 1 billete de 10, Sobrante 2 euros).*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcularBilletes();
		//calcularBilletesArray();
	}
	
	/*Solución utilizando if*/
	public static void calcularBilletes() 
	{
		int resto =0, quin=0, docs=0, cien=0, cincuenta=0, viente=0, diez=0, cinco=0;  
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la cantidad de euros");
		int euros = sc.nextInt(); 

		if(euros/500 !=0) {
			quin = euros/500; 
			euros = euros%500; 
		}
		if(euros/200 !=0) {
			docs= euros/200;
			euros = euros%200;
		}
		if(euros/100 !=0) {
			cien = euros/100; 
			euros = euros%100;
		}
		if(euros/50 !=0) {
			cincuenta = euros/50; 
			euros = euros%50;
		}
		if(euros/20 !=0) {
			viente = euros/20; 
			euros = euros%20;
		}
		if(euros/10 !=0) {
			diez = euros/10; 
			euros = euros%10;
		}
		if(euros/5 !=0) {
			cinco = euros/5; 
			euros = euros%5;
		}
			
		System.out.println("Quinientos: " + quin);
		System.out.println("Doscientos: " + docs);
		System.out.println("Cien: " + cien);
		System.out.println("Cincuenta: " + cincuenta);
		System.out.println("Veinte: " + viente);
		System.out.println("Diez: " + diez);
		System.out.println("Cinco: " + cinco);
		System.out.println("Monedas: " + euros);
	}
	
	/**
	 * Solucion utilizando un array
	 * */
	public static void calcularBilletesArray() {
		
		int resto =0, quin=0, docs=0, cien=0, cincuenta=0, viente=0, diez=10, cinco=0;  
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime la cantidad de euros");
		int euros = sc.nextInt(); 
		//Variables Billetes.
		int billetes[] = {500, 200, 100, 50, 20, 10, 5};
		for (int i : billetes) {
			System.out.printf("%d Billetes de %d", (euros / i), i ); 
		    euros = euros % i; 
		}
		    
	}

}
