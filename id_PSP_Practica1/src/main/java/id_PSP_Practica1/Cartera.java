package id_PSP_Practica1;

public class Cartera extends Thread { //clase de cartera

	private float dinero = 0; // dinero con el que partimos desde el principio

	// Getters y Setters.

	public float getDinero() {
		return dinero;
	}

	public void setDinero(float dinero) {
		this.dinero = dinero;
	}

	// Métodos synchronized

	public synchronized void incrementarDinero() {

		dinero = +(float) Math.floor(Math.random() * 10 + 0); //sumamos un numero aleatorio entre 0 y 10

		try {

			sleep(1000);

		} catch (Exception e) {

			e.printStackTrace();

		}
		
		System.out.println("Ha incrementado el dinero");
	}

	public synchronized void decrementaDinero() {

		dinero = -(float) Math.floor(Math.random() * 10 + 0); // restamos un numero aleatorio entre 0 y 10

		try {

			sleep(1000);

		} catch (Exception e) {

			e.printStackTrace();

		}
		
		System.out.println("Ha decrementado el dinero");

	}

}
