package app;
import javax.swing.JOptionPane;

public class Lt12Ex29 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular tipos de investimentos (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 23/01
        */

        int tip = Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo de investimento onde deseja aplicar:\n 1- Poupança\n 2- Renda fixa"));
        switch (tip) {
            case 1:
                double n = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que deseja investir: "));
                calcPouopanca(n);
                JOptionPane.showMessageDialog(null, "O valor corrigido após 30 dias de investimento é de: " + n);
                break;
            case 2:
                n = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que deseja investir: "));
                calcRenda(n);
                JOptionPane.showMessageDialog(null, "O valor corrigido após 30 dias de investimento é de: "+ n );
                break;
            default:
                JOptionPane.showMessageDialog(null, "Você não digitou valores validos para o tipo de investimento");
                break;
        }
    }

    public static void calcPouopanca(double n)
    {
        n = n * 1.03;
    }

    public static void calcRenda(double n)
    {
        n = n * 1.05;
    }

}