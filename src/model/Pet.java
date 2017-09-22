package model;

import java.util.Objects;

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
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pet outro = (Pet) obj;
        if (!Objects.equals(this.nome, outro.nome)) {
            return false;
        }
        return true;
    }
}
