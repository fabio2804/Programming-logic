package app;
import javax.swing.JOptionPane;

public class Lt01Ex03{
    public static void main (String[] args){
        /*
            Obejtivo: Calcular a área do triângulo
            Programador: Fábio Vilela Aragão
            Data: 15/01
        */
        
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triângulo, em metros: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triângulo, em metros: "));
        JOptionPane.showMessageDialog(null, "O valor da área do triângulo é igual a " + (base * altura) + " metros quadrados");
    }
}