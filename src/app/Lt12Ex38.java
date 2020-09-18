package app;
import javax.swing.JOptionPane;

public class Lt12Ex38
{
   public static void main (String[] args)
   {

        /*
            Obejtivo: Receber 100 valores, mostrar o maior e menor
            Programador: Fábio Vilela Aragão
            Data: 20/01
        */

        int n, i, maior = 0, menor = 0;
        for (i = 1; i <= 10; i++)
        {
           n = Integer.parseInt(JOptionPane.showInputDialog("Digite o : " + i + " número:"));
           maior = estatisticaMaior(n,i, maior);
           menor = estatisticaMenor(n,i, menor);
        } 
        JOptionPane.showMessageDialog(null, "O menor valor digitado foi: " + menor + "\n O maior valor digitado foi: " + maior);
   }   

   public static int estatisticaMaior(int n, int i, int maior)
   {     
        if (i == 1)
        {
            maior = n;
               
        }
        else if (n > maior)
        {
            maior = n;
        }
        
        return maior;
          
           
    }


    public static int estatisticaMenor(int n, int i, int menor)
   {      
        if (i == 1)
        {
            menor = n;
               
        }
        else if (n < menor)
        {
            menor = n;
        }
        
        return menor;
          
           
    }
      
      
}