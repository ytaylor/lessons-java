package letraDNI;

import java.util.Scanner;

public class letraDNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.print("Dime el DNI");
		String dni = sc.next();	
		if(dni.length()==8){
			int dniInteger= Integer.parseInt(dni); 
			int numero = dniInteger%23; 
	        String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "j", "Z", "S", "Q", "V", "H", "L", "C", "K", "E", "F"};
	        var letra = letras[numero];
	        System.out.println("La letra del DNI es "+ letra);
		}else
		{
			System.out.print("La cantidd de numeros es incorrecta");
		}

	}

}
