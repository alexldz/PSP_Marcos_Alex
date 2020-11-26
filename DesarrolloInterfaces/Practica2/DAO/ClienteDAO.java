package DAO;

import java.util.*;

import PrimerasClases.Cliente;

public interface ClienteDAO {
	
	public List<Cliente> getAllClientes();
	
	public Cliente getCliente(int Id_Cliente);
	public void updateCliente(Cliente cliente);
	public void deleteCliente(Cliente cliente);

}
