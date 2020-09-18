package app;
import javax.swing.JOptionPane;

public class Lt01Ex31 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular quadrado dos numero entre 10 e 150
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */
    
        for (int i = 10; i <= 50; i++){
          JOptionPane.showMessageDialog(null, +Math.pow(i,2));
      }
   }
}

