package app;

import java.text.DecimalFormat;

public class Lt12Ex42 
{
    public static void main (String[] args)
    {
        /*
            Obejtivo: Calcular a série, 1 + 2/3 + 3/5...
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */
        
        DecimalFormat b = new DecimalFormat("##.##");
        System.out.println("O resultado da série foi de : " +b.format(calculaSerie()));
    }
    
    public static float calculaSerie()
    {
        float serie = 0, denominador = -1, i;
      
            for (i = 1; i <= 50; i++)
            {
                denominador += 2;
                DecimalFormat a = new DecimalFormat("##");
                System.out.println(a.format(i) + "/" +a.format(denominador));
                serie += (i/denominador);
            }
            
        return serie;
        
    }
}