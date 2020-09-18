package app;
import javax.swing.JOptionPane;

public class Lt13Ex02
 {
    public static void main (String args[]){
         /*
            Obejtivo: Mostrar o menor, maior e a média dos vetores.
            Programador: Fábio Vilela Aragão
            Data: 30/01
        */
        
        int [] vet = new int [5];
        int maior = 0, menor = 0;
        float media = 0;
        for (int i = 0; i < 5; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a " + (i+1) + " posição do vetor"));
            if ( i == 0 ){
                 maior = vet[i];
                 menor = vet[i];
            } 
            else if (vet[i] > maior){
                 maior = vet[i];
            }
            else if (vet[i] < menor){
                 menor = vet[i];
            }
            media += vet[i];
        }
        
        JOptionPane.showMessageDialog(null, "O menor valor do vetor foi: " + menor);
        JOptionPane.showMessageDialog(null, "O maior valor do vetor foi: " + maior);
        JOptionPane.showMessageDialog(null, "O valor da média dos vetores foi: " + (media/5));
        
    }
}
