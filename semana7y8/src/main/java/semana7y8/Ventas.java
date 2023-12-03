package semana7y8;

public class Ventas {

	private int idVenta;
	private int idCliente;
	private int idProducto;
	private String fecha;
	private double total;
	
	public Ventas(int idVenta, int idCliente, int idProducto, String fecha, double total) {
		
		this.idVenta = idVenta;
		this.idCliente = idCliente;
		this.idProducto = idProducto;
		this.fecha = fecha;
		this.total = total;
	}

	@Override
	public String toString() {
		return "[idVenta=" + idVenta + ", idCliente=" + idCliente + ", idProducto=" + idProducto + ", fecha="
				+ fecha + ", total=" + total + "]";
	}
	
	
}
