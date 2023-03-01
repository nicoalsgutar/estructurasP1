package proyecto1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class Gimnasio {
	private Cliente[] clientes;
	private Producto[] productos;
	private Empleado[] empleados;
	private Reserva[] reservas;
	private Venta[] ventas;
	private Rutina[] rutinas;
	
	public Gimnasio() {
		super();
		this.clientes = new Cliente[0];
		this.productos = new Producto[0];
		this.empleados = new Empleado[0];
		this.reservas = new Reserva[0];
		this.ventas = new Venta[0];
	}
	//este metodo lo hice para hacer pruebas. Deberiamos  usar ficherosObjetos
	public Cliente[] cargarClientes(String fichero) throws IOException {
		File f = new File(fichero);
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String linea;
		Cliente[] listac = new Cliente[0];
		while((linea=b.readLine())!= null) {
			String nombre =linea;
			String cedula = b.readLine();
			String telefono = b.readLine();
			String direccion = b.readLine();
			Cliente c = new Cliente(nombre, cedula, telefono, direccion);
			listac = Arrays.copyOf(listac, listac.length +1);
			listac[listac.length-1]=c;
		}
		b.close();
		fr.close();
		
		return listac;
	}
	
// esto lo habia hecho para generar el fichero automatico. No se necesita	
	
//	public void writeClientes(String fichero) throws IOException{
//		File f = new File(fichero);
//		FileWriter fr = new FileWriter(f);
//		BufferedWriter b = new BufferedWriter(fr);
//		for(Cliente u:clientes) {
//			b.write(u.getNombre());b.newLine();
//			b.write(u.getCedula());b.newLine();
//			b.write(u.getTelefono());b.newLine();
//			b.write(u.getDireccion());b.newLine();
//			//b.write(Integer.toString.(getEdad()));b.newLine();
//		}
//		b.close();
//		fr.close();
//	}
	
//	public Cliente[] getClientes() {
//	return clientes;
//}
//
//public void setClientes(Cliente[] clientes) {
//	this.clientes = clientes;
//}
	public void añadirEntrenador(String nombre, String cedula, String telefono, double sueldo, boolean personal, String especialidad) {
		empleados = Arrays.copyOf(empleados, empleados.length +1);
		empleados[empleados.length -1] = new Entrenador(nombre, cedula, telefono, sueldo, personal, especialidad);
	}
	
	public void añadirCliente(String nombre, String cedula, String telefono, String direccion) {
		clientes= Arrays.copyOf(clientes, clientes.length +1);
		clientes[clientes.length -1] = new Cliente(nombre, cedula, telefono, direccion);
	}
	
	public Entrenador buscarEntrenador(String ccEntrenador) throws ENoEncontrado{
		if (empleados.length == 0) {
			throw new ENoEncontrado("no hay Empleados inscritos");
		}
		int i = -1;
		while (++i < empleados.length && empleados[i].getCedula().compareTo(ccEntrenador) != 0);
		if(i == empleados.length)
			throw new ENoEncontrado("no se encontro el entrenador");
		if(!(empleados[i] instanceof Empleado))
			throw new ENoEncontrado("el empleado buscado no es entrenador");
		return (Entrenador)empleados[i];
	}
	
	public Cliente buscarCliente(String ccCliente) throws ENoEncontrado{
		if (clientes.length == 0) {
			throw new ENoEncontrado("no hay Clientes inscritos");
		}
		int i = -1;
		while (++i < clientes.length && clientes[i].getCedula().compareTo(ccCliente) != 0);
		if(i == empleados.length)
			throw new ENoEncontrado("no se encontro el entrenador");
		return clientes[i];
	}
	
	public void añadirRutina(String nombre, String ccEntrenador, String[] fechas) throws ENoEncontrado {
		Entrenador e = buscarEntrenador(ccEntrenador);
		rutinas = Arrays.copyOf(rutinas, rutinas.length +1);
		rutinas[rutinas.length -1] = new Rutina(nombre, e, fechas);
	}
	
	public void addReserva(Rutina r, String ccCliente, String fecha) throws ENoEncontrado {
		String[] fechas = r.getFechas();
		int i = -1;
		while (++i < fechas.length && fechas[i].compareTo(fecha) != 0);
		if(i == fechas.length)
			throw new ENoEncontrado("la clase no se encuentra disponible en esa fecha");
		Cliente c = buscarCliente(ccCliente);
		//que pasa si no tiene membresia??
		if(c.getMemb().getClasesDispo()== 0)
			throw new ENoEncontrado("el usuario no tiene mas clases disponibles");	
		reservas = Arrays.copyOf(reservas, reservas.length +1);
		reservas[reservas.length -1] = new Reserva(r, c, fecha);
		
	}

}
