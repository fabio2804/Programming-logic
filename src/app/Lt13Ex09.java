package app;
import javax.swing.JOptionPane;

public class Lt13Ex09 
{
    public static void main (String args[])
    {

         /*
            Obejtivo: Criar a diagonal do vetor de acordo com o padrão.
            Programador: Fábio Vilela Aragão
            Data: 30/01
        */
       
       int [][] matrix = new int [4][4];
       int diag = 1;
       
       for (int i = 0; i < 4; i++)
       {
           for (int j = 0; j < 4; j++)
           {
               if (i == j)
               {
                   matrix[i][j] = diag;
                   diag *= 4;
               }
               else
               {
                   matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a " + i + "° linha da " + j + " coluna:"  ));
               }
            }
           
       }
       for (int i = 0; i < 4; i++)
       {
           for (int j = 0; j < 4; j++)
           {
               System.out.print(matrix[i][j] + "\t");
           }
           System.out.println("");
       }
    }
}