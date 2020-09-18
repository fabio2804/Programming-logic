package app;
import javax.swing.JOptionPane;

public class Lt01Ex32 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular fatorial
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */

        int i, N;
        int fat = 1;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o calculo fatorial:"));
        
        for (i = N; i >= 2; i--){
            fat *= i;
        }
        JOptionPane.showMessageDialog(null, "Fatorial de " + N + " é igual a: " + fat);
    }
}