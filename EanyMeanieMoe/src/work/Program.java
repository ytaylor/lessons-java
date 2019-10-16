/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Program {
	
    //Declaración de la lista de nombres
    String[] nombres = new String[3];
    
    //Declaración de la lista de edaddes
    int[] edades = new int [3];
    
    // Declaración de la lista de tallas
    float[] tallas = new float [3];
    
    
    Scanner sc = new Scanner(System.in);
    
    public void readData() {  
        System.out.printf("Lectura de datos %n%n");
       
        String formatoNombre = "Nombre de %-6s : ";
        String formatoEdad = "Edad de %-8s : ";
        String formatoTalla = "Talla de %-7s : ";
        //Lectura de nombres
        System.out.printf(formatoNombre,"Eanie");
        nombres[0] = sc.nextLine();
        
        System.out.printf(formatoNombre, "Meanie");
        nombres[1] = sc.nextLine();
        
        System.out.printf(formatoNombre, "Moe");
        nombres[2] = sc.nextLine();
        
        //Lectura de edades
        System.out.printf(formatoEdad,"Eany");
        edades[0] = sc.nextInt();
        
        System.out.printf(formatoEdad, "Meanie");
        edades[1] = sc.nextInt();
        
        System.out.printf(formatoEdad, "Moe");
        edades[2] = sc.nextInt();
        
        //Lectura de tallas
        System.out.printf(formatoTalla,"Eany");
        tallas[0] = sc.nextFloat();    
        System.out.printf(formatoTalla, "Meanie");
        tallas[1] = sc.nextFloat();      
        System.out.printf(formatoTalla, "Moe");
        tallas[2] = sc.nextFloat();
        
    }//End of readData()
    public void showDataAsTable() {
        String formato = "| %-10s | %4d | %6.2f |%n";
        String formato2 = "|            | %4d | %6.2f |%n";
        String separador = "+------------+------+--------+%n";
        System.out.printf("%n%nListado de Resultados%n%n");
        
        System.out.printf(separador);
        for(int n = 0; n < 3; n++) {
            System.out.printf(formato, nombres[n],edades[n],tallas[n]);
        }
        
        int edadMedia = 0;
        float tallaMedia = 0.0f;
        
        for(int n = 0; n < 3; n++) {
            edadMedia +=edades[n]; //edadMedia = edadMedia + edades[n]
            tallaMedia += tallas[n]; // tallaMedia = tallaMedia + tallas[n]
            
        }
        edadMedia /= 3;
        tallaMedia /=3.0f;
        System.out.printf(separador);
        System.out.printf(formato2,edadMedia,tallaMedia);
        System.out.printf(separador);
    }//End of showDataAsTable()
  
}
