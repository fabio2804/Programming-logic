package app;
import javax.swing.JOptionPane;

public class Lt01Ex06{
    public static void main (String[] args){
        /*
            Obejtivo: Trocar valores
            Programador: Fábio Vilela Aragão
            Data: 15/01
        */
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro para X: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro para Y: "));
        int aux = x;
        x = y;
        y = aux;
        JOptionPane.showMessageDialog(null, "O valor de X é igual a: " + x);
        JOptionPane.showMessageDialog(null, "O valor de y é igual a: " + y);
    }
}