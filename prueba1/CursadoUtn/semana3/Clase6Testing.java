package semana3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Clase6Testing {

	@Test
	void multiplicarTest() {
		assertEquals(Clase6Calculadora.multiplicar (80,3), 240);
	}
	@Test
	void sumarTest() {
		assertEquals(Clase6Calculadora.sumar (150,180)/3, 240);
	}
	@Test
	void restarTest() {
		assertNotEquals(Clase6Calculadora.restar (90,50)*15, 605);
	}
	@Test
	void sumar2Test() {
		assertNotEquals(Clase6Calculadora.restar (70,40)*25, 2700);
	}

}
