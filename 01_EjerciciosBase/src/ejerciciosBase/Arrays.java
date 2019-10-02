package ejerciciosBase;

import java.util.Scanner;

/*
 * Menú con distintas opciones de arrays. Tamaño 10 del array.
Opción 1: carga desde 0 hasta que quiera el usuario. Si doy a cargar sobreescribimos lo que hay.
Opción 2: visualizamos solo los que haya cargados, no los 10.
Opción 3: ordenar de mayor a menor, orden decreciente.
Opción 4: eliminar, pedimos un número y lo eliminamos todas las veces que aparezca en el array.
Opción 5: insertar, pedimos una posición e insertamos en ella el número que quiera el usuario.
Opción 6: Salir.
 * 
 * */

public class Arrays {
   Scanner sc = new Scanner(System.in);
   int numeros[] = new int[10];	 
   
   public void cargar() {
	  
	   int pos=0;
	   String res = "no"; 
	   do {
	   System.out.println("Dime el numero que quieres cargar");
	   numeros[pos]= sc.nextInt();
	   pos++;
	   sc.nextLine(); 
	   System.out.println("Quieres insertar otro numero");
	   res= sc.nextLine();
	   }
	   while(res.equals("si")); 
   }
   
   public void visualizar() {
	   for (int i = 0; i < numeros.length; i++) {
		   if(numeros[i]!=0) {
		   System.out.println("Numero: "+ numeros[i]);
		   }
	}
   }
   
   public void ordenar() {
	   
   }
   
   public void eliminar() 
   {
	   System.out.println("Dime el numero que quieres eliminar");
	   int numero= sc.nextInt();
	   for (int i = 0; i < numeros.length; i++) {
		   if(numeros[i]==numero) {
		     numeros[i]=0;
		   }
		   System.out.println("Numero eliminado correctamente");
	}  
   }
   
   public void insertar() {}
	

}
