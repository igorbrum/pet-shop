package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author ibrum
 */
public class RepositorioClientes {
    private List<Cliente> clientes;

    public RepositorioClientes() {
        this.clientes = new ArrayList<Cliente>();
    }
    
    public boolean addClientes(Cliente cliente) {
        return (clientes.add(cliente));
    }
    
    public List<Cliente> getListaClientes() {
        return clientes;
    }
    
    public boolean clienteExiste(String rg) {
        for (Cliente cliente : clientes) {
            if (cliente.getRg().equals(rg)) {
                return true;
            }
        }
        return false;
    }
    
    public Cliente buscarCliente(String rg) {
        for (Cliente cliente : clientes) {
            if (cliente.getRg().equals(rg)) {
                return cliente;
            }
        }
        return null;
    }
    
}
