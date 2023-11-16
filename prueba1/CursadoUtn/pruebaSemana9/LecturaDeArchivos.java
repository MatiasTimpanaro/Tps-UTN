package pruebaSemana9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LecturaDeArchivos {

	private List<String> lecturaDeLibros;
	private List <String> lecturaDePersonas;
	
	public LecturaDeArchivos() {
		super();
		this.lecturaDeLibros = new ArrayList <String>();
		this.lecturaDePersonas = new ArrayList <String>();
	}
		
	

	public List<String> getLecturaDeLibros() {
		
		String cargaDeLibros = "tpLibros.txt";
		
		try {
			for (String linea : Files.readAllLines(Paths.get(cargaDeLibros))) {
				this.lecturaDeLibros.add(linea);
				}
				
					
		} catch (IOException e) {
			System.out.println("TODO LO QUE PUDO HABER FALLADO, FALLó");
		}
		return lecturaDeLibros;
	}
	
	public List<String> getLecturaDePersonas() {
		
		String cargaDePersonas = "tpPersonas.txt";
		try {
			for (String linea : Files.readAllLines(Paths.get(cargaDePersonas))) {
				this.lecturaDeLibros.add(linea);
			}
			
		} catch (IOException e) {
			System.out.println("TODO LO QUE PUDO HABER FALLADO, FALLó");
		}
		return lecturaDePersonas;
	}
	
	
}
