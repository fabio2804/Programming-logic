package app;
import javax.swing.JOptionPane;

public class Lt12Ex37 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular asequencia de fibonacci (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 25/01
        */

        int n, n1 = 1, n2 = 1;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para limite da série de Fibonacci:"));

        int [] fibo = new int [n];
        

        fibo = calcSerie(n, n1, n2);

        printaSerie(fibo, n);

        
        }

    public static int [] calcSerie(int n, int n1, int n2)
    {
        int [] serie = new int [n];

        for (int i = 1; i <= n; i++){
            if (i <= 2){
                serie[i-1] = n1;
            }
            else{
                serie[i-1] = (n1 + n2);
                n1 = n2;
                n2 = serie[i-1];
            }
        }

        return serie;
    }

    public static void printaSerie(int [] fibo, int n)
    {

        for (int i = 1; i <= n; i++)
        {
            JOptionPane.showMessageDialog(null, "O " + i + " termo é igual a: " + fibo[i-1]);
        }
    }
}