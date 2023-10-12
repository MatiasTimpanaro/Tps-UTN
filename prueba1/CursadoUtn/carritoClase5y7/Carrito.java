package carritoClase5y7;

import java.time.LocalDateTime;

public class Clase5Carrito {
	
	private String producto1Carrito;
	private String producto2Carrito;
	private String producto3Carrito;
	private LocalDateTime fechaDeCompraCarrito;
	private float costoFinalCarrito;
	
	public Clase5Carrito(String producto1Carrito, String producto2Carrito, String producto3Carrito, LocalDateTime fechaDeCompraCarrito,
			float costoFinalCarrito) {
		
		this.producto1Carrito = producto1Carrito;
		this.producto2Carrito = producto2Carrito;
		this.producto3Carrito = producto3Carrito;
		this.fechaDeCompraCarrito = fechaDeCompraCarrito;
		this.costoFinalCarrito = costoFinalCarrito;
			}

	public String getProducto1Carrito() {
		return this.producto1Carrito;
	}

	public void setProducto1Carrito(String producto1Carrito) {
		this.producto1Carrito = producto1Carrito;
	}

	public String getProducto2Carrito() {
		return this.producto2Carrito;
	}

	public void setProducto2Carrito(String producto2Carrito) {
		this.producto2Carrito = producto2Carrito;
	}

	public String getProducto3Carrito() {
		return this.producto3Carrito;
	}

	public void setProducto3Carrito(String producto3Carrito) {
		this.producto3Carrito = producto3Carrito;
	}

	public LocalDateTime getFechaDeCompraCarrito() {
		return this.fechaDeCompraCarrito;
	}

	public void setFechaDeCompraCarrito(LocalDateTime fechaDeCompraCarrito) {
		this.fechaDeCompraCarrito = fechaDeCompraCarrito;
	}

	public float getCostoFinalCarrito() {
		return this.costoFinalCarrito;
	}

	public void setCostoFinalCarrito(float costoFinalCarrito) {
		this.costoFinalCarrito = costoFinalCarrito;
	}
	
	
	
	
}
