package cuantosDiasFaltan;

import java.util.Scanner;

/* 
 * Pedir una fecha del año como mes(texto) y día, e 
 * indicar cuántos días han pasado desde el 1 de enero y 
 * cuántos días faltan para el 31 de diciembre.
 * */

/*Solución sin tener en cuenta si un año es bisiesto*/
public class CuantosDiasFaltan {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Dime el dia");
		int dia = sc.nextInt(); 
		System.out.print("Dime el mes");
		String mes = sc.next(); 
		int cant_dias=0; 
		
		int enero = 31, marzo = 31, mayo=31, julio= 31, agosto=31, octubre=31;
		//Abril, junio, septiembre y noviembre. 30 dias
		int abril=30, junio=30, septiembre=30, noviembre=30;
		int febrero=28;
		
		switch (mes) {
		////Enero, marzo, mayo, julio, agosto, octubre y diciembre. 31 dias
		case "enero":
			cant_dias = dia;
			break;
		case "febrero": 
			cant_dias = enero+dia; 
			break;
		case "marzo":
			cant_dias = enero+febrero+dia;
			break;
		case "abril":
			cant_dias = enero+febrero+marzo+dia; 
			break; 
		case "mayo": 
			cant_dias= enero+febrero+marzo+abril+dia;
			break;
		case "junio":
			cant_dias= enero+febrero+marzo+abril+mayo+dia;
			break;
		case "julio":
			cant_dias= enero+febrero+marzo+abril+mayo+junio+dia;
			break;
		case "agosto":
			cant_dias= enero+febrero+marzo+abril+mayo+junio+julio+dia;
			break;
		case "septiembre":
			cant_dias= enero+febrero+marzo+abril+mayo+junio+julio+agosto+dia;
			break;
		case "octubre":
			cant_dias= enero+febrero+marzo+abril+mayo+junio+julio+agosto+septiembre+dia;
			break;
		case "noviembre":
			cant_dias= enero+febrero+marzo+abril+mayo+junio+julio+agosto+septiembre+octubre+dia;
			break;
		case "diciembre":
			cant_dias= enero+febrero+marzo+abril+mayo+junio+julio+agosto+septiembre+noviembre+dia;
			break;				
		default:
			break;
		}
		
		System.out.println("La cantidad de dias que han pasado desde el 1 de enero " + cant_dias);
		System.out.println("La cantidad de dias que faltan para 31 dias de diciembre" + (365-cant_dias));
	}
}
