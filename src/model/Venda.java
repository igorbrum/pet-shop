package model;

import util.DateUtil;

/**
 *
 * @author ibrum
 */
public class Venda {
    private Cliente cliente;
    private Pet pet;
    private TipoServico tipoServico;
    private DateUtil data;
    private double valor;

    public Venda(Cliente cliente, Pet pet, TipoServico tipoServico, DateUtil data, double valor) {
        this.cliente = cliente;
        this.pet = pet;
        this.tipoServico = tipoServico;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pet getPet() {
        return pet;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public DateUtil getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }
    
    
}
