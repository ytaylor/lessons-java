package ejerciciosBase;

import java.util.*; 

public class Tiempo {
	
	public static void main(String[] args) {
	
		calcularTiempo();
	}
	
	/**
	 * Realice un programa que le solicite al usuario el tiempo en segundos y 
	 * devuelva el tiempo expresado en horas, minutos y segundos
	 * 
	 * */
	public static void calcularTiempo() {
		
		// 1200 segundos
		// 1 hora - 60 minutos
		// 1 minuto - 60 segundos
		// 1200 segundos / 60 segundos
		int minutos, segundos, horas; 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Dime el tiempo en segundos");
		segundos = sc.nextInt(); 
		
		horas = (segundos / 3600);
	    minutos = ((segundos-horas*3600)/60);
	    segundos = segundos-(horas*3600+minutos*60);
	    System.out.print(horas + ":" + minutos + ":" + segundos); 
	}

}
