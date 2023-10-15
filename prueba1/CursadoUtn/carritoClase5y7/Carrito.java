package carritoClase5y7;

import java.time.LocalDateTime;

public class Carrito {
	
	private Producto producto1Carrito;
	private Producto producto2Carrito;
	private Producto producto3Carrito;
	private LocalDateTime fechaDeCompraCarrito;
	
	
	public Carrito(Producto producto1Carrito, Producto producto2Carrito, Producto producto3Carrito, LocalDateTime fechaDeCompraCarrito) {
		
		this.producto1Carrito = producto1Carrito;
		this.producto2Carrito = producto2Carrito;
		this.producto3Carrito = producto3Carrito;
		this.fechaDeCompraCarrito = fechaDeCompraCarrito;
		}

	public Producto getProducto1Carrito() {
		return producto1Carrito;
	}

	public void setProducto1Carrito(Producto producto1Carrito) {
		this.producto1Carrito = producto1Carrito;
	}

	public Producto getProducto2Carrito() {
		return producto2Carrito;
	}

	public void setProducto2Carrito(Producto producto2Carrito) {
		this.producto2Carrito = producto2Carrito;
	}

	public Producto getProducto3Carrito() {
		return producto3Carrito;
	}

	public void setProducto3Carrito(Producto producto3Carrito) {
		this.producto3Carrito = producto3Carrito;
	}

	public LocalDateTime getFechaDeCompraCarrito() {
		return fechaDeCompraCarrito;
	}

	public void setFechaDeCompraCarrito(LocalDateTime fechaDeCompraCarrito) {
		this.fechaDeCompraCarrito = fechaDeCompraCarrito;
	}

	public float CostoFinalCarrito(Descuento desc) {
		float total = desc.valorFinal(this.producto1Carrito.PrecioFinalProducto() + this.producto2Carrito.PrecioFinalProducto() + this.producto3Carrito.PrecioFinalProducto());
		return total;
	}

	
}
