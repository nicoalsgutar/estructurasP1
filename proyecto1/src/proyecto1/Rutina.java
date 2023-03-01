package proyecto1;

public class Rutina {
	private String nombre;
	private Entrenador entrenador;
	private String[] fechas;
	
	public Rutina(String nombre, Entrenador entrenador, String[] fechas) {
		super();
		this.nombre = nombre;
		this.entrenador = entrenador;
		this.fechas = fechas;
	}

	public String[] getFechas() {
		return fechas;
	}

	public void setFechas(String[] fechas) {
		this.fechas = fechas;
	}
	
}
