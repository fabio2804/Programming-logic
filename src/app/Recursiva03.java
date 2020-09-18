package app;

import javax.swing.JOptionPane;
public class Recursiva03
{
    public static void main (String [] args)
    {
        /*
            Objetivo: Calcular Série
            Programador: Fábio Vilela Aragão
            Data: 20/03
        */
        float n = Float.parseFloat(JOptionPane.showInputDialog("Digite um número para ser o limite da série: ")); 
        JOptionPane.showMessageDialog(null, calculaSerie(n));
    }

    public static float calculaSerie(float n)
    {
        float i = 1; 
        if (i == n)
        {
            return i ;
        }
        else
        {
            return i + (1 / calculaSerie(i+1)); 
        }
    }
}