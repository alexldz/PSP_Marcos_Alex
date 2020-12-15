package id_PSP_Practica1;

public class Cliente extends Thread {
	
	public id_PSP_Practica1.Cartera run(Cartera c1) {
			 
			do { // metodo del bucle infinito
				
				int randomnum = (int) Math.floor(Math.random()*100+0); // numero aleatorio entre 0 y 100
				c1.setDinero(c1.getDinero() + randomnum); // recogermos el dinero de la cartera y le sumamos el numero random de la sentencia anterio, y con el set lo añadimos
				System.out.println("El dinero ha sido ingresado");
				
					return c1;
								
			} while (c1 != null);
			
			
		}
		
		
	}
	
	


