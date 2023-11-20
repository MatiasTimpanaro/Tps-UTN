package conexionSQL;

public class Persona {

	private String id;
	private String nombre;
	private String apellido;
	private int dni;
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre +  ", apellido=" + apellido + " dni=" + dni + "]";
	}

	public Persona(String id, String nombre, String apellido, int dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
}
