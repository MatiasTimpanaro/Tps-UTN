package carritoClase5y7;

import java.time.LocalDateTime;

public class Persona {

	private String nombre;
	private String apellido;
	private LocalDateTime fechaDeNacimiento;
	private int edad;
	
	public Persona(String nombre, String apellido, LocalDateTime fechaDeNacimiento, int edad) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.edad = edad;
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

	public LocalDateTime getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDateTime fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
