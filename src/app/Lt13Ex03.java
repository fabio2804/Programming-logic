package app;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lt13Ex03 {
    public static void main (String args[]){
        
        /*
            Obejtivo: Concatenação de dois vetores em um terceiro vetor.
            Programador: Fábio Vilela Aragão
            Data: 30/01
        */
       
       int [] vet = new int [3];
       int [] vet2 = new int [3];
       int [] vet3 = new int [6];
       
       for (int i = 0; i < 3; i++){
           vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a " + (i+1) + "° posição do vetor 1:"));
           vet3[i] = vet[i];
           vet2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a " + (i+1) + "° posição do vetor 2:"));
           vet3[i+3] = vet2[i];
        }
           
       JOptionPane.showMessageDialog(null, "Vetor 3 \n" + (Arrays.toString(vet3)));
           
    }
}
