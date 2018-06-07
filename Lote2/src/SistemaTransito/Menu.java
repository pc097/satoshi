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
            case 3 :
                Estatistica2015.qtdAcid();
                break;
            case 4 :
                Estatistica2015.nome();
                break;
            case 5 :
                Estatistica2015.media();
                break;
            case 9 :
                System.exit(0);
                break;    
        }
    }
}
