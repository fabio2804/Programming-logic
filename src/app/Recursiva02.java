package app;

import javax.swing.JOptionPane;

public class Recursiva02
{
    public static void main (String[] args) 
    {
        /*
            Objetivo: Calcular Série
            Programador: Fábio Vilela Aragão
            Data: 20/03
        */
        int n = Integer.parseInt(JOptionPane.showInputDialog( "Digite um número para ser o limite da sua serie: "));
        JOptionPane.showMessageDialog(null, calculaSerie(n));
    }

    public static int calculaSerie(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else
        {
            return n + calculaSerie(n -1);
        }
    }
}