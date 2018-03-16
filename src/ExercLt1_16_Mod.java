
import javax.swing.JOptionPane;

public class ExercLt1_16_Mod {
public static String calcSalario(double qth, double vh, double pd, double nd) {
    String msg = "";
    double salarioBruto = qth * vh;
        pd = pd * (salarioBruto * 0.01);
        double salarioLiquido = salarioBruto - pd;
        double salarioReceber = salarioLiquido + (nd * 100);
        msg = "O salário a ser recebido é : " + salarioReceber;
        return msg;
}
    public static void main(String[] args) {
        double QuantHoras, ValorHora, PercDesconto, NoDescendentes;
        QuantHoras = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas :"));
        ValorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor ganho por hora trabalhada :"));
        PercDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto :"));
        NoDescendentes = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de descentes :"));
        JOptionPane.showMessageDialog(null, calcSalario(QuantHoras, ValorHora, PercDesconto, NoDescendentes));
    }
}
