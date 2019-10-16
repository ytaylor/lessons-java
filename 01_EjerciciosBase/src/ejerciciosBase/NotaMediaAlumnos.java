package ejerciciosBase;

import java.util.Scanner;

/*
 * 
 * Se desea realizar un programa que permita calcular la nota media de los alumnos de una clase.
Para ello el programa pedirá al usuario que introduzca el número de alumnos que se han
presentado al examen y las notas de cada uno de ellos.El programa debe sacar como resultado 
la nota media de la clase y el porcentaje de alumnos que han aprobado el examen
 * 
 *
 * */

public class NotaMediaAlumnos {
	
	Scanner sc = new Scanner(System.in); 
	int notas[]; 
	
	public void cargaAlumnos(){
		System.out.println("Dime la cantidad de alumnos");
		int cant = sc.nextInt(); 
		notas = new int[cant]; 
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Dime la nota del alumno " + i);
			notas[i]=sc.nextInt(); 
		}
	}
	public void calcularMedia() {
		int total=0;
		for (int i = 0; i < notas.length; i++) {
			total=total+notas[i]; 
		}
		double media = total/notas.length; 
		System.out.println("La media es "+ media);
		
	}
	public void calcularPorcentaje() {
		int cantaprobados=0;
		for (int i = 0; i < notas.length; i++) {
			if(notas[i]>=5) {
				cantaprobados++;
			}
		}
		double porcentaje= cantaprobados*100/notas.length;
		System.out.println("El porcentaje de aprobados es "+ porcentaje);

	}
	
}
