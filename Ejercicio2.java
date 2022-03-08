package Examen2ºEv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
	/**
	 * Pre:--
	 * Post:Dado el fichero “textoExamen.txt”, implementa 
	 * 		un método numeroDeComas()el cual devuelve un
	 * 		entero indicando el número de comas “,” que tiene el texto.
	 */
	private static void numeroDeComas(String nombre, String coma) {
		File file = new File(nombre);
		try {
			/**
			 * Pre:--
			 * Post:Creamos la variable comas que es donde vamos
			 * 		a almacenar todas las comas del texto.
			 */
			int contador = 0;
			int comas = 0;
			Scanner f = new Scanner(file);
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				//Reemplazamos los puntos por espacios.
				linea = linea.replaceAll("\\.", "");
				//Spliteamos las lineas.
				String[] lineadividida = linea.split(" ");
				for(int i = 0; i < lineadividida.length; i++) {
					//En este if si alguna palabra contiene coma se añadira a comas.
					if(lineadividida[i].contains(coma)) {
						comas++;
						contador++;
					}
				}
			}
			System.out.println("Comas" + " ==> " + comas + " ocurrencias");
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce la ruta del fichero que quieres leer: ");
		String nombreFichero = entrada.nextLine();
		String coma = ",";
		numeroDeComas(nombreFichero, coma);
	}
}
