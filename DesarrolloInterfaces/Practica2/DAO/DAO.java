package DAO;

import java.util.*;

import PrimerasClases.Cliente;
import PrimerasClases.Pedido;

@SuppressWarnings("unused")

public interface DAO <T> {
	
	public List<T> ListarTodos();
	public T getAll(int id);
	public void update(T t);
	public void delete(T t);
	

}
