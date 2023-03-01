package proyecto1;

public class Entrenador extends Empleado{
	private boolean personal;
	private String especialidad;
	
	
	public Entrenador(String nombre, String cedula, String telefono, double sueldo, boolean personal,
			String especialidad) {
		super(nombre, cedula, telefono, sueldo);
		this.personal = personal;
		this.especialidad = especialidad;
	}
	
}
