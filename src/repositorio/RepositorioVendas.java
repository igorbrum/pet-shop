package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Venda;

/**
 *
 * @author ibrum
 */
public class RepositorioVendas {
    private List<Venda> vendas;
    
    public RepositorioVendas(){
        this.vendas = new ArrayList<Venda>();
    }
    
    public boolean addVendas(Venda venda) {
        return (vendas.add(venda));
    }
    
    public List<Venda> getListaVendas(){
        return vendas;
    }
}
