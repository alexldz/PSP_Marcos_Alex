package PrimerasClases;

public class Cliente {

	private int Id_Cliente;
	private String nombre;
	private String ciudad;

	Cliente(int Id_Cliente, String nombre, String ciudad) {

		this.Id_Cliente = Id_Cliente;
		this.nombre = nombre;
		this.ciudad = ciudad;

	}

	public int getId_Cliente() {
		return Id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		Id_Cliente = id_Cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

}
