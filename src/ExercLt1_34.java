
import javax.swing.JOptionPane;

public class ExercLt1_34 {

    public static void main(String[] args) {
        int x, i, j;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 10 :"));
        j = 1;
        for (i = 1; i <= 10; i++) {
            System.out.println(x * j);
            j++;
        }
    }
}
