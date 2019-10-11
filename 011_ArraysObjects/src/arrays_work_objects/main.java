package arrays_work_objects;

import java.util.Scanner;

public class main {
	 
	static Scanner sc = new Scanner(System.in);
	static Alumno lista_alumnos[] = new Alumno[30];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static void AltaAumno() {
		System.out.println("Dime el numero de clase que quieres insertar");
		int numeroClase= sc.nextInt();
		boolean encontrado= false; 
		for (int i = 0; i < lista_alumnos.length; i++) {
			if(lista_alumnos[i]!=null) {
			Alumno alunmno = lista_alumnos[i];
			if(numeroClase == alunmno.getNumeroClase()) {
				System.out.println("Este usuario ya existe");
				encontrado= true; 
				break; 
			}
		}
		}
		if(encontrado== false) {
			for (int i = 0; i < lista_alumnos.length; i++) {
				if(lista_alumnos[i]== null)
				{
					Alumno alumnonuevo = new Alumno(); 
					alumnonuevo.setNumeroClase(numeroClase);
					lista_alumnos[i]= alumnonuevo; 
				}
			}
		}
		
	}
	
	/*
	 * Evaluar un alumno. Pedimos el número de clase , 
	 * lo buscamos y pedimos la nota que no este evaluada. 
	 * Si tiene alguna de las dos notas evaluadas no se pide esa.
	 * */
	public static void evaluaralumno() {
		System.out.println("Dime el numero de clase que quieres evaluar");
		int numeroClase= sc.nextInt();
		for (int i = 0; i < lista_alumnos.length; i++) {
			if(lista_alumnos[i]!=null) {
			Alumno alunmno = lista_alumnos[i];
			if(numeroClase == alunmno.getNumeroClase()) {
				if(alunmno.getNotaBasesDatos()==-1) {
					
				}
				
				}
			}
		}
	}
	
	
	public static void visualizar() {
		
	}
	
	
}
