package app;
import javax.swing.JOptionPane;

public class Lt13Ex08 
{
    public static void main (String args[])
    {

        /*
            Obejtivo: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
                    a.	A quantidade de cada produto vendido no mês;
                    b.	A quantidade de produtos vendidos por semana;
                    c.	O total de produtos vendidos no mês.
            Programador: Fábio Vilela Aragão
            Data: 30/01
        */
       
       int [][] matrix = new int[4][3];
       int i, j;
       int [] vet = new int[8];
      
       /* indice 0 = produtos vendidos na primeira semana
          indice 1 = produtos vendidos na segunda semana
          indice 2 = produtos vendidos na terceira semana
          indice 3 = produtos vendidos na quarta semana
          indice 4 = quantidade de shampoos do mes 
          indice 5 = quantidade de condicionadores do mes 
          indice 6 = quantidade total de produtos do mes
          indice 7 = quantidade de sabonetes no mes 
       
          i = semanas 
          j = produtos
        */
       
       for (i = 0; i < 4; i++)
       {
           for (j = 0; j < 3; j++)
           {
               if (j == 0)
               {
                   matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de sabonetes vendidos na " + (i+1) + "° semana: "));
                   vet[7] +=  matrix[i][j];
                   vet[6] += matrix[i][j];
               
               }
               else if (j == 1)
               {
                   matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de shampoos vendidos na " + (i+1) + "° semana: "));   
                   vet[4] += matrix[i][j];
                   vet[6] += matrix[i][j];
               }
               else
               {
                   matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de condicionadores vendidos na " + (i+1) + "° semana: "));
                   vet[5] += matrix[i][j];
                   vet[6] += matrix[i][j];
               }
               
               if (i == 0)
               {
                   vet[0] += matrix[i][j];
               }
               else if (i == 1)
               {
                   vet[1] += matrix[i][j];
               }
               else if (i == 2)
               {
                   vet[2] += matrix[i][j];
               }
               else
               {
                   vet[3] += matrix[i][j];
               }
           }
       }
       
       for (i = 0; i < 4; i++)
       {
           for (j = 0; j < 3; j++)
           {
               System.out.print(matrix[i][j] + "\t");
           }
           System.out.println("");
       }
       
        System.out.println("A quantidade de produtos vendidos na primeira semana foi de: " + vet[0]);
        System.out.println("A quantidade de produtos vendidos na segunda semana foi de: " + vet[1]);
        System.out.println("A quantidade de produtos vendidos na terceira semana foi de: " + vet[2]);
        System.out.println("A quantidade de produtos vendidos na quarta semana foi de: " + vet[3]);
        System.out.println("A quantidade de sabonetes vendidos no mês foi de: " + vet[7]);
        System.out.println("A quantidade de shampoos vendidos no mês foi de: " + vet[4]);
        System.out.println("A quantidade de condicionadores vendidos no mês foi de: " + vet[5]);        
        System.out.println("A quantidade total de produtos vendidos no mês foi de: " + vet[6]);
          
    }
}