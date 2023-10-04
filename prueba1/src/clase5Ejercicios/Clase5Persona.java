package clase5Ejercicios;

import java.time.LocalDateTime;

public class Clase5Persona {

	private String nombre;
	private String apellido;
	private String fechaDeNacimiento;
	private int edad;
	
	public Clase5Persona(String nom, String ape, String fNacim, int ed) {
		this.nombre = nom;
		this.apellido = ape;
		this.fechaDeNacimiento = fNacim;
		this.edad = ed;
		
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
