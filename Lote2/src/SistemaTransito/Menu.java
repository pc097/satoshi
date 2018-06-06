package SistemaTransito;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Menu {

    static void menu(int opc) throws IOException {
        switch (opc) {
            case 1:
                Estatistica2015.cadastro();
                break;
            case 2:
                Estatistica2015.tipo();
                break;
            default:
                break;
        }
    }
}
