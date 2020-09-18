package app;
import javax.swing.JOptionPane;

public class Lt01Ex05 {
    public static void main (String[] args){
        /*
            Obejtivo: Raízes da equação de 2° grau
            Programador: Fábio Vilela Aragão
            Data: 15/01
        */

        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite  o valor de A da equação de segundo grau: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite  o valor de B da equação de segundo grau: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite  o valor de C da equação de segundo grau: "));
        double delta = ((b * b) - (4 * a * c));
        double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
        double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
        JOptionPane.showMessageDialog(null, "O valor do delta da equação é igual a " + delta);
        JOptionPane.showMessageDialog(null, "O valor do X1 na equação é igual a " + x1);
        JOptionPane.showMessageDialog(null, "O valor do X2 na equação é igual a " + x2);
    }
}