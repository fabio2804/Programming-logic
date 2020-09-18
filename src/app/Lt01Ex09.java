package app;
import javax.swing.JOptionPane;

public class Lt01Ex09 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular a soma dos quadrados de dois numeros
            Programador: Fábio Vilela Aragão
            Data: 15/01
        */

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: ")); 
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: ")); 
        JOptionPane.showMessageDialog(null, "A soma dos quadrados dos números é igual a: " + ((n1 * n1) + (n2 * n2)));
    }
}