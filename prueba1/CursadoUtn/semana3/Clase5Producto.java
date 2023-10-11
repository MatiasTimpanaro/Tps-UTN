package semana3;

public class Clase5Producto {
	
	private String nombreProducto;
	private String codigoProducto;
	private String precioProducto;
	private float precioFinalProducto;
	
	
	public Clase5Producto(String nombreProducto, String codigoProducto, String precioProducto, float precioFinalProducto) {
		
		this.nombreProducto = nombreProducto;
		this.codigoProducto = codigoProducto;
		this.precioProducto = precioProducto;
		this.precioFinalProducto = precioFinalProducto;
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


	public String getPrecioProducto() {
		return this.precioProducto;
	}


	public void setPrecioProducto(String precioProducto) {
		this.precioProducto = precioProducto;
	}


	public float getPrecioFinalProducto() {
		return this.precioFinalProducto;
	}


	public void setPrecioFinalProducto(float precioFinalProducto) {
		this.precioFinalProducto = precioFinalProducto;
	}
	
	
	
	

}
