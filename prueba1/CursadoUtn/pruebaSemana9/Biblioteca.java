package pruebaSemana9;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
	
	private List <Libro> listaDeLibrosDisponibles;
	private List <Libro> listaDeLibrosPrestados;
	
	
	public Biblioteca(ArrayList<Libro> listaDeLibrosDisponibles, ArrayList<Libro> listaDeLibrosPrestados) {
		super();
		this.listaDeLibrosDisponibles = new ArrayList<Libro>();
		this.listaDeLibrosPrestados = listaDeLibrosPrestados;
	}


	public void agregarLibrosDisponibles(Libro l) {

			this.listaDeLibrosDisponibles.add(l);

	}

	public List<Libro> mostrarLibrosDisponibles (){
		
		LecturaDeArchivos lectura = new LecturaDeArchivos ();
		Biblioteca librosDisponibles = new Biblioteca (null,null);
		int contador = 0;
		
		for (String linea : lectura.getLecturaDeLibros()) {
			String[] datos = linea.split(" ");
		
			if (contador < datos.length) {
				String titulo = datos [0];
				String autor = datos [1];
				int añoDePublicacion = Integer.parseInt(datos[2]);
				String genero = datos [3];
				int numeroDePaginas = Integer.parseInt(datos[4]);
            
                             
				librosDisponibles.agregarLibrosDisponibles(new Libro(titulo, autor, añoDePublicacion, genero, numeroDePaginas));
    	 
            contador++; 
            System.out.println(linea);
		}	
	}
		
		return listaDeLibrosDisponibles;
		
	}
	
	public void setListaDeLibrosPrestados(ArrayList<Libro> listaDeLibrosPrestados) {
		this.listaDeLibrosPrestados = listaDeLibrosPrestados;
	}
	
	

}
