package app;
import javax.swing.JOptionPane;

public class Lt01Ex14 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular o 3° angulo do triângulo
            Programador: Fábio Vilela Aragão
            Data: 15/01
        */

        int ang1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro ângulo do triângulo: "));
        int ang2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro ângulo do triângulo: "));
        JOptionPane.showMessageDialog(null, "O valor do terceiro ângulo será de: " + (180 - (ang1+ang2)) + "°");
    }
}