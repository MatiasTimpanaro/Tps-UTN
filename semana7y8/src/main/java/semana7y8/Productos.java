package semana7y8;

public class Productos {

	private int idProducto;
	private String nombreProducto;
	private double precio;
	private int stock;
	private int idCategoria;
	
	public Productos(int idProducto, String nombreProducto, double precio, int stock, int idCategoria) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.stock = stock;
		this.idCategoria = idCategoria;
	}

	@Override
	public String toString() {
		return "[idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precio=" + precio
				+ ", stock=" + stock + ", idCategoria=" + idCategoria + "]";
	}
	
	
}
