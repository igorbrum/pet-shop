package view.menu;

/**
 *
 * @author ibrum
 */
public class VendaMenu {
    public static final int OP_VOLTAR = 0;
    public static final int OP_CADASTRAR = 1;
    public static final int OP_LISTAR = 2;
    
    public static String getOpcoes(){
        return ("\n===== MENU DE VENDAS =====\n"
                + "1- Cadastrar Vendas\n"
                + "2- Listar Vendas\n"
                + "0- Voltar"
                + "\n==============================");
    }
}
