package proyecto1;

public class Cliente {
	private String nombre;
	private String cedula;
	private String telefono;
	private String direccion;
	private Membresia memb;
	
	
	public Membresia getMemb() {
		return memb;
	}


	public void setMemb(Membresia memb) {
		this.memb = memb;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Cliente(String nombre, String cedula, String telefono, String direccion) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
		
	}
	
	
}
