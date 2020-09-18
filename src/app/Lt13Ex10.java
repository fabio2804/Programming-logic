package app;

public class Lt13Ex10 
{
    public static void main (String args[])
    {
        /*
            Obejtivo: Criar uma matriz [8][8] onde, o valor das casas é uma progressão geométrica.
            Programador: Fábio Vilela Aragão
            Data: 30/01
        */
        
 

       int [][] matrix = new int [8][8];
       int i,j,aux = 0;
       
       for (i = 0; i < 8; i ++){
           for (j = 0; j < 8; j++){
               matrix[i][j] = (int) Math.pow(2, aux);
               aux += 1;
               System.out.print(matrix[i][j] + "\t");
           }
           System.out.println("");
       }
    }
}