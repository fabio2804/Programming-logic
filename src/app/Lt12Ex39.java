package app;
import java.math.BigInteger;

public class Lt12Ex39 {
    public static void main (String[] args)
    {
        /*
            Obejtivo: Calcular a quantidade de grãos de arroz no tabuleiro
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */

        BigInteger qtd = new BigInteger("1");
        BigInteger qtdt = new BigInteger("0");
        BigInteger mult = new BigInteger("2");

        for (int i = 1; i <= 64; i++){
            
            System.out.println("Casa:\n "+ i + "\t\t\t\t\t\t\t\tQuantidade:\n \t\t\t\t\t\t\t\t\t " + qtd );
            qtd = calculaGraos(qtd, qtdt, mult);
            qtdt = calculaGraosTotal(qtd, qtdt);
        }

        System.out.println("A quantidade total de grãos contidos no tabuleriro de xadrez é de: " + qtdt + " grãos.");
    }  



    public static BigInteger calculaGraos(BigInteger qtd, BigInteger qtdt, BigInteger mult)
    {
        qtd = qtd.multiply(mult);
        
        
        return qtd;

    }

    public static BigInteger calculaGraosTotal(BigInteger qtd, BigInteger qtdt)
    {
        qtdt = qtdt.add(qtd);
        return qtdt;
    }

}