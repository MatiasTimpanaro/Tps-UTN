package pruebaSemana9;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private List <Libro> listaDeLibrosPrestados;
	
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

	public List<Libro> getListaDeLibrosPrestados() {
		return listaDeLibrosPrestados;
	}

	public void tomarPrestadoUnLibro(Libro l) {
		this.listaDeLibrosPrestados.add(l);
	}

	
	
		
}
