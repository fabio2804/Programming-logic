package app;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lt12Ex20 
{
    public static void main (String[] args)
    {
        /*
            Obejtivo: Verificar se existem raizes (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 20/01
        */

     float a = Float.parseFloat(JOptionPane.showInputDialog("Digite o coeficiente de A da equação de segundo grau: "));
     float b = Float.parseFloat(JOptionPane.showInputDialog("Digite o coeficiente de B da equação de segundo grau: "));
     float c = Float.parseFloat(JOptionPane.showInputDialog("Digite o coeficiente de C da equação de segundo grau: "));
     
     int d = 0;
     
     CalculaDelta(d, a, b, c);
     CalculaRaiz(a,b,c,d);
     
    }
    
    public static void CalculaDelta(int d, float a, float b, float c)    
    {
        d = (int) (Math.pow(b, 2) - (4 * a * c));
    }
    
    public static void CalculaRaiz(float a, float b, float c, float d){
        
        if (d < 0)
        {
            JOptionPane.showMessageDialog(null, "A equação não possui raízes reais, tente outros coeficientes!");
        } 
        else if (d == 0)
        {
            float raiz = -b / (2*a);
            DecimalFormat df = new DecimalFormat("##.##");
            JOptionPane.showMessageDialog(null, "A equação possui uma raíz real: "+df.format(raiz));
        }
        else
        {
            double raiz1 = (-b + Math.sqrt(d))/ (2*a);
            double raiz2 = (-b - Math.sqrt(d))/ (2*a);
            DecimalFormat df = new DecimalFormat("##.##");
            JOptionPane.showMessageDialog(null, "A equação possui duas raízes reais: "+df.format(raiz1)+ " e "+df.format(raiz2));
        }

    }
    
}




