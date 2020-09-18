package app;

import java.text.DecimalFormat;

public class Lt12Ex45 {
    public static void main (String[] args)
    {

        /*
            Obejtivo: 1 - 2/4 + 3/9 - 4/16 + 5/25...
            Programador: Fábio Vilela Aragão
            Data: 20/01
        */
        
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println("O resultado da soma da série acima é de: " +df.format(calculaSerie()));

    }
      
    public static float calculaSerie()
    {
        float serie = 0, i;
        System.out.println("1\n");
        DecimalFormat b = new DecimalFormat("###");
        DecimalFormat df = new DecimalFormat("##.##");
       
        
        for (i = 1; i <= 15; i++)
        {
            if (i % 2 == 0)
            {
                serie -= (i/ (i*i));
                System.out.println("- " + b.format(i) + " / " + b.format(i * i) + " = " + df.format(i/ (i*i)));
            }
            else
            {
                serie += (i/ (i*i));
                System.out.println(b.format(i) + " / " + b.format(i * i) + " = " + df.format(i/ (i*i)));
            }
        }
        return serie;    
    }
}