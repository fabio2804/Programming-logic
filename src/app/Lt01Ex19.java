package app;
import javax.swing.JOptionPane;

public class Lt01Ex19 {
    public static void main (String[] args){
        /*
            Obejtivo: Maior e menor valor real
            Programador: Fábio Vilela Aragão
            Data: 17/01
        */
        
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do segundo número: "));
        
        if (n1 > n2){
            JOptionPane.showMessageDialog(null, "O maior valor é igual a: " + n1);
        } 
        else{
            JOptionPane.showMessageDialog(null, "O maior valor é igual a: " + n2);
        }
    }
}


