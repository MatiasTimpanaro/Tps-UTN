package pruebaSemana9;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private ArrayList <Libro> listaDeLibrosPrestados;
	
	public Persona(String nombre, String apellido, int edad, ArrayList<Libro> listaDeLibrosPrestados) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.listaDeLibrosPrestados = listaDeLibrosPrestados;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Libro> getListaDeLibrosPrestados() {
		return listaDeLibrosPrestados;
	}

	public void setListaDeLibrosPrestados(ArrayList<Libro> listaDeLibrosPrestados) {
		this.listaDeLibrosPrestados = listaDeLibrosPrestados;
	}

	
	
		
}
