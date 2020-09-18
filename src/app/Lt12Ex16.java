package app;
import javax.swing.JOptionPane;

public class Lt12Ex16 {
    public static void main (String args[])
    {
        /*
            Obejtivo: Calcular salário (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 20/01
        */

        int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite  a quantidade de horas trabalhadas: "));
        int VH =  Integer.parseInt(JOptionPane.showInputDialog("Digite o valor por hora trabalhada: "));
        double desc =  Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de desconto: "));
        int depend = Integer.parseInt(JOptionPane.showInputDialog("Digite  a quantidade de dependentes registrados: "));

        double salarioBruto = 0;
        double salarioLiquido = 0;
        double salarioFinal = 0;
        
        calculoSalarioBruto(salarioBruto, horas, VH);
        calculoSalarioLiquido(salarioLiquido, desc, horas, VH);
        calculoSalarioFinal(salarioFinal, desc, horas, VH, depend);

        JOptionPane.showMessageDialog(null, "O valor do salário bruto é de: " + salarioBruto);
        JOptionPane.showMessageDialog(null, "O valor do salário líquido é de: " + salarioLiquido);
        JOptionPane.showMessageDialog(null, "O valor do salário final é de: " + salarioFinal);
    }

    public static void calculoSalarioBruto(double salarioBruto, int horas, int VH)
    {
        
        salarioBruto = (horas * VH);
    }

    public static void calculoSalarioLiquido(double salarioLiquido, double desc, int horas, int VH)
    {

        salarioLiquido = ((100 - desc) / 100)*(horas * VH);
    }

    public static void calculoSalarioFinal(double salarioFinal, double desc, int horas, int VH, int depend)
    {

        salarioFinal = ((((100 - desc) / 100) * (horas * VH) + (depend * 100)));
    }
}