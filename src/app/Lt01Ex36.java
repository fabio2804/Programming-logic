package app;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lt01Ex36 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular série 1 + 1/1! + 1/2!...
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */

        int i, N;
        float serie = 1, fat = 1;
        
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para limite de série:"));
        for (i = 1; i <= N; i++){
            fat *= i;
            serie += (1/fat);
        }
        
        DecimalFormat df = new DecimalFormat("##.##");
        JOptionPane.showMessageDialog(null, "O valor da somatória da série é de: " + df.format(serie) );
        
    }
}