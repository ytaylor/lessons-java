package ejerciciosBase;

import java.util.Scanner;

public class NotasAlumnosOrden {
	

	static Scanner sc = new Scanner(System.in);
	static float notasAlumno1[] = new float[4];
	static float notasAlumno2[] = new float[4];
	static float notasAlumno3[] = new float[4];
	
	public static void main(String[] args) {
		cargarAlumnos(); 
		visualizar();
	}
	
	public static void alumno(float[] notas, String alumno) {
		float sumador=0; 
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Dime la nota del"+ alumno+ "parcial " + (i+1));	
			float nota = sc.nextFloat();
			notas[i]=  nota; 
			sumador +=nota; 
		}
		notas[3]=sumador/(notas.length-1); 
	}
	
	public static void visualizar() {
			String formato = "| %2s | %4.0f | %4.00f | %4.0f %n";
	        String formato2 = "|            | %4d | %6.2f |%n";
	        String separador = "+------------+------+--------+%n";
	        System.out.printf("%n%nListado de las Notas %n%n");		
	        System.out.printf(separador);
	        
	        for(int i = 0; i < 3; i++) {
	            System.out.printf(formato, (i+1),notasAlumno1[i],notasAlumno2[i],notasAlumno3[i] );
	        }
	        System.out.printf(separador);
	        
	        for(int i = 0; i < 3; i++) {
	            System.out.printf(formato2, i,notasAlumno1[3],notasAlumno2[3],notasAlumno3[3] );
	        }
	        System.out.printf(separador);
	}
	
	public static void cargarAlumnos() {
		alumno(notasAlumno1, "alumno 1");
		alumno(notasAlumno2, "alumno 2");
		alumno(notasAlumno3, "alumno 3");		
	}
	
	

}
