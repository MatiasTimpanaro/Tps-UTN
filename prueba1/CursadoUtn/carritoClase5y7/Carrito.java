package carritoClase5y7;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	
	private List <Producto> productosCarrito;
	private LocalDateTime fechaDeCompraCarrito;
	
	
	public Carrito(List <Producto> productosCarrito, LocalDateTime fechaDeCompraCarrito) {

		this.productosCarrito = new ArrayList<Producto>();
				
		
		this.fechaDeCompraCarrito = fechaDeCompraCarrito;
	}
	
	
	public void agregarProducto (Producto p) {
		this.productosCarrito.add(p);
	}
	
	public void eliminarProducto (Producto p) {
		this.productosCarrito.remove(p);
	}
	
	
	
	public List<Producto> getProductosCarrito() {
		return productosCarrito;
	}

	public void setProductosCarrito(List<Producto> productosCarrito) {
		this.productosCarrito = productosCarrito;
	}

	public LocalDateTime getFechaDeCompraCarrito() {
		return fechaDeCompraCarrito;
	}

	public void setFechaDeCompraCarrito(LocalDateTime fechaDeCompraCarrito) {
		this.fechaDeCompraCarrito = fechaDeCompraCarrito;
	}

	public float CostoFinalCarrito(Descuento desc) throws ExceptionValor0, ExceptionValorNegativo {
		float total = 0;
		for (Producto item : productosCarrito) {
			total += item.PrecioFinalProducto();
		}
		
	if (total <= 0) {
		throw new ExceptionValor0 ();
		
	}
	
	else if (desc.valorFinal(total) < 0) {
		throw new ExceptionValorNegativo();
		}
	else {
		return desc.valorFinal(total);
	}
 }	
}
