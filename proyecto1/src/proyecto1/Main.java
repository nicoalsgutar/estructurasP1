package proyecto1;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		Gimnasio g1 = new Gimnasio();
		try {
			Cliente[] usuar = g1.cargarClientes("clientes.txt");
			g1.setClientes(usuar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
