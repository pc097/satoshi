
import javax.swing.JOptionPane;

public class ExercLt1_35 {

    public static void main(String[] args) {
        int x, y, c, soma;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor :"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor diferente do primeiro :"));
        if (x > y) {
            JOptionPane.showMessageDialog(null, "O número " + x + " é maior que " + y + ".");
            for (c = 0; y < x; y++) {
                if (y % 2 == 1) {
                    c = c + y;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "O número " + y + " é maior que " + x + ".");
            for (c = 0; x < y; x++) {
                if (x % 2 == 1) {
                    c = c + x;
                }
            }

        }
        JOptionPane.showMessageDialog(null, "A soma dos números ímpares entre os valores digitados é :" + c);
    }
}
