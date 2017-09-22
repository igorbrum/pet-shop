/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import repositorio.RepositorioClientes;
import repositorio.RepositorioPets;
import repositorio.RepositorioTipoServicos;
import repositorio.RepositorioVendas;
import util.Console;
import view.menu.MainMenu;

/**
 *
 * @author ibrum
 */
public class MainUI {
    private RepositorioClientes listaCliente;
    private RepositorioPets listaPet;
    private RepositorioTipoServicos listaTipoServicos;
    private RepositorioVendas listaVendas;
    
    public MainUI(){
        listaCliente = new RepositorioClientes();
        listaPet = new RepositorioPets();
        listaTipoServicos = new RepositorioTipoServicos();
        listaVendas = new RepositorioVendas();
    }
    
    public void executar() {
        int opcao = 0;
        do {            
            System.out.println(MainMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção: ");
            System.out.println("-------------------------------------");
            
            switch(opcao) {
                case MainMenu.OP_CLIENTES:
                    new ClienteUI(listaCliente).executar();
                    break;
                case MainMenu.OP_PETS:
                    new PetUI(listaPet, listaCliente).executar();
                    break;
                case MainMenu.OP_SERVICOS:
                    new TipoServicoUI(listaTipoServicos).executar();
                    break;
                case MainMenu.OP_VENDAS:
                    new VendaUI(listaVendas, listaPet, listaTipoServicos, listaCliente).executar();
                    break;
                case MainMenu.OP_SAIR:
                    System.out.println("Bye.");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }
        } while (opcao != MainMenu.OP_SAIR);
    }
    
}
