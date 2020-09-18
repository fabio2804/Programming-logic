package app;
import javax.swing.JOptionPane;

public class Lt12Ex35 
{
    public static void main (final String args[])
    {

         /*
            Obejtivo: Soma dos numeros impares entre dois valores
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */
        
	int N1, N2;
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro diferente do anterior:"));
        int MAIOR = validaMaior(N1, N2);
        int MENOR = validaMenor(N1, N2);
        


        JOptionPane.showMessageDialog(null, "A somatória dos números ímpares entre " + MENOR + " e " + MAIOR + " é de: " + calculoSomatoria(N1, N2, MAIOR, MENOR));
        
    }

    public static int validaMaior(int n1, int n2)
    {
        int maior;
        if (n1 > n2)
        {
            maior = n1;
            return maior;
        }
        
        else
        {
            maior = n2;
            return maior;
        }
      
    }

    public static int validaMenor(final int n1, final int n2)
    {
        int menor;
        if (n1 > n2)
        {
            menor = n2;
            return menor;
        }
        
        else
        {
            menor = n1;
            return menor;
        }
      
    }

    public static int calculoSomatoria(int n1, int n2, int maior, int menor)
    {
      int soma = 0;
      for (int i = menor; i <= maior; i++) 
      {
          
          if (i % 2 != 0)
          {
            soma += i;
          }    
          
      }
      return soma;
    }
}