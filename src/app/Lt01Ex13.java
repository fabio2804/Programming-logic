package app;
import javax.swing.JOptionPane;

public class Lt01Ex13 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular a udração do alimento em dias
            Programador: Fábio Vilela Aragão
            Data: 
        */

        double kg = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimento fornecido em Kg: "));
        int dias = (int) ((kg * 1000) / 50);
        JOptionPane.showMessageDialog(null, kg + "Kg renderá(rão) " + dias + " dias de alimento! ");
    }
}