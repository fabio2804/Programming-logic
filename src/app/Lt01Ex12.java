package app;
import javax.swing.JOptionPane;

public class Lt01Ex12 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular idade atual e futura
            Programador: Fábio Vilela Aragão
            Data: 15/01
        */

        int anoN = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
        int anoA = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        JOptionPane.showMessageDialog(null, "Idade atual: " + (anoA - anoN) + " anos");
        JOptionPane.showMessageDialog(null, "Daqui a 17 anos, você terá " + ((anoA - anoN) + 17) + "anos");
    }
}