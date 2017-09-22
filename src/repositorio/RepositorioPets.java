package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Pet;

/**
 *
 * @author ibrum
 */
public class RepositorioPets {
    private List<Pet> pets;

    public RepositorioPets() {
        this.pets = new ArrayList<Pet>();
    }
    
    public boolean addPets(Pet pet) {
        return(pets.add(pet));
    }
    
    public List<Pet> getListaPets(){
        return pets;
    }

    public Pet buscarPet(String nome) {
        for (Pet pet : pets) {
            if (pet.getNome().equals(nome)) {
                return pet;
            }
        }
        return null;
    }
}
