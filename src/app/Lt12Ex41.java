package app;

public class Lt12Ex41 {
    public static void main (String[] args){
        /*
            Obejtivo: Possibilidades dos dados somarem 7 (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 25/01
        */
        
        int [][] dados = new int [6][2];

        dados = geraDados();

        printaDados(dados);
        
    }

    public static int [][] geraDados() 
    {
        int [][] dado = new int[6][2];

        for (int i = 1; i <= 6; i++){

            dado[i-1][0] = i;
            dado[i-1][1] = (7 - i);
        }

        return dado;
    }

    public static void printaDados(int [][] dados)
    {
        for (int i = 0; i <= 5; i++){

            System.out.println( dados[i][0] + " + " +  dados[i][1] + " = 7" );
        }
    }

}