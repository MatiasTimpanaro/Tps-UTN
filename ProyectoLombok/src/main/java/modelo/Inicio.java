package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		while(true) {
			System.out.println("Ingrese nombre:");
			String nombre = scn.nextLine();
			
			System.out.println("Ingrese apellido:");
			String apellido = scn.nextLine();

			System.out.println("Ingrese fecha de nacimiento:");
			String fechaDeNacimiento = scn.nextLine();
					
		Persona persona = new Persona ();
		
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		persona.setFechaDeNacimiento(fechaDeNacimiento);
		
		personas.add(persona);
		
		System.out.println("¿Desea agregar otra persona? s/n");
		String respuesta = scn.nextLine();
		
		if (respuesta.equals("n")) {
			break;
		}
				
		}
		for (Persona persona : personas) {
			System.out.println("nombre: " + persona.getNombre());
			System.out.println("apellido: " + persona.getApellido());
			System.out.println("fecha de nacimiento: " + persona.getFechaDeNacimiento());
			System.out.println("- - - - - - - - - - - - - - - -");
		}
	}

}
