package pruebaSemana9;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Biblioteca librosDisponibles = new Biblioteca (new ArrayList<Libro>(), new ArrayList<Libro>());
		System.out.println(librosDisponibles.mostrarLibrosDisponibles());
		}
		
	}
