package app;

import java.util.Random;
import javax.swing.JOptionPane;

public class Lt13Ex12{

    public static void main (String args[])
    {
         /*
            Obejtivo: Calcular e mostrar a soma das peças do tabuleiro.
            Programador: Fábio Vilela Aragão
            Data: 30/01
        */
        
        int [][] matrix = new int[7][7];
        int [] vet = new int [7];

        //instância um objeto da classe Random usando o construtor básico
        Random gerador = new Random();
        
        for (int i = 0; i < 7; i++)
        {
            for (int j = 0; j < 7; j++)
            {
                matrix[i][j] = gerador.nextInt(7)+1 ;
                System.out.print(matrix[i][j] + "\t");
                vet[ (matrix[i][j] - 1) ]  += 1;
            }
            System.out.println("");
        }
        JOptionPane.showMessageDialog(null, "A quantidade de peões do tabuleiro é de: " + vet[0]);
        JOptionPane.showMessageDialog(null, "A quantidade de torres do tabuleiro é de: " + vet[1]);
        JOptionPane.showMessageDialog(null, "A quantidade de bispos do tabuleiro é de: " + vet[2]);
        JOptionPane.showMessageDialog(null, "A quantidade de cavalos do tabuleiro é de: " + vet[3]);
        JOptionPane.showMessageDialog(null, "A quantidade de rainhas do tabuleiro é de: " + vet[4]);
        JOptionPane.showMessageDialog(null, "A quantidade de reis do tabuleiro é de: " + vet[5]);
        JOptionPane.showMessageDialog(null, "Sobraram " + vet[6] + " peças vazias");
       
    }
}