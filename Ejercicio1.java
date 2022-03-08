package Examen2ºEv;

/**
 * Pre: -- 
 * Post:Desarrolla la clase Jugador, formada por un nombre, dorsal,
 * potencia de disparo, calidad en la portería, y vidas (se inicializa siempre
 * con valor 2). Además, implementa los métodos habilidadDisparo() y
 * habilidadPorteria(). Programa los métodos como creas conveniente, usando los
 * atributos potencia de disparo y calidad en la portería (ambos deben devolver
 * un número entero). Ten en cuenta que, para saber si el jugador que ha
 * disparado ha metido gol, deberás usar los métodos habilidadDisparo() del
 * lanzador y el método habilidadPorteria() del portero. Una vez hayas
 * completado el paso anterior, programa la clase Main que permita jugar al
 * juego.
 *
 */
public class Ejercicio1 {
	// Creamos un metodo llamado habilidadDisparo, donde lo haremos aleatorio.
	public static int habilidadDisparo() {
		return (int) (Math.random() * (99 - 50) + 50);
	}

	// Creamos un metodo llamado habilidadPorteria, donde lo haremos aleatorio.
	public static int habilidadPorteria() {
		return (int) (Math.random() * (99 - 50) + 50);
	}

	/**
	 * Pre:-- 
	 * Post:En este metodo creamos un generador aleatorio de jugadores, que
	 * 		en este caso son 10 y los almacenaremos en una tabla.
	 */
	public static Jugador[] generadorJugadores() {
		Jugador[] jugadores = new Jugador[10];
		String[] nombres = { "Leo", "Cristiano", "Luis", "Javier", "Carlos", "Nacho", "Jose", "Andres", "Borja",
				"Alvaro", "Gerard", "Eric", "Nano", "Memphis", "Juanjo", "Cristian", "Kylian", "Neymar", "Miguel" };
		String[] apellidos = { "Messi", "Ronaldo", "Suarez", "Valles", "Marco", "Peribañez", "Vaquero", "Gomez", "Saiz",
				"Gimenez", "Pique", "Garcia", "Mesa", "Depay", "Narvaez", "Alvarez", "Mbappe", "Junior", "Puche" };
		
		return jugadores;
	}

	public static void main(String[] args) {
		System.out.println(generadorJugadores());
		System.out.println(habilidadDisparo());
		System.out.print(habilidadPorteria());
	}
}
