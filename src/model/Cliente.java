package model;

import java.util.Objects;

/**
 *
 * @author ibrum
 */
public class Cliente {
    private String rg, nome, telefone;    

    public Cliente(String rg, String nome, String telefone) {
        this.rg = rg;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null) {return false;}
        if (getClass() != obj.getClass()) {return false;}
        final Cliente outro = (Cliente) obj;
        if (!Objects.equals(this.rg, outro.rg)) {return false;}
        return true;
    }
    
    @Override
    public int hashCode(){
        int hash = 5;
        hash = 59*hash+Objects.hashCode(this.rg);
        return hash;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rg=" + rg + ", nome=" + nome + ", telefone=" + telefone + '}';
    }
}
