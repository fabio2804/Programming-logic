package app;
import javax.swing.JOptionPane;

public class Lt13Ex01 {
    public static void main (String args[]){
        /*
            Obejtivo: Mostrar a média dos valores entre 10 e 200 do vetor e mostrar a soma dos números ímpares.
            Programador: Fábio Vilela Aragão
            Data: 30/01
        */
        
        int [] vet = new int [50];
        float media = 0;
        int somaImpar = 0;
        
        for (int i = 0; i <= 50; i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a " + (i+1) + "° posição do vetor:"));
            if ((vet[i] >= 10) & (vet[i] <= 200)){
                media += vet[i];
            }
            if (vet[i] % 2 !=0){
                somaImpar += vet[i];
            }
            
        }

        JOptionPane.showMessageDialog(null, "A média entre os valores 10 e 200 do vetor é igual a: " + (media/50));
        JOptionPane.showMessageDialog(null, "A soma dos números ímpares do vetor é igual a: " +somaImpar);

    }
}