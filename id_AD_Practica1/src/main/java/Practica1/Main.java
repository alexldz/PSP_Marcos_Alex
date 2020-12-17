package Practica1;

import java.sql.*;
import java.util.Scanner;

public class Main {

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
				modificarCliente();                                                     
				break;

			case 0:
				continuar = false;                                                       
				break;

			}

		}

		System.out.println("Has salido del programa.");
	}

	public static int menu() {

		Scanner teclado = new Scanner(System.in);                                        
		int opcion;

		System.out.println("Elige una opcion: ");
		System.out.println("(1) Añadir cliente.");
		System.out.println("(2) Muestra el cliente.");
		System.out.println("(3) Muestra todos los clientes.");                             
		System.out.println("(4) Buscar el cliente introducido.");
		System.out.println("(5) Modificar el cliente.");
		System.out.println("(0) Salir.");

		opcion = teclado.nextInt();

		return opcion;

	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

