package app;

public class Lt01Ex41 {
    public static void main (String[] args){
        /*
            Obejtivo: Possibilidades dos dados somarem 7
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */
        
        int i, dado1 = 1, dado2 = 6;
        for (i = 1; i <= 6; i++){
          System.out.println( dado1 + " + " +  dado2 + " = 7" );
          dado1 += 1;
          dado2 -= 1;
        }
    }
}