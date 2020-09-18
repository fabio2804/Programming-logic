package app;
import javax.swing.JOptionPane;

public class Lt13Ex04 {
    public static void main (String args[]){

        /*
            Obejtivo: Mostrar a média das notas do grupo , notas abaixo da média e notas acima da média.
            Programador: Fábio Vilela Aragão
            Data: 30/01
        */
       
       float [] vet = new float [5];
       float media = 0;
       int acima = 0;
       
       for (int i = 0; i < 5; i++){
           vet[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a " + (i+1) + " nota do grupo:"));
           media += vet[i];
        }
       media /= 5;
       JOptionPane.showMessageDialog(null, "A média do grupo foi de: " + media);
       for (int i = 0; i < 5; i++){
           if (vet[i] > media){
               acima += 1;
           }
           else if (vet[i] < media){
               JOptionPane.showMessageDialog(null, "A nota da posição " + i + " está abaixo da média do grupo");
           }
       }
       JOptionPane.showMessageDialog(null, "A quantidade de notas do grupo acima da média foi de: " + acima);
    }
}
