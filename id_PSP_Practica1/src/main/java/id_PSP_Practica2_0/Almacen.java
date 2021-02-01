package id_PSP_Practica2_0;

import java.util.ArrayList;

public class Almacen {

	public ArrayList<Integer> almacen = new ArrayList<Integer>();
	int size;

	public void setAlmacen(ArrayList<Integer> almacenlleno) {
		this.almacen = almacenlleno;
		size = 10;
	}

	// metodos

	public synchronized boolean introducirNumero(int numero) {

		while (almacen.size() == size) {
			
			try {

				wait();

			} catch (InterruptedException e) {

				e.printStackTrace();

			}
			
		}
		
		almacen.add(numero);
		notify();
		return false;
		
	}

	public synchronized boolean quitarNumero() {

		while (almacen.size() == 0) {
			
			try {
				
				wait();
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}

		notify();
		almacen.remove(0);
		return true;


	}

}
