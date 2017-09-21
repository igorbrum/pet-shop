package view.menu;

/**
 *
 * @author ibrum
 */
public class TipoServicoMenu {
    public static final int OP_VOLTAR = 0;
    public static final int OP_CADASTRAR = 1;
    public static final int OP_LISTAR = 2;
    
    public static String getOpcoes(){
        return ("\n===== MENU DE SERVICOS =====\n"
                + "1- Cadastrar Tipo de Servicos\n"
                + "2- Listar Tipo de Servicos\n"
                + "0- Voltar"
                + "\n==============================");
    }
}
