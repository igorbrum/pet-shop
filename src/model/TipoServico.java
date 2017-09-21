package model;

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
    
    
}
