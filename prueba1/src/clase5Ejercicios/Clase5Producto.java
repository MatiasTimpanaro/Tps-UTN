package clase5Ejercicios;

public class Clase5Producto {
	
	private String nombre;
	private String codigo;
	private String precio;
	private float precioFinal;
	
	
	public Clase5Producto(String nombre, String codigo, String precio, float precioFinal) {
		
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.precioFinal = precioFinal;
	}


	public String getNombre() {
		return this.nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return this.codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getPrecio() {
		return this.precio;
	}


	public void setPrecio(String precio) {
		this.precio = precio;
	}


	public float getPrecioFinal() {
		return this.precioFinal;
	}


	public void setPrecioFinal(float precioFinal) {
		this.precioFinal = precioFinal;
	}
	
	
	
	

}
