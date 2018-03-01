
import javax.swing.JOptionPane;

public class ExercLt1_36 {

    public static void main(String[] args) {
        double n, i,aux = 1,soma = 0,f=0 ;
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número :"));
        
       
            for (int a =1; a <= n; a ++) {
            
            f =+ 1/fatorial((int) n) ;  
            
            }
        System.out.println(f + "");
    }
    
    public static int fatorial(int n){
    int f = 1;
    for (int i = n ; i < n ; i ++){
    f =+  f * n;
        
    }    
        return f;
        
    }
}
