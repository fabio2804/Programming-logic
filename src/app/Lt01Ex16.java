package app;
import javax.swing.JOptionPane;

public class Lt01Ex16 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular o salário de acordo com alguns parâmetros
            Programador: Fábio Vilela Aragão
            Data: 17/01
        */

        double horas = Double.parseDouble(JOptionPane.showInputDialog("Digite  a quantidade de horas trabalhadas: "));
        double valorh =  Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora trabalhada: "));
        double desc =  Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de desconto (10%, 15%...): "));
        int dep = Integer.parseInt(JOptionPane.showInputDialog("Digite  a quantidade de dependentes registrados: "));
        JOptionPane.showMessageDialog(null, "O valor do salário bruto é de: " + (horas * valorh));
        JOptionPane.showMessageDialog(null, "O valor do salário líquido é de: " + ((horas * valorh) * (1 - (desc / 100))));
        JOptionPane.showMessageDialog(null, "O valor do salário final é de: " + (((horas * valorh) * (1 - (desc / 100))) + (dep * 100)));
    }
}