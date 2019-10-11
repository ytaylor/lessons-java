package read_write_files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Stack;


public class read_files {

	/*
	 * Podemos abrir un fichero de texto para leer usando la clase FileReader. Esta
	 * clase tiene métodos que nos permiten leer caracteres. Sin embargo, suele ser
	 * habitual querer las líneas completas, bien porque nos interesa la línea
	 * completa, bien para poder analizarla luego y extraer campos de ella.
	 * FileReader no contiene métodos que nos permitan leer líneas completas, pero
	 * sí BufferedReader. Afortunadamente, podemos construir un BufferedReader a
	 * partir del FileReader de la siguiente forma
	 */

	public static void ReadFilesText() {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		/*
		 * La apertura del fichero y su posterior lectura pueden lanzar excepciones que
		 * debemos capturar. Por ello, la apertura del fichero y la lectura debe meterse
		 * en un bloque try-catch. Además, el fichero hay que cerrarlo cuando terminemos
		 * con él, tanto si todo ha ido bien como si ha habido algún error en la lectura
		 * después de haberlo abierto. Por ello, se suele poner al try-catch un bloque
		 * finally y dentro de él, el close() del fichero.
		 */

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File("personas");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void WriteFilesText() {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("personas");
			// FileWriter fichero = new FileWriter("c:/prueba.txt",true); Añadir al final de
			// un fichero
			pw = new PrintWriter(fichero);

			for (int i = 0; i < 10; i++)
				pw.println("Linea " + i);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	// Para ficheros binarios se hace exactamente igual, pero en vez de usar los
	// "Reader" y los "Writer",
	// se usan los "InputStream" y los "OutputStream". En lugar de los readLine() y
	// println(),
	// hay que usar los métodos read() y write() de array de bytes.

	public static void CopyBinaryFiles() {
		try {

			// Se abre el fichero original para lectura
			FileInputStream fileInput = new FileInputStream("personas");
			BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);

			// Se abre el fichero donde se hará la copia
			FileOutputStream fileOutput = new FileOutputStream("personas1");
			BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);

			// Bucle para leer de un fichero y escribir en el otro.
			byte[] array = new byte[1000];
			int leidos = bufferedInput.read(array);
			while (leidos > 0) {
				bufferedOutput.write(array, 0, leidos);
				leidos = bufferedInput.read(array);
			}
			// Cierre de los ficheros
			bufferedInput.close();
			bufferedOutput.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ReadFilesText();
		// WriteFilesText();
		//CopyBinaryFiles();
		Stack stack = new Stack();
		stack.push(new personas("Alberto", "Galante", "Melero", 31, 658509978));
		stack.push(new personas("Alberto", "Galante", "Melero", 31, 658509978));
		stack.push(new personas("Alberto", "Galante", "Melero", 31, 658509978));
		personas topElement1 = (personas) stack.peek();
		System.out.print(topElement1.getNombre());
	

	}
	
	public void Arraylist()
	{
	}

	/*
	 * 
	 * Si usamos sólo FileInputStream, FileOuputStream, FileReader o FileWriter,
	 * cada vez que hagamos una lectura o escritura, se hará fisicamente en el disco
	 * duro. Si escribimos o leemos pocos caracteres cada vez, el proceso se hace
	 * costoso y lento, con muchos accesos a disco duro. Los BufferedReader,
	 * BufferedInputStream, BufferedWriter y BufferedOutputStream añaden un buffer
	 * intermedio. Cuando leamos o escribamos, esta clase controlará los accesos a
	 * disco. Si vamos escribiendo, se guardará los datos hasta que tenga basantes
	 * datos como para hacer la escritura eficiente. Si queremos leer, la clase
	 * leerá muchos datos de golpe, aunque sólo nos dé los que hayamos pedido. En
	 * las siguientes lecturas nos dará lo que tiene almacenado, hasta que necesite
	 * leer otra vez. Esta forma de trabajar hace los accesos a disco más eficientes
	 * y el programa correrá más rápido. La diferencia se notará más cuanto mayor
	 * sea el fichero que queremos leer o escribir.
	 * 
	 * 
	 */

}
