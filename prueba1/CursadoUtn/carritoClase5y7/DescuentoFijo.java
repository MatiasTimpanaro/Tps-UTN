package carritoClase5y7;

public class DescuentoFijo extends Descuento {

	public DescuentoFijo(float valor) {
		super(valor);
	}

	@Override
	public float valorFinal(float valorInicial) {
		return valorInicial - super.getValorDesc();
	}

}
