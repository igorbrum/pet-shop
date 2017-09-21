package view;

import model.Cliente;
import repositorio.RepositorioClientes;
import util.Console;
import view.menu.ClienteMenu;

/**
 *
 * @author ibrum
 */
public class ClienteUI {
    private RepositorioClientes listaCliente;
    
    ClienteUI(RepositorioClientes listaCliente) {
        this.listaCliente = listaCliente;
    }

    void executar() {
        int opcao = 0;
        do {
            System.out.println(ClienteMenu.getOpcoes());
            opcao = Console.scanInt("Digite uma opcao: ");
            switch(opcao) {
                case ClienteMenu.OP_CADASTRAR:
                    cadastrarCliente();
                    break;
                case ClienteMenu.OP_LISTAR:
                    mostrarClientes();
                    break;
                case ClienteMenu.OP_VOLTAR:
                    System.out.println("Retornando ao menu anterior");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != ClienteMenu.OP_VOLTAR);
    }

    private void cadastrarCliente() {
        String rg = Console.scanString("Digite o RG: ");
        if (listaCliente.clienteExiste(rg)) {
            System.out.println("RG já cadastrado no sistema.");
        } else {
            String nome = Console.scanString("Digite o nome: ");
            String telefone = Console.scanString("Digite o telefone para contato: ");
            listaCliente.addClientes(new Cliente(rg, nome, telefone));
            System.out.println("Cadastrado Efetuado com sucesso!");
        }
    }
    
    public void mostrarClientes(){
        if (listaCliente.getListaClientes().size() <= 0) {
            System.out.println("Nao existe clientes cadastrados!");
        } else {
            System.out.println(String.format("%-10s", "|RG")+"\t"
                             + String.format("%-20s", "|NOME")+"\t"
                             + String.format("%-20s", "|TELEFONE"));
            for (Cliente cliente : listaCliente.getListaClientes()) {
                System.out.println(String.format("%-10s", "|"+cliente.getRg())+"\t"
                             + String.format("%-20s", "|"+cliente.getNome())+"\t"
                             + String.format("%-20s", "|"+cliente.getTelefone()));
            }
        }
    }
    
}