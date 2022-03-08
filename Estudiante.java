package Examen2ºEv;

public class Estudiante {
	private int NIP;
	private String nombre;
	private String apellidos;

	public Estudiante(int NIP, String nombre, String apellidos) {
		this.NIP = NIP;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public int getNIP() {
		return NIP;
	}

	public void setNIP(int nIP) {
		NIP = nIP;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Estudiante [NIP=" + NIP + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

}
