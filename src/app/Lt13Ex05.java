package app;

import java.util.Random;
import javax.swing.JOptionPane;

public class Lt13Ex05
{
    public static void main (String[] args) {
        /*
            Obejtivo: Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
            10
            ∑ (A[1] – A[21–1])
            i = 1

            Programador: Fábio Vilela Aragão
            Data: 30/01
        */
       
        int[] A = new int[20];
        int soma = 0;

        Random gerador = new Random();

        for (int i = 0; i < 20; i++)
        {
            A[i] = gerador.nextInt(100) + 1;   
        }

        for (int i = 0; i < 10; i++)
        {
            soma += (A[i] - A[20  - (i+1)]);
        }

        JOptionPane.showMessageDialog(null, "O valor da soma da equação é igual a: " + soma);
    }
}
