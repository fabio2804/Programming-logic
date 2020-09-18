package app;
import javax.swing.JOptionPane;

public class Lt12Ex18 {
    public static void main (String args[])
    {
        /*
            Obejtivo: Diferença entre valores (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 20/01
        */
        
        int N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        int N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número: "));

        int diferenca = 0;
        
        calculos(diferenca, N1, N2);
        
        JOptionPane.showMessageDialog(null, "A diferença do maior valor pelo menor é igual a: "+ diferenca);
    }

    public static void calculos(int diferenca, int n1, int n2)
    {

        if (n1 > n2)
        {
           diferenca = (n1 - n2);
        } 
        
        else
        {
            diferenca = (n2 - n1);
        }

    }
}