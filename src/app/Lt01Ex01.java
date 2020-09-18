package app;
import javax.swing.JOptionPane;

public class Lt01Ex01 {
    public static void main(String[] args){
        /*
            Obejtivo: Calcular a área do quadrado
            Programador: Fábio Vilela Aragão
            Data: 15/01
        */
        
        int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado do quadrado, em metros: "));
        JOptionPane.showMessageDialog(null, "O valor da área do quadrado é igual a " + (lado * lado) + " metros quadrados.");    
    }
}