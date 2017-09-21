package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.TipoServico;

/**
 *
 * @author ibrum
 */
public class RepositorioTipoServicos {
    private List<TipoServico> tipoServicos;
    
    public RepositorioTipoServicos(){
        this.tipoServicos = new ArrayList<TipoServico>();
    }
    
    public boolean addTipoServicos(TipoServico tipoServico) {
        return(tipoServicos.add(tipoServico));
    }
    
    public List<TipoServico> getListaTipoServico(){
        return tipoServicos;
    }
}
