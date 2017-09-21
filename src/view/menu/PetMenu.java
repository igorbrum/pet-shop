package view.menu;

/**
 *
 * @author ibrum
 */
public class PetMenu {
    public static final int OP_VOLTAR = 0;
    public static final int OP_CADASTRAR = 1;
    public static final int OP_LISTAR = 2;
    
    public static String getOpcoes(){
        return ("\n===== MENU DE PETS =====\n"
                + "1 - Cadastrar Pet\n"
                + "2 - Mostrar Pets\n"
                + "0 - Voltar"
                + "\n=========================");
    }
}
