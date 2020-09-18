package app;

import javax.swing.JOptionPane;

public class Recursiva01
{
    public static void main (String[] args)
    {
        /*
            Objetivo: Calcular Reursividade
            Programador: Fábio Vilela Aragão
            Data: 20/03
        */
        int n = 1;
        JOptionPane.showMessageDialog(null, serieRecursiva(n));
    }

    public static int serieRecursiva(int n)
    {
        
        if (n == 100)
        {
            return n=100;
        }        
        else
        {
            return n + serieRecursiva(n+1);
        }
    }

}
