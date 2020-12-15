package id_PSP_Practica1;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Cartera c1 = new Cartera(); // Creo una nueva cartera

		Cliente cliente = new Cliente(); // Creo nuevo cliente
		Worker worker = new Worker(); // Creo un nuevo worker

		for (int i = 0; 1 < 10; i++) { // Hacemos un for para que cree 10 clientes y 10 workers que ingresen y retiren dinero de la cartera

			cliente = new Cliente(); // Nuevo cliente
			cliente.sleep(1000); //Hacemos que duerma 1 segundo
			cliente.run(c1); // Y lo ejecutamos

			worker = new Worker(); //Lo mismo con la clase worker
			worker.sleep(1000);
			worker.run(c1);
			
			System.out.println("El dinero total de mi cartera es: " + c1.getDinero() + " €"); // mostramos el dinero actual de la cartera

		}
		
		

	}
}