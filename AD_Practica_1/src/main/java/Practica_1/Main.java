package Practica_1;

import java.sql.*;
import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {

		try {

			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jardineria?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"admin", "4DM1n4DM1n");

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from empleado");

			while (resultSet.next()) {

				String codigoEmpleado = resultSet.getString("codigo_empleado");
				String nombre = resultSet.getString("nombre");
				System.out.println(nombre);

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		boolean continuar = true;

		while (continuar) {

			switch (menu()) {

			case 1:
				añadirCliente();
				break;

			case 2:
				mostrarCliente();
				break;

			case 3:
				mostrarTodosClientes();
				break;

			case 4:
				buscarCliente();
				break;

			case 5:
				editarProducto();
				break;

			case 0:
				continuar = false;
				break;

			}

		}

		System.out.println("Has salido del programa.");
	}

	public static void añadirCliente() {

		Cliente cl = new Cliente();

		System.out.println("Codigo cliente: ");
		cl.setCodigo_cliente(sc.nextInt());

		System.out.println("Nombre cliente: ");
		cl.setNombre_cliente(sc.nextLine());

		System.out.println("Nombre contacto: ");
		cl.setNombre_contacto(sc.nextLine());

		System.out.println("Apellido contacto: ");
		cl.setApellido(sc.nextLine());

		System.out.println("Número de teléfono: ");
		cl.setTelefono(sc.nextInt());

		System.out.println("Número de fax: ");
		cl.setFax(sc.nextInt());

		System.out.println("Driección 1: ");
		cl.setLinea_direccion1(sc.nextLine());

		System.out.println("Dirección 2: ");
		cl.setLinea_direccion2(sc.nextLine());

		System.out.println("Ciudad donde reside: ");
		cl.setCiudad(sc.nextLine());

		System.out.println("Región: ");
		cl.setRegion(sc.nextLine());

		System.out.println("País: ");
		cl.setPais(sc.nextLine());

		System.out.println("Codigo Postal: ");
		cl.setCodigo_postal(sc.nextInt());

		System.out.println("Código empleado.rep.ventas: ");
		cl.setCodigo_empleado_rep_ventas(sc.nextInt());

		System.out.println("Limite de credito: ");
		cl.setLimite_credito(sc.nextInt());

	}

	public static void mostrarCliente() {


		
	}

	public static void mostrarTodosClientes() {

	}

	public static void buscarCliente() {

	}

	public static void editarProducto() {

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static int menu() {

		Scanner sc = new Scanner(System.in);
		int opcion;

		System.out.println("Elige una opcion: ");
		System.out.println("(1) Añadir cliente.");
		System.out.println("(2) Muesta el cliente.");
		System.out.println("(3) Muestra todos los clientes.");
		System.out.println("(4) Buscar cliente.");
		System.out.println("(5) Editar producto.");
		System.out.println("(0) Salir.");

		opcion = sc.nextInt();

		return opcion;

	}

}
