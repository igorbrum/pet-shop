package view.menu;

/**
 *
 * @author ibrum
 */
public class ClienteMenu {
    public static final int OP_VOLTAR = 0;
    public static final int OP_CADASTRAR = 1;
    public static final int OP_LISTAR = 2;

    public static String getOpcoes() {
        return ("\n===== MENU DE CLIENTES =====\n"
                + "1- Cadastrar Cliente\n"
                + "2- Listar Clientes\n"
                + "0- Voltar"
                + "\n==============================");
    }
}
