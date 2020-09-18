package app;
import java.math.BigInteger;

public class Lt01Ex39 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular a quantidade de grãos de arroz no tabuleiro
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */

        BigInteger qtd = new BigInteger("1");
        BigInteger qtdt = new BigInteger("0");
        BigInteger mult = new BigInteger("2");

        int i;
        for (i = 1; i <= 64; i++){

            qtd = qtd.multiply(mult);
            qtdt = qtdt.add(qtd);


            System.out.println("Casa:\n "+ i + "\t\t\t\t\t\t\t\tQuantidade:\n \t\t\t\t\t\t\t\t\t " + qtd);
        }

        System.out.println("A quantidade total de grãos contidos no tabuleriro de xadrez é de: " + qtdt + " grãos.");
    }  
}