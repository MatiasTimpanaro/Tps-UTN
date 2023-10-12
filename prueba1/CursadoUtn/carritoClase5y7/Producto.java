package carritoClase5y7;

public class Producto {
	
	private String nombreProducto;
	private String codigoProducto;
	private float precioProducto;
	
	
	
	public Producto(String nombreProducto, String codigoProducto, float precioProducto) {
		
		this.nombreProducto = nombreProducto;
		this.codigoProducto = codigoProducto;
		this.precioProducto = precioProducto;
		}


	public String getNombreProducto() {
		return this.nombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	public String getCodigoProducto() {
		return this.codigoProducto;
	}


	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}


	public float getPrecioProducto() {
		return this.precioProducto;
	}


	public void setPrecioProducto(float precioProducto) {
		this.precioProducto = precioProducto;
	}


	public float PrecioFinalProducto() {
		return this.precioProducto;
	}
	
	

}
