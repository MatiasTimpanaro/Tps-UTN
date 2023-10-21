package carritoClase5y7;

public class ExceptionValorNegativo extends Throwable {

	public ExceptionValorNegativo () {
		super ("El total es menor a 0, revise el descuento");
	}
}
