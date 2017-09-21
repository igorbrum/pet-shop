package view;

import model.TipoServico;
import repositorio.RepositorioTipoServicos;
import util.Console;
import view.menu.TipoServicoMenu;

/**
 *
 * @author ibrum
 */
public class TipoServicoUI {
    private RepositorioTipoServicos listaTipoServico;
    
    TipoServicoUI(RepositorioTipoServicos listTipoServicos){
        this.listaTipoServico = listTipoServicos;
    }
    
    void executar(){
       int opcao = 0;
        do {            
            System.out.println(TipoServicoMenu.getOpcoes());
            opcao = Console.scanInt("Digite uma opção: ");
            switch(opcao){
                case TipoServicoMenu.OP_CADASTRAR:
                    cadastrarTipoServico();
                    break;
                case TipoServicoMenu.OP_VOLTAR:
                    System.out.println("Voltando ao menu anterior");
                    break;
                case TipoServicoMenu.OP_LISTAR:
                    mostrarTipoServicos();
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != TipoServicoMenu.OP_VOLTAR); 
    }

    private void cadastrarTipoServico() {
        System.out.println("====================");
        int id = Console.scanInt("Digite o numero do codigo: ");
        String nome = Console.scanString("Digite o nome do tipo de servico: ");
        String tipoAtendimento = Console.scanString("Digite o tipo de atendimento: ");
        double preco = Console.scanDouble("Digite o preco do tipo de servico: ");
        
        listaTipoServico.addTipoServicos(new TipoServico(id, nome, tipoAtendimento, preco));
    }
    
    public void mostrarTipoServicos(){
        if (listaTipoServico.getListaTipoServico().size() <= 0) {
            System.out.println("Nao existe tipos de servicos cadastrados");
        } else {
            System.out.println(String.format("%-10s", "|ID")+"\t"
                             + String.format("%-20s", "|NOME")+"\t"
                             + String.format("%-20s", "|TIPO")+"\t"
                             + String.format("%-20s", "|PRECO"));
            for (TipoServico tipoServico : listaTipoServico.getListaTipoServico()) {
                System.out.println(String.format("%-10s", "|"+tipoServico.getId())+"\t"
                             + String.format("%-20s", "|"+tipoServico.getNomeServico())+"\t"
                             + String.format("%-20s", "|"+tipoServico.getTipoAtendimento())+"\t"
                             + String.format("%-20s", "|"+tipoServico.getPreco()));
            }
        }
    }
}
