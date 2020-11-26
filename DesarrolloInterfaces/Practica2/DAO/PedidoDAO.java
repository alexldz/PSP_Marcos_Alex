package DAO;

import java.util.*;

import PrimerasClases.Pedido;

public interface PedidoDAO {
	
	public List<Pedido> getAllPedidos();
	public Pedido getPedido(int ID);
	public void updatePedido(Pedido pedido);
	public void deletePedido(Pedido pedido);
	void deletePedido(int ID);
	
	

}
