package PrimerasClases;

import java.util.*;

import DAO.PedidoDAO;
import Implementaciones.PedidoDAOImpl;

public class Main {

	public static void main(String[] args) {
		
		PedidoDAO pedidoDAO = new PedidoDAOImpl();
		
		List<Pedido> Mispedidos;
		Mispedidos = pedidoDAO.getAllPedidos();
		
		
		System.out.println(Mispedidos);
		
		

	}

}
