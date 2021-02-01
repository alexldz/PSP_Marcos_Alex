package id_PSP_Practica2_0;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class Consumidor extends Thread {

	Almacen almacen;
	private final int idconsumidor;

	public Consumidor(Almacen almacen, int idconsumidor) {
		super();
		this.almacen = almacen;
		this.idconsumidor = idconsumidor;
	}

	public void run() {

		if (almacen.quitarNumero() == true) {
			System.out.println("El consumidor con id: " + idconsumidor + " ha consumido: ");

			System.out.println("El programa ha terminado");

		}
	}
}
