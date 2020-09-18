package app;
import javax.swing.JOptionPane;

public class Lt01Ex34 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular tabuada
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */

        int i = 0, N;
        
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para realizar o cálculo de tabuada:"));
        while (i <= 10) {
            JOptionPane.showMessageDialog(null, N + " X " + i + " = " + (N * i));
            i += 1;
        }
    }
}