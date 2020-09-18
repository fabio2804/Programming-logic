package app;
import javax.swing.JOptionPane;

public class Lt12Ex19 
{
    public static void main (String[] args)
    {
        /*
            Objetivo: Mostrar o maior valor inputado.
            Programador: Fábio Vilela Aragão
            data: 20/01
        */
        int N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        int N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número: "));
        CalculaMaior(N1,N2);
     
    }


    public static void CalculaMaior(int N1, int N2)
    {
        
        if (N1 > N2)
        {
           JOptionPane.showMessageDialog(null, "O maior valor é igual a: "+N1);
        } 
        else
        {
           JOptionPane.showMessageDialog(null, "O maior valor é igual a: "+N2);
        }
    }
}
    

