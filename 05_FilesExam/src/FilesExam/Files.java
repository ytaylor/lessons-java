package FilesExam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Files {
	
	/* Crear un fivhero con datos de los productos eleboaraos*/
	public static void crearProductos() {
		
		
		
	}
	
	/*Crear fichero recetas*/
	public static void crearRecetas() {
		
	}
	
	/*Visulizar todos los productos y sus recetas*/
	public static void visualizar()
	{
		File archivoProductos = new File("productos.txt");
		File archivoRecetas = new File("recetas.txt");
		FileReader frProd = null;
		BufferedReader brProd = null;
		FileReader frRec = null;
		BufferedReader brRec = null;
		try {
			frProd = new FileReader(archivoProductos);
			brProd = new BufferedReader(frProd);
			frRec = new FileReader(archivoRecetas);
			brRec = new BufferedReader(frRec);

			// Lectura del fichero
			String linea, rec;
			while ((linea = brProd.readLine()) != null)
			{
				String producto[] = linea.split(","); 
				while ((rec = brRec.readLine()) != null)
				{
					String receta[]= rec.split(","); 
					if(producto[0].equals(receta[0]))//Muestro solo cuando los cod de los productos coinciden
					{
						System.out.println(linea);
					}
				}
			}		
			frProd.close();
			frRec.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/*eliminar un producto con sus recetas
	 * Parametro: codigo del producto que quiero eliminar
	 * */
	public static void eliminar(String codProducto)
	{
		/*
		 * De un fichero no se puede eliminar
		 * la estrategia es copiar todo el archivo, 
		 * menos lo que no nos interesa
		 * 
		 * */
		File archivoProductos = new File("productos.txt");
		File archivoRecetas = new File("recetas.txt");		
		FileReader frProd = null;
		BufferedReader brProd = null;
		FileReader frRec = null;
		BufferedReader brRec = null;
		
		FileWriter ficheroProductos = null;
		PrintWriter pwProd = null;
		
		FileWriter fichRec = null;
		PrintWriter pwRec = null;
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sbRec = new StringBuilder();

		
		try {
			frProd = new FileReader(archivoProductos);
			brProd = new BufferedReader(frProd);
			frRec = new FileReader(archivoRecetas);
			brRec = new BufferedReader(frRec);
			
			ficheroProductos = new FileWriter("productos.txt");
			pwProd = new PrintWriter(ficheroProductos);
			
			fichRec = new FileWriter("recetas.txt");
			pwRec = new PrintWriter(fichRec);

			// Lectura del fichero
			String linea, rec;
			while ((linea = brProd.readLine()) != null)
			{
				String producto[] = linea.split(","); 
		
					if(producto[0].equals(codProducto)) //Muestro solo cuando los cod de los productos coinciden
						continue;
						  
					sb.append(linea + "\n" ); //If you want to split with new lines you can use sb.append(s + "\n");
			}
			
			while ((rec = brRec.readLine()) != null)
			{
				String receta[] = rec.split(","); 
	
					if(receta[0].equals(codProducto)) //Muestro solo cuando los cod de los productos coinciden
						continue;
					  
					sbRec.append(rec + "\n" );
			}
			
			//Escribir en el fichero
			pwProd.print(sb);
			pwRec.print(sbRec);
			
			//Cerrar el fichero
			frProd.close();
			frRec.close();

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*A modo de ejemplo vamos a hacer una copia de los archivos*/
	public static void copiarArchivos()
	{
		
	}
	
	/*A modo de ejemplo verificar si existe uno de los archivos*/
	public static void verificarExisteArchivo()
	{
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
