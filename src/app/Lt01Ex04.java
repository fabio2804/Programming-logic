package app;
import javax.swing.JOptionPane;

public class Lt01Ex04{
    public static void main (String[] args){
        /*
            Obejtivo: Transformar celsius em fahrenheit
            Programador: Fábio Vilela Aragão
            Data: 15/01
        */

        double celsius = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius a ser convertida para Fahrenheit: "));
        double F = (((9 * celsius) / 5) + 32);
        JOptionPane.showMessageDialog(null, "O valor de " + celsius + "°C convertido em Fahrenheit é igual a: " + F + "° Fahrenheit");
    }
}
