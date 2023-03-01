package proyecto1;

public class Membresia extends Producto{
	private String tipo;
	private int clasesDispo;
	
	public Membresia(String id, Double precio, String tipo) {
		super(id, precio);
		this.tipo = tipo;
		if (tipo == "medio")
			this.clasesDispo = 20;
		if (tipo == "plus")
			this.clasesDispo = 30;
		if (tipo == "basico")
			this.clasesDispo = 10;
	}

	public int getClasesDispo() {
		return clasesDispo;
	}
	
}
