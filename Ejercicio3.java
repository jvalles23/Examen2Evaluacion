package Examen2ºEv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Pre:--
 * Post:Dado el fichero .csv “estudiantes.csv”, escribe el código de la función
		leerEstudiantes(String nombreFicheroEstudiantes, ArrayList<>estudiantes).
		Esta función se encarga de leer el fichero pasado como parámetro y de almacenar cada
		uno de los estudiantes en el vector [estudiantes]. Si todo funciona correctamente y no ha
		ocurrido ningún fallo, devuelve true. En caso contrario, devuelve false.
		Para hacer este ejercicio he creado la clase Estudiante.
 *
 */
public class Ejercicio3 {
	private static boolean leerEstudiantes(String nombreFicherosEstudiante) {
		// Creamos el arraylist Estudiante.
		ArrayList<Estudiante> nombre = new ArrayList<Estudiante>();
		//Creamos un fichero nuevo.
		File file = new File(nombreFicherosEstudiante);
		try {
			int contador = 0;
			Scanner f = new Scanner(file);
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				// Spliteamos las lineas por puntos y comas.
				String[] lineaseparada = linea.split(";");
				//Creamos un nuevo estudiante.
				Estudiante estud = new Estudiante(Integer.parseInt(lineaseparada[0]), lineaseparada[1], lineaseparada[2]);
				System.out.print(estud);
				//Añadimos el estudiante al ArrayList.
				nombre.add(estud);
				//Este if si se han metido bien los nombres devolvera true.
					if(nombre.contains(estud)) {
						contador++;
						return true;
					}
					//Si no devolvera true.
					else {
						return false;	
				}
			}
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce la ruta del fichero que quieres leer: ");
		String nombreFichero = entrada.nextLine();
		leerEstudiantes(nombreFichero);
	}
}
