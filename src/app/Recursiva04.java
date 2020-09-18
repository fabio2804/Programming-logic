package app;

import javax.swing.JOptionPane;

public class Recursiva04 
{
    public static float exercicio4(float num, float resultado, int contador) 
    {
        /*
            Objetivo: Calcular a Série
            Programador: Fábio Vilela Aragão
            Data: 20/03
        */
        
        if (num == 0)
        {
            JOptionPane.showMessageDialog(null, resultado);
            return resultado;
        }
        
        resultado += (num / contador);
        
        return exercicio4(num - 1, resultado, contador + 1);
    }
}