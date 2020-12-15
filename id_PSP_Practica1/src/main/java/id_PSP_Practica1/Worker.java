package id_PSP_Practica1;

public class Worker extends Thread {

	
public id_PSP_Practica1.Cartera run(Cartera c1) {
		    			
				int randomnum = (int) Math.floor(Math.random()*100+0); // Lo mismo que en la clase cliente peri en vez de sumar le restamos el numero random
				c1.setDinero(c1.getDinero() - randomnum);
				System.out.println("El dinero ha sido retirado");
				
					return c1;
				
				
			}
			
			
			
			
			
		}
		
		
	

