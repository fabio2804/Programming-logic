package app;
import javax.swing.JOptionPane;

public class Lt01Ex18 {
    public static void main (String[] args){
        /*
            Obejtivo: Diferença entre valores
            Programador: Fábio Vilela Aragão
            Data: 17/01
        */

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número: "));
        if (n1 > n2){
            JOptionPane.showMessageDialog(null, "A diferença do maior valor pelo menor é igual a: " + (n1 - n2));
        } 
        else{
            JOptionPane.showMessageDialog(null, "A diferença do maior valor pelo menor é igual a: " + (n2 - n1));
        }
    }
}


