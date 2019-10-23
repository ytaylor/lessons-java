package ejerciciosBase;

public class RandomMath {

	public static void main(String[] args) {
		letrasAleatorios();
	
	}
	/*
	 * Realiza un programa que genere letras de forma aleatoria. 
	 * */
	
	public static void letrasAleatorios(){
		System.out.println((char)(Math.random()*26 - 'a'));
		
        int rand = (int)(Math.random());
        System.out.println(rand);
        
        int max=5, min=2; 
        int range = (max - min) + 1;     
        System.out.println((int)(Math.random() * range) + min);
        
        //Math.floor redondea hacia el entero mas abajo
        //Math.round redondea siguiendo las reglas de matematica
        System.out.println( Math.floor( (Math.random() * range) + min));
        System.out.println( Math.round( (Math.random() * range) + min));
        
        
        
        int array[]= {0, 2, 4, 6, 10, 13 };
        for (int i = 0; i < array.length; i++) {
			
		}
        

	}
}
