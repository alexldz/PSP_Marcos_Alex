package PrimerasClases;

import java.util.List;

import DAO.DAO;
import Implementaciones.PedidoDAOImpl;


public class Main {

	public static void main(String[] args) {
		
		DAO<Pedido> DAOpedido = new PedidoDAOImpl();
		List<Pedido> Mispedidos = DAOpedido.ListarTodos();
		
		
		for (Pedido p : Mispedidos) {
			
			System.out.println(p.toString());
			
		}
		
		//Eliminar un pedido
		
		
		

	}

}
