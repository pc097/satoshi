
import javax.swing.JOptionPane;



public class ExercLt1_37 {

    public static void main(String[] args) {
        int t1 = 1, t2 = 1, tn = 0, aux = 0;
        tn = Integer.parseInt(JOptionPane.showInputDialog("Digite um número :"));
        for (int i = 0; i <= tn; i++) {
            if (i < 3) {
                aux = 1;

            } else {
                aux = t1 + t2;
                t1 = t2;
                t2 = aux;
            }
        }
        JOptionPane.showMessageDialog(null, "O enésimo termo da sequencia é : " + aux);
    }
}
