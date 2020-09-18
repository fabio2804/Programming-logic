package app;
import javax.swing.JOptionPane;

public class Lt01Ex37 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular asequencia de fibonacci
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */

        int n, i, n1 = 1, n2 = 1, fibo;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para limite da série de Fibonacci:"));
        for (i = 1; i <= n; i++){
            if (i <= 2){
                JOptionPane.showMessageDialog(null, "O " + i + " termo é igual a: " + n1);
            }
            else{
                fibo = (n1 + n2);
                n1 = n2;
                n2 = fibo;
                JOptionPane.showMessageDialog(null, "O " + i + " termo é igual a: " + fibo);
            }
        }
    }
}