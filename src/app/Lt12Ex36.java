package app;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lt12Ex36 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular série 1 + 1/1! + 1/2!... (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */

        int N = 0;
        float serie = 1, fat = 1;
        
        serie = calcSerie(N, fat);
        
        DecimalFormat df = new DecimalFormat("##.##");
        JOptionPane.showMessageDialog(null, "O valor da somatória da série é de: " + df.format(serie) );
        
    }

    public static float calcSerie(float n, float fat)
    {
        float calc = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para limite de série:"));
        for (int i = 1; i <= n; i++){
            fat *= i;
            calc += (1/fat);
        }

        return calc;
    }
}