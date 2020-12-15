package id_PSP_Practica1;

public class Thread_PSP extends Thread {

	   public void run() {
		   
	        int randomnum = (int) Math.floor(Math.random()*5+1); // ingresamos la variable randomnum para que cree numeros aleatorios 

	        System.out.println("Hola soy el hilo " + getName() + " y me pongo a dormir la siesta " + randomnum + " segundos"); //muestro los hilos aleatorios y los pongo a dormir

	        try {
	        	
	            sleep(randomnum*1000); // utilido el sleep y lo multiplico por 1000 para que se conviertan en segundos
	            
	        } catch (InterruptedException e) {
	            
	            e.printStackTrace();
	        }


	        System.out.println("Soy el hilo " + getName() + " y he terminado la siesta"); //muestro por consola el nombre del hilo

	    }
	
	
}
