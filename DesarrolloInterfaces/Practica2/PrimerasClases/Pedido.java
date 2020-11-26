package PrimerasClases;

public class Pedido {

	private int ID;
	private String fecha;
	private String estado;

	public Pedido (int ID, String fecha, String estado) {
		
		this.ID = ID;
		this.fecha = fecha;
		this.estado = estado;
		
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Object getName() {
		return estado;
	}

	public void remove(String estado2) {

		
	}

	public String toString() {
	
		return "El usuario con Id:" + this.ID + " a día: " + this.fecha + " y en estado: " + this.estado; 
	}
	
}
