package clase5Ejercicios;

import java.time.LocalDateTime;

public class Clase5Carrito {
	
	private String producto1;
	private String producto2;
	private String producto3;
	private LocalDateTime fechaDeCompra;
	private float costoFinal;
	
	public Clase5Carrito(String producto1, String producto2, String producto3, LocalDateTime fechaDeCompra,
			float costoFinal) {
		
		this.producto1 = producto1;
		this.producto2 = producto2;
		this.producto3 = producto3;
		this.fechaDeCompra = fechaDeCompra;
		this.costoFinal = costoFinal;
			}

	public String getProducto1() {
		return this.producto1;
	}

	public void setProducto1(String producto1) {
		this.producto1 = producto1;
	}

	public String getProducto2() {
		return this.producto2;
	}

	public void setProducto2(String producto2) {
		this.producto2 = producto2;
	}

	public String getProducto3() {
		return this.producto3;
	}

	public void setProducto3(String producto3) {
		this.producto3 = producto3;
	}

	public LocalDateTime getFechaDeCompra() {
		return this.fechaDeCompra;
	}

	public void setFechaDeCompra(LocalDateTime fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

	public float getCostoFinal() {
		return this.costoFinal;
	}

	public void setCostoFinal(float costoFinal) {
		this.costoFinal = costoFinal;
	}
	
	
	
	
}
