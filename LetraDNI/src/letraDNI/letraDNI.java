import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String dni = JOptionPane.showInputDialog("Introduzza su DNI"); 
				if(dni.length()==8){
					int dniInteger= Integer.parseInt(dni); 
					int numero = dniInteger%23; 
			        String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
			        String letra = letras[numero];
			        String NIF = dni + letra;	
			        System.out.println("El NIF es: "+ NIF);
				}else
				{
					System.out.print("La cantidad de numeros es incorrecta");
				}

	}

}

