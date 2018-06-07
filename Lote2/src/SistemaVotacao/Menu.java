package SistemaVotacao;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Menu {

    static void menu() throws IOException {
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção que deseja consultar : "));
        switch (opc) {
            case 1:
                Votacao2016.cadastrar();
        }
    }
}
