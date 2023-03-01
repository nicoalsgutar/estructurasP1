package proyecto1;


public class Reserva {
	private Rutina clases;
	private Cliente cliente;
	private String fechaReserva;
	
	public Reserva(Rutina clases, Cliente cliente, String fechaReserva) {
		super();
		this.clases = clases;
		this.cliente = cliente;
		this.fechaReserva = fechaReserva;
	}
	
}
