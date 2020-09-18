package app;

import javax.swing.JOptionPane;

public class Lt12Ex40 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular valores primos entre dois numeros (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 25/01
        */

        int n1, n2;
        int valores [] = new int [2]; 
        boolean primo1 = true;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a verificação de primos existentes:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número para a verificação de números primos entre eles:"));
        
        valores = calcValores(n1,n2);

        printaValores(n1, n2, primo1, valores);

    }

    public static int [] calcValores(int n1, int n2)
    {
        int [] dados = new int [2]; // 0 - maior. 1 - menor

        if (n1 > n2){
            dados[0] = n1;
            dados[1] = n2;
        }
        else{
            dados[0] = n2;
            dados[1] = n1;
        }

        return dados;
    
    }

    public static void printaValores(int n1, int n2, boolean primo1, int [] valores)
    {
        for (int i = valores[1]; i <= valores[0]; i++){
            primo1 = true;
            if (i == 1){
                primo1 = false;
            }
            for(int j = 2; j < i; j++){
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