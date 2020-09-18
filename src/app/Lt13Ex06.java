package app;
import javax.swing.JOptionPane;

public class Lt13Ex06 {
    public static void main (String args [])
    {

        /*
            Obejtivo: Classificar vetor em ordem crescente.
            Programador: Fábio Vilela Aragão
            Data: 30/01
        */
        
        JOptionPane.showMessageDialog(null, "Booble Sort");
                
        int vet[] = new int [5];
        int aux;

        for (int i = 0; i <= 4; i++)
        {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Atribua um valor a "+(i+1)+"ª posição do vetor"));
        }

        for (int i = 0; i <= 3; i++)
        {
        for (int j = i+1; j <= 4; j++)
        {
            if (vet[i] > vet[j])
            {
                aux = vet[i];
                vet[i] = vet[j];
                vet[j] = aux;
            }
        }
        }

        for (int i = 0; i <= 4; i++)
        {
            JOptionPane.showMessageDialog(null,"A "+(i+1)+"ª posição do vetor possui o valor "+(vet[i]));
        }
    }
}