package view;

import model.Cliente;
import model.Pet;
import model.TipoServico;
import model.Venda;
import repositorio.RepositorioClientes;
import repositorio.RepositorioPets;
import repositorio.RepositorioTipoServicos;
import repositorio.RepositorioVendas;
import util.Console;
import view.menu.VendaMenu;

/**
 *
 * @author ibrum
 */
public class VendaUI {
    private RepositorioVendas listaVendas;
    private RepositorioPets listaPets;
    private RepositorioTipoServicos listaTipoServicos;
    private RepositorioClientes listaClientes;
    
    VendaUI(RepositorioVendas listaVenda, RepositorioPets listaPet, RepositorioTipoServicos listaTipoServico, RepositorioClientes listaCliente){
        this.listaVendas = listaVenda;
        this.listaPets = listaPet;
        this.listaTipoServicos = listaTipoServico;
        this.listaClientes = listaCliente;
    }
    
    void executar() {
        int opcao = 0;
        do {
            System.out.println(VendaMenu.getOpcoes());
            opcao = Console.scanInt("Digite uma opcao: ");
            switch(opcao) {
                case VendaMenu.OP_CADASTRAR:
                    cadastrarVenda();
                    break;
                case VendaMenu.OP_LISTAR:
                    mostrarVendas();
                    break;
                case VendaMenu.OP_VOLTAR:
                    System.out.println("Retornando ao menu anterior");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != VendaMenu.OP_VOLTAR);
    }
    
    public void cadastrarVenda(){
        Cliente cliente;
        Pet pet;
        TipoServico tipoServico;
        do { 
            new ClienteUI(listaClientes).mostrarClientes();
            String rg = Console.scanString("Selecione através do RG o cliente: ");
            cliente = listaClientes.buscarCliente(rg);
            if (cliente == null) {
                System.out.println("RG nao encontrado");
            }
            
            new PetUI(listaPets, listaClientes).mostrarPets();
            String nome = Console.scanString("Digite o nome do pet: ");
            pet = listaPets.buscarPet(nome);
            if (pet == null) {
                System.out.println("Pet nao encontrado");
            }
            
            new TipoServicoUI(listaTipoServicos);
            String nomeTipoServico = Console.scanString("Digite o nome do tipo de servico: ");
            tipoServico = listaTipoServicos.buscarTipoServico(nomeTipoServico);
            if (tipoServico == null) {
                System.out.println("Tipo de servico nao encontrado!");
            }
        } while (cliente == null && pet == null && tipoServico == null);
    }
    
    public void mostrarVendas(){
        if (listaVendas.getListaVendas().size() <=0 ) {
            System.out.println("Nao existe venda cadastrada");
        } else {
            System.out.println(String.format("%-20s", "|NOME CLIENTE")+"\t"
                             + String.format("%-20s", "|DATA")+"\t"
                             + String.format("%-20s", "|VALOR TOTAL"));
            for (Venda venda : listaVendas.getListaVendas()) {
               System.out.println(String.format("%-20s", "|"+venda.getCliente().getNome())+"\t"
                             + String.format("%-20s", "|"+venda.getData())+"\t"
                             + String.format("%-20s", "|"+venda.getTipoServico().getPreco()));
            }
        }
    }
}
