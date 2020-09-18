package app;

public class Lt13Ex11 
{
    public static void main (String args[])
    {

        /*
            Obejtivo: Criar uma matriz [8][8] inteiro e o programa irá carregar com os valores: 1, 2, 3, 4.
            Programador: Fábio Vilela Aragão
            Data: 30/01
        */
       
        int [][] matrix = new int [8][8];
       
       for (int k = 0; k < 4; k++)
       {
           for (int i = k; i < (8 - k); i++)
           {
               for (int j = k; j < (8 - k); j++)
               {
                  matrix[i][j] = (k + 1);
               }
            }
        }
       
        for (int i = 0; i < 8 ; i++)
       {
           for (int j = 0; j < 8; j++)
           {
               System.out.print(matrix[i][j] + "\t");
           }
           System.out.println("\n");
       }
        
    }
}