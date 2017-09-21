package model;

/**
 *
 * @author ibrum
 */
public class Pet {
    private String nome, tipo;
    private Cliente dono;

    public Pet(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Pet(String nome, String tipo, Cliente dono) {
        this.nome = nome;
        this.tipo = tipo;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Cliente getDono() {
        return dono;
    }
}
