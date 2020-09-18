package app;
import javax.swing.JOptionPane;

public class Lt12Ex22 
{
    public static void main (String[] args)
    {
        /*
            Obejtivo: Mostrar valores em ordem crecente (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 20/01
        */

     	float N1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota do aluno: "));
     	float N2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota do aluno: "));
     	CalculaMaior(N1, N2);
    }

    public static void CalculaMaior(float N1, float N2)
    {
        if (N1 > N2)
        {
            JOptionPane.showMessageDialog(null, N2+" e "+N1);
        }
        else
        {
            JOptionPane.showMessageDialog(null, N1+" e "+N2);
        }

    }
}
