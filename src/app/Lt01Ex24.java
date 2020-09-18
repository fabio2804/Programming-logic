package app;
import javax.swing.JOptionPane;

public class Lt01Ex24 {
    public static void main (String[] args){
        /*
            Obejtivo: Verificar se valor é divisivel por 2 e 3
            Programador: Fábio Vilela Aragão
            Data: 17/01
        */

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número para a verificação: "));
        
        if (n1 % 2 == 0 & n1 % 3 == 0){
            JOptionPane.showMessageDialog(null, n1+" é divisível por 2 e por 3!");
            }
        else if (n1 % 2 == 0){
            JOptionPane.showMessageDialog(null, n1+" é divisível apenas por 2!");
            }
        else if (n1 % 3 == 0){
            JOptionPane.showMessageDialog(null, n1+" é divisível apenas por 3!");     
            }
        else{
            JOptionPane.showMessageDialog(null, n1+" não é divisível por 2 e nem por 3!");
            }
    }
}