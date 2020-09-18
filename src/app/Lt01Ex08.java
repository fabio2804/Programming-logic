package app;
import static java.lang.Float.parseFloat;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lt01Ex08 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular o rendimento de um investimento depois de 1 mês
            Programador: Fábio Vilela Aragão
            Data: 15/01
        */

        float dep = parseFloat(JOptionPane.showInputDialog("Digite o valor do depósito para a poupança: ")); 
        DecimalFormat df = new DecimalFormat("####.##");
        JOptionPane.showMessageDialog(null, "O valor após 1 mês de aplicação é igual a: " + df.format(dep * 1.013));
    }
}