package Implementaciones;

import java.util.*;

import DAO.PedidoDAO;
import PrimerasClases.Pedido;

public class PedidoDAOImpl implements PedidoDAO {
	
	List<Pedido> pedido;
	
	public PedidoDAOImpl() {
		
		pedido = new ArrayList<Pedido>();
		Pedido pedido1 = new Pedido(258, "29/05/2008", "Entregado");
		Pedido pedido2 = new Pedido(320, "30/07/2010", "Entregado");
		pedido.add(pedido1);
		pedido.add(pedido2);
			
	}

	public void deletePedido(int ID) {
		pedido.remove(((Pedido) pedido).getID());
		System.out.println("Pedido: estado " + ((Pedido) pedido).getEstado() + ", borrado de la base de datos");
		
	}
	
	public List<Pedido> getAllPedidos() {

		return pedido;
	}

	@Override
	public Pedido getPedido(int ID) {

		return pedido.get(ID);
	}

	public void updatePedido(Pedido pedido) {
		
	}

	@Override
	public void deletePedido(Pedido pedido) {
		// TODO Auto-generated method stub
		
	}

	
	

}
