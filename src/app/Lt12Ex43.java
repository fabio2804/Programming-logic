package app;

import javax.swing.JOptionPane;

public class Lt12Ex43 
{
    public static void main (String[] args)
    {
        /*
            Obejtivo: QUantos anos serão necessários para Ana seja maior que Maria
            Programador: Fábio Vilela Aragão
            Data: 20/01
        */
      
      float Ana = (float) 1.10, Maria = (float) 1.50;
      JOptionPane.showMessageDialog(null, "Demorará " + calculaAno(Ana, Maria) + " anos para Ana ser maior que Maria.");
    }
      
    public static float calculaAno(float Ana, float Maria)
    { 
        int ano = 0;
        while(Ana < Maria)
        {
            Ana += + 0.03;
            Maria += 0.02;
            ano += 1;
        }
        return ano;
    }
}