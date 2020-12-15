package Implementaciones;

import java.util.*;

import DAO.DAO;

import PrimerasClases.Pedido;

public class PedidoDAOImpl implements DAO<Pedido> {
	
	List<Pedido> pedido = new ArrayList<Pedido>();
	
	public PedidoDAOImpl() {
		
		Pedido pedido1 = new Pedido(258, "29/05/2008", "Entregado");
		Pedido pedido2 = new Pedido(320, "30/07/2010", "Entregado");
		pedido.add(pedido1);
		pedido.add(pedido2);
			
	}
	
	public List<Pedido> getAllPedidos() {

		return pedido;
	}


	public void updatePedido(Pedido pedido) {
		
	}

	@Override
	public Pedido getAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Pedido t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Pedido t) {
		
		pedido.remove();
		
	}

	public List<Pedido> ListarTodos() {
		
		return pedido;
	}
	
}
