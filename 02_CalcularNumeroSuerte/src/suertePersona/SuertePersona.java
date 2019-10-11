package suertePersona;

import java.util.Scanner;

/*Calcular el numero de la suerte de una persona*/

public class SuertePersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int dia, mes, anno; 
		boolean validarmes, validardia= false; 
		
		do {
			System.out.println("Dime el dia");
			dia = sc.nextInt();
			System.out.println("Dime el mes");
			mes = sc.nextInt();
			System.out.println("Dime el año");
			anno = sc.nextInt();
			validarmes= validarmes(mes);
			validardia = validardia(mes, dia, anno);
				if(!validarmes) {
				System.out.println("Debe introducir un mes válido.");}
				if(!validardia) {
				System.out.println("Debe introducir un dia válido");}
		}while(!validarmes || !validardia);
		
	
		int sumatresdigitos= dia+mes+anno; 
		System.out.println("La suma de los tres digitos es " + sumatresdigitos);
		
		//Suma de los digitos del numero encontrado
		int resultado=0; 
		  while(sumatresdigitos > 0) {
	            resultado += sumatresdigitos % 10;
	            sumatresdigitos = sumatresdigitos / 10;
	        }
	        System.out.println("La suma es: " + resultado);
	}

	public static boolean validarmes(int mes)
	{
		if(mes >=1 && mes <=12)
			return true;
		else
			return false; 
	}
	
	public static boolean validardia(int mes, int dia, int anno) {
		boolean res=false; 
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(dia >=1 && dia <=31)
				res = true; 
			else
				res= false; 
			break;
		case 2:
			if(annobisiesto(anno)) {
			if(dia >=1 && dia <=29)
				res = true; 
			else
				res= false; 
			}else
			{
				if(dia >=1 && dia <=28)
					res = true; 
				else
					res= false; 
				
			}
			break;
		case 4:
		case 9:
		case 11:
		case 6:
			if(dia >=1 && dia <=30)
				res = true; 
			else
				res= false; 
			break;
		default:
			break;
		}
		return res; 
	}
	
	public static boolean annobisiesto(int anno) {
		if ((anno % 4 == 0) && ((anno % 100 != 0) || (anno % 400 == 0)))
			return true;
		else
			return false; 
	}
	
	
	

}


