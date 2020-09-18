package app;
import javax.swing.JOptionPane;

public class Lt12Ex34 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular tabuada
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */

        int N;
        int [] tabuada = new int [10];
        
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para realizar o cálculo de tabuada:"));
        
        tabuada = caculoTabuada(N);

        printarTabuada(tabuada, N);
        
    }

    public static int[] caculoTabuada(int n )
    {
        int [] tabu = new int [10];
        int i = 1;

        while ( i  <= 10) {

            tabu[i-1] = (n * i);

            i ++;
        }

        return tabu;
    }

    public static void printarTabuada(int [] tabu, int n)
    {
        for (int i = 1; i <= 10; i++)
        {
            JOptionPane.showMessageDialog(null, n + " X " + i + " = " + (tabu[i-1]));
        }
    }
}