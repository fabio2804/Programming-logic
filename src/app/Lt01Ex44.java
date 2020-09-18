package app;
import javax.swing.JOptionPane;

public class Lt01Ex44 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular a pontecia do numero
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */

        int base, exp;
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base para realizar o calculo da potência:"));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente para realizar calculo da potência:"));
        JOptionPane.showMessageDialog(null, "O valor da potência referente aos valores digitados é de: " + Math.pow(base,exp));
    }
}