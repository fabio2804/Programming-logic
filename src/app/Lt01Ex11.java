package app;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lt01Ex11 {
    public static void main (String[] args){
        /*
            Obejtivo: Comprimento da circunferência
            Programador: Fábio Vilela Aragão
            Data: 15/01
        */

        float r = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio da circunferência, em metros: "));  
        DecimalFormat df = new DecimalFormat("##.##");
        JOptionPane.showMessageDialog(null, "O valor do comprimento da circunferência é igual a " + df.format(2 * 3.14 * r) + " metros");
    }
}