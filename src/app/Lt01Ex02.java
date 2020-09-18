package app;
import javax.swing.JOptionPane;

public class Lt01Ex02 {
    public static void main (String[] args){
        /*
            Obejtivo: Reajuste de 15%
            Programador: Fábio Vilela Aragão
            Data: 15/01
        */

        float sal = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de seu salário para realizar o reajuste de 15%: "));
        JOptionPane.showMessageDialog(null, "O valor do salário com o reajuste de 15% é igual a: " + (sal * 1.15));
    }
}