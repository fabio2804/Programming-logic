package app;
import javax.swing.JOptionPane;

public class Lt01Ex10 {
    public static void main (String[] args){
        /*
            Obejtivo: Diferença de dois valores reais
            Programador: Fábio Vilela Aragão
            Data: 15/01
        */

        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número real: ")); 
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite outro número real: ")); 
        JOptionPane.showMessageDialog(null, "A diferença do primeiro pelo segundo é igual a: " + (n1 - n2));
    }
}