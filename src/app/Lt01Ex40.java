package app;

import javax.swing.JOptionPane;

public class Lt01Ex40 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular valores primos entre dois numeros
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */

        int n1, n2, maior, menor, i, j; 
        boolean primo1;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a verificação de primos existentes:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número para a verificação de números primos entre eles:"));
        if (n1 > n2){
            maior = n1;
            menor = n2;
        }
        else{
            maior = n2;
            menor = n1;
        }
        for (i = menor; i <= maior; i++){
            primo1 = true;
            if (i == 1){
                primo1 = false;
            }
            for(j = 2; j < i; j++){
                if (i == 1  || i % j == 0 ) {
                    primo1 = false;
                    break;
                }
                }
            if (primo1 == true){
            JOptionPane.showMessageDialog(null, + i + " é primo!");
            }
        }
    }
}