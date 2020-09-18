package app;
import javax.swing.JOptionPane;

public class Lt01Ex35 {
    public static void main (String[] args){
        /*
            Obejtivo: Soma dos numeros impares entre dois valores
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */

        int i, soma = 0, N1, N2, MAIOR, MENOR;
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro diferente do anterior:"));
        
        if (N1>N2){
            MAIOR = N1;
            MENOR = N2;
        }

        else{
            MAIOR = N2;
            MENOR = N1;
        }

        for (i = MENOR; i <= MAIOR; i++) {
            if (i % 2 != 0){
            soma += i;
            }    
        }
        JOptionPane.showMessageDialog(null, "A somatória dos números ímpares entre " + MENOR + " e " + MAIOR + " é de: " + soma );
        
  }
}