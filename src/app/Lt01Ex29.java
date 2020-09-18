package app;
import javax.swing.JOptionPane;

public class Lt01Ex29 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular tipos de investimentos
            Programador: Fábio Vilela Aragão
            Data: 17/01
        */

        int tip = Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo de investimento onde deseja aplicar:\n 1- Poupança\n 2- Renda fixa"));
        switch (tip) {
            case 1:
                float n = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que deseja investir: "));
                JOptionPane.showMessageDialog(null, "O valor corrigido após 30 dias de investimento é de: "+(n * 1.03));
                break;
            case 2:
                 n = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que deseja investir: "));
                JOptionPane.showMessageDialog(null, "O valor corrigido após 30 dias de investimento é de: "+(n * 1.05));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Você não digitou valores validos para o tipo de investimento");
                break;
        }
  }
}


