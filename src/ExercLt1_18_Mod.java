import javax.swing.JOptionPane;
public class ExercLt1_18_Mod {
    public static void main (String[] args) {
        int x, y, z;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro :"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor inteiro :"));
        if (x > y) {
            z = x - y;
        }
        else {
            z = y - x; 
        }
        System.out.println(z);
    }
}