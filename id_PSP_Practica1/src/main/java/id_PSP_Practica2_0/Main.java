package id_PSP_Practica2_0;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Thread> hilos = new ArrayList<Thread>();
		ArrayList<Thread> hilos2 = new ArrayList<Thread>();

		Almacen almacen = new Almacen();

		for (int i = 0; i < 10; i++) {

			hilos.add(new Productor(almacen, i));

		}

		for (Thread h : hilos) {

			h.start();

		}

		for (int x = 0; x < 10; x++) {

			hilos.add(new Consumidor(almacen, x));

		}
		
		for (Thread h2 : hilos2) {
			
			h2.start();
			
		}

	}

}
