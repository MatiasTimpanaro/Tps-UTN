package pruebaSemana9;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Libro {

	private String titulo;
	private String autor;
	private int añoDePublicacion;
	private String genero;
	private int numeroDePaginas;
	
	
	public Libro(String titulo, String autor, int añoDePublicacion, String genero, int numeroDePaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.añoDePublicacion = añoDePublicacion;
		this.genero = genero;
		this.numeroDePaginas = numeroDePaginas;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getAñoDePublicacion() {
		return añoDePublicacion;
	}


	public void setAñoDePublicacion(int añoDePublicacion) {
		this.añoDePublicacion = añoDePublicacion;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}


	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
//	public String[] informacionDeLibro () {
//		
//		Scanner scn = new Scanner (System.in);
//		String [] datosDelLibro = new String [5];
//		LecturaDeArchivos lecturaDeLibros = new LecturaDeArchivos ();
//		ArrayList<String> listaDeLibros = new ArrayList <String>(lecturaDeLibros.getLecturaDeLibros());
//		int numeroDeLibro = 0;
//		
//		System.out.println("SELECCIONE EL NUMERO DEL LIBRO QUE DESEA MAS INFORMACION: ");
//		
//		for (String linea : listaDeLibros) {
//			datosDelLibro = linea.split(" ");
//			numeroDeLibro++;
//			System.out.println(numeroDeLibro + "- " + datosDelLibro[0]);
//			
//			}
//		System.out.println("Elija un numero: ");
//			
//		System.out.println(listaDeLibros.get(Integer.parseInt(scn.next())-1));
//		
//		return datosDelLibro;
//		
//	}
	
	
}
