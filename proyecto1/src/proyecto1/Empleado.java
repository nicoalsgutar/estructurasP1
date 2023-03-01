package proyecto1;

public class Empleado {
	private String nombre;
	private String cedula;
	private String telefono;
	private double sueldo;
	
	
	public String getCedula() {
		return cedula;
	}


	public Empleado(String nombre, String cedula, String telefono, double sueldo) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
		this.sueldo = sueldo;
	}
	
	
}
