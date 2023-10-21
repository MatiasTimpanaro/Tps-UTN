package carritoClase5y7;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class TestCarrito {

@Test
void descuentoPrecios1Test() throws ExceptionValor0, ExceptionValorNegativo {
	Producto p1 = new Producto ("jabon", "1234a", 500);
	Producto p2 = new Producto ("Atun", "1235b", 1000);
	Producto p3 = new Producto ("Papas fritas", "1236c", 1500);
	
	Carrito c1 = new Carrito ( null, LocalDateTime.of(2023,10,06,20,18,00));
		c1.agregarProducto(p1);
		c1.agregarProducto(p2);
		c1.agregarProducto(p3);
	
	Descuento desFijo = new DescuentoFijo(1000);
	assertNotEquals(desFijo.getValorDesc(), c1.CostoFinalCarrito(desFijo));
}

@Test
void descuentoPrecios2Test() throws ExceptionValor0, ExceptionValorNegativo {
	Producto p1 = new Producto ("jabon", "1234a", 500);
	Producto p2 = new Producto ("Atun", "1235b", 1000);
	Producto p3 = new Producto ("Papas fritas", "1236c", 1500);
	
	Carrito c1 = new Carrito ( null, LocalDateTime.of(2023,10,06,20,18,00));
		c1.agregarProducto(p1);
		c1.agregarProducto(p2);
		c1.agregarProducto(p3);
	
		Descuento desFijo = new DescuentoFijo(1000);
	
	assertNotNull (c1.CostoFinalCarrito(desFijo));
}		
	
	@Test
	void descuentoFijoTest() throws ExceptionValor0, ExceptionValorNegativo {
		Producto p1 = new Producto ("jabon", "1234a", 500);
		Producto p2 = new Producto ("Atun", "1235b", 1000);
		Producto p3 = new Producto ("Papas fritas", "1236c", 1500);
		
		Carrito c1 = new Carrito ( null, LocalDateTime.of(2023,10,06,20,18,00));
			c1.agregarProducto(p1);
			c1.agregarProducto(p2);
			c1.agregarProducto(p3);
		
		Descuento desFijo = new DescuentoFijo(1000);
		
		float valorFinal = c1.CostoFinalCarrito(desFijo);
		
		assertEquals (valorFinal,2000);
	}
	
	@Test
	void descuentoPorcentajeTest() throws ExceptionValor0, ExceptionValorNegativo {
		Producto p1 = new Producto ("jabon", "1234a", 500);
		Producto p2 = new Producto ("Atun", "1235b", 1000);
		Producto p3 = new Producto ("Papas fritas", "1236c", 1500);
		
		Carrito c1 = new Carrito ( null, LocalDateTime.of(2023,10,06,20,18,00));
			c1.agregarProducto(p1);
			c1.agregarProducto(p2);
			c1.agregarProducto(p3);
		
		Descuento desPorcentaje = new DescuentoPorcentaje ((float) 0.50);
		
		float valorFinal = c1.CostoFinalCarrito(desPorcentaje);
		
		assertNotEquals (valorFinal,2000);
	}
	
	@Test
	void descuentoPorcentajeConTopeTest() throws ExceptionValor0, ExceptionValorNegativo {
		Producto p1 = new Producto ("jabon", "1234a", 500);
		Producto p2 = new Producto ("Atun", "1235b", 1000);
		Producto p3 = new Producto ("Papas fritas", "1236c", 1500);
		
		Carrito c1 = new Carrito ( null, LocalDateTime.of(2023,10,06,20,18,00));
			c1.agregarProducto(p1);
			c1.agregarProducto(p2);
			c1.agregarProducto(p3);
		
		Descuento desPorcentajeConTope = new DescuentoPorcentajeConTope (0.40f);
		
		desPorcentajeConTope.setValorDesc(0.50f);
		
		float valorFinal = c1.CostoFinalCarrito(desPorcentajeConTope);
		
		assertEquals (valorFinal,3000);
	}
	
	@Test
	void exceptionValor0() {
		Producto p1 = new Producto ("", "", 0);
			
		Carrito c1 = new Carrito ( null, LocalDateTime.of(2023,10,06,20,18,00));
			c1.agregarProducto(p1);
			
		Descuento desPorcentajeConTope = new DescuentoPorcentajeConTope (0.40f);
		
		desPorcentajeConTope.setValorDesc(0.50f);
		
		float valorFinal = 0;
		try {
			valorFinal = c1.CostoFinalCarrito(desPorcentajeConTope);
		} catch (ExceptionValor0 | carritoClase5y7.ExceptionValorNegativo e) {
			e.printStackTrace();
		} 
		assertEquals (valorFinal,0); 
		
	}
	
	@Test
	void ExceptionValorNegativo() {
		Producto p1 = new Producto ("atun", "1sdf", 500);
			
		Carrito c1 = new Carrito ( null, LocalDateTime.of(2023,10,06,20,18,00));
			c1.agregarProducto(p1);
			
		Descuento desFijo = new DescuentoFijo (500);
		
		float valorFinal = 0;
		
			try {
				valorFinal = c1.CostoFinalCarrito(desFijo);
			
				assertEquals (valorFinal,0);
			}catch (carritoClase5y7.ExceptionValorNegativo | ExceptionValor0 e) {
				e.printStackTrace();
			}
				 
		 
	}
}
