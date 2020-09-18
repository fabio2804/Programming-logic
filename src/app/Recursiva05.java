package app;

import javax.swing.JOptionPane;

public class Recursiva05 
{
    public static float exercicio5(int num, float resultado) 
    {
         /*
            Objetivo: Calcular a Série
            Programador: Fábio Vilela Aragão
            Data: 20/03
        */
        
        if (num == 0){
            JOptionPane.showMessageDialog(null, resultado);
            return resultado;
        }
        
        num = fatorial(num);
        resultado += num;
        
        return exercicio5(num - 1, resultado);
    }

    public static int fatorial(int num) 
    {
        int f;
        if(num==1)
            return 1;
        else
        {
            f = num * fatorial(num-1);
            return f;
        }
    }
}