package app;
import javax.swing.JOptionPane;

public class Lt12Ex32 
{
    public static void main (String[] args)
    {

        /*
            Obejtivo: Calcular fatorial
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */
        
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o calculo fatorial:"));
        JOptionPane.showMessageDialog(null, "Fatorial de " + N + " é igual a: " + calculaFat(N));
    }

    public static int calculaFat(int N)
    {
        int fat = 1; 
        
        for (int i = N; i >= 2; i--)
        {
            fat *= i;
        }

        return fat;
    } 
}