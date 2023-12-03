package semana7y8;

public class Categoria {
	
	private int idCategoria;
	private String nombreCategoria;

	public Categoria(int idCategoria, String nombreCategoria) {
		
		this.idCategoria = idCategoria;
		this.nombreCategoria = nombreCategoria;
	}

	@Override
	public String toString() {
		return "[idCategoria=" + idCategoria + ", nombreCategoria=" + nombreCategoria + "]";
	}

	
}
