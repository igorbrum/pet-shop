package view;

import model.Cliente;
import model.Pet;
import repositorio.RepositorioClientes;
import repositorio.RepositorioPets;
import util.Console;
import view.menu.PetMenu;

/**
 *
 * @author ibrum
 */
public class PetUI {
    private RepositorioPets listaPet;
    private RepositorioClientes listaCliente;
    
    PetUI(RepositorioPets listaPet, RepositorioClientes listaCliente) {
        this.listaPet = listaPet;
        this.listaCliente = listaCliente;
    }
    
    void executar(){
        int opcao = 0;
        do {            
            System.out.println(PetMenu.getOpcoes());
            opcao = Console.scanInt("Digite uma opção: ");
            switch(opcao){
                case PetMenu.OP_CADASTRAR:
                    cadastrarPet();
                    break;
                case PetMenu.OP_VOLTAR:
                    System.out.println("Voltando ao menu anterior");
                    break;
                case PetMenu.OP_LISTAR:
                    mostrarPets();
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != PetMenu.OP_VOLTAR);
    }

    private void cadastrarPet() {
        System.out.println("==========");
        Cliente cliente;
        
        do {
            new ClienteUI(listaCliente).mostrarClientes();
            
            String rg = Console.scanString("Selecione, através do RG, o cliente: ");
            cliente = listaCliente.buscarCliente(rg);
            
            if (cliente == null) {
                System.err.println("RG invalido ou nao encontrado.");
            }
            
        } while (cliente == null);
        
        String nome = Console.scanString("Digite o nome: ");
        String tipo = Console.scanString("Digite o tipo de animal: ");
        Pet pet = new Pet(nome, tipo, cliente);
        listaPet.addPets(pet);
    }
    
    public void mostrarPets(){
        if (listaPet.getListaPets().size() <= 0) {
            System.err.println("Nao existe pets cadastrados!");
        } else {
            System.out.println(String.format("%-20s", "|CLIENTE")+"\t"
                             + String.format("%-20s", "|NOME")+"\t"
                             + String.format("%-20s", "|TIPO"));
            for (Pet pet : listaPet.getListaPets()) {
                System.out.println(String.format("%-20s", "|"+pet.getDono().getNome())+"\t"
                             + String.format("%-20s", "|"+pet.getNome())+"\t"
                             + String.format("%-20s", "|"+pet.getTipo()));
            }
        }
    }
}
