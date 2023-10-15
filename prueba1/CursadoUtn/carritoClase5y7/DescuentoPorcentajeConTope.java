package carritoClase5y7;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje{

	
	private float tope;
	public DescuentoPorcentajeConTope(float tope) {
		super(0);
		this.tope = tope;
		
	}
	public float getTope() {
		return tope;
	}
	public void setTope(float nuevoValor) {
		this.tope = nuevoValor;
	}
	
	@Override
	
	public void setValorDesc(float valor) {
		if (valor > this.tope) {
			System.out.println("El porcentaje de descuento supera el limite permitido. no se aplicó el descuento" + "\n");
		}
		else {
			super.setValorDesc(valor);
		}
		
		
	}

	}
