package carritoClase5y7;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class TestCarrito {

@Test
void descuentoPrecios1Test() {
	Producto p1 = new Producto ("jabon", "1234a", 500);
	Producto p2 = new Producto ("Atun", "1235b", 1000);
	Producto p3 = new Producto ("Papas fritas", "1236c", 1500);
	Carrito c1 = new Carrito (p1, p2, p3, LocalDateTime.of(2023,10,06,20,18,00));
	
	Descuento desFijo = new DescuentoFijo(1000);
	assertNotEquals (desFijo.getValorDesc(), c1.CostoFinalCarrito(desFijo));
}

@Test
void descuentoPrecios2Test() {
	Producto p1 = new Producto ("jabon", "1234a", 500);
	Producto p2 = new Producto ("Atun", "1235b", 1000);
	Producto p3 = new Producto ("Papas fritas", "1236c", 1500);
	Carrito c1 = new Carrito (p1, p2, p3, LocalDateTime.of(2023,10,06,20,18,00));
	
	Descuento desFijo = new DescuentoFijo(1000);
	
	assertNotNull (c1.CostoFinalCarrito(desFijo));
}		
	
	@Test
	void descuentoFijoTest() {
		Producto p1 = new Producto ("jabon", "1234a", 500);
		Producto p2 = new Producto ("Atun", "1235b", 1000);
		Producto p3 = new Producto ("Papas fritas", "1236c", 1500);
		Carrito c1 = new Carrito (p1, p2, p3, LocalDateTime.of(2023,10,06,20,18,00));
		
		Descuento desFijo = new DescuentoFijo(1000);
		
		float valorFinal = c1.CostoFinalCarrito(desFijo);
		
		assertEquals (valorFinal,2000);
	}
	
	@Test
	void descuentoPorcentajeTest() {
		Producto p1 = new Producto ("jabon", "1234a", 500);
		Producto p2 = new Producto ("Atun", "1235b", 1000);
		Producto p3 = new Producto ("Papas fritas", "1236c", 1500);
		Carrito c1 = new Carrito (p1, p2, p3, LocalDateTime.of(2023,10,06,20,18,00));
		
		Descuento desPorcentaje = new DescuentoPorcentaje ((float) 0.50);
		
		float valorFinal = c1.CostoFinalCarrito(desPorcentaje);
		
		assertNotEquals (valorFinal,2000);
	}
	
	@Test
	void descuentoPorcentajeConTopeTest() {
		Producto p1 = new Producto ("jabon", "1234a", 500);
		Producto p2 = new Producto ("Atun", "1235b", 1000);
		Producto p3 = new Producto ("Papas fritas", "1236c", 1500);
		Carrito c1 = new Carrito (p1, p2, p3, LocalDateTime.of(2023,10,06,20,18,00));
		
		Descuento desPorcentajeConTope = new DescuentoPorcentajeConTope (0.40f);
		
		desPorcentajeConTope.setValorDesc(0.50f);
		
		float valorFinal = c1.CostoFinalCarrito(desPorcentajeConTope);
		
		assertEquals (valorFinal,3000);
	}
}
