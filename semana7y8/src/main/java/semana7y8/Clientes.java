package semana7y8;

public class Clientes {

	private int idCliente;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	
	
	public Clientes(int idCliente, String nombre, String apellido, String email, String telefono) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "[idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", telefono=" + telefono + "]";
	}
	
	
}
