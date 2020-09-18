package app;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Lt01Ex33 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular a série 1 + 1/2 + 1/3...
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */

        float serie = 0, i, N;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o limite do denominador da série:"));
        
        for (i = 1; i <= N; i++){
            serie += (1/i);
        }
        
        DecimalFormat df = new DecimalFormat("##.##");
        JOptionPane.showMessageDialog(null, "O resultado da soma da série é de: " + df.format(serie));
    }
}