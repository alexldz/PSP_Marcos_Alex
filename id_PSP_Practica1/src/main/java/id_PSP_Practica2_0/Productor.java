package id_PSP_Practica2_0;

public class Productor extends Thread {

	Almacen almacen;
	private final int idproductor;


	public Productor(Almacen almacen, int idproductor) {
		super();
		this.almacen = almacen;
		this.idproductor = idproductor;
	}

	public void run() {

			int numero = (int) Math.floor(Math.random() * (0 - 10 + 1) + 100);

			almacen.introducirNumero(numero);
			System.out.println("El productor con id: " + idproductor + " produce: " + numero);

		

	}

}
