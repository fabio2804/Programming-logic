package app;
import javax.swing.JOptionPane;

public class Lt12Ex31 
{
    public static void main (String[] args)
    {

        /*
            Obejtivo: Calcular quadrado dos numero entre 10 e 150
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */
        
        for (int i = 10; i <= 150 ;i++)
        { 
            JOptionPane.showMessageDialog(null, + i + " X " + i + " = " + CalculaQuadrado(i));
        }
    }

    public static int CalculaQuadrado(int i)
    {

        int result = (int) Math.pow(i, 2);
        return result;
    
    }
}

