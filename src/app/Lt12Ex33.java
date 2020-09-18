package app;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lt12Ex33 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular a série 1 + 1/2 + 1/3... (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 24/01
        */

        float serie = 0;
        int N;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o limite do denominador da série:"));
        
        serie = calcSerie(N);

        DecimalFormat df = new DecimalFormat("##.##");
        JOptionPane.showMessageDialog(null, "O resultado da soma da série é de: " + df.format(serie));
    }

    public static float calcSerie(int n)
    {
        float calc = 0;

        for (float i = 1; i <= n; i++){
            calc += ( 1 / i);
        }

        return calc;
    }
}