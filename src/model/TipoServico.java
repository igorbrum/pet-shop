package model;

import java.util.Objects;

/**
 *
 * @author ibrum
 */
public class TipoServico {
    private int id;
    private String nomeServico, tipoAtendimento;
    private double preco;

    public TipoServico(int id, String nomeServico, String tipoAtendimento, double preco) {
        this.id = id;
        this.nomeServico = nomeServico;
        this.tipoAtendimento = tipoAtendimento;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public double getPreco() {
        return preco;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoServico outro = (TipoServico) obj;
        if (!Objects.equals(this.nomeServico, outro.nomeServico)) {
            return false;
        }
        return true;
    }
    
}
