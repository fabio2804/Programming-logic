package app;
import javax.swing.JOptionPane;

public class Lt01Ex43 {
    public static void main (String[] args){
        /*
            Obejtivo: QUantos anos serão necessários para Ana seja maior que Maria
            Programador: Fábio Vilela Aragão
            Data: 19/01
        */

        float Ana = (float) 1.10, Maria = (float) 1.50;
        int ano = 0;
        while(Ana < Maria){
            Ana += + 0.03;
            Maria += 0.02;
            ano += 1;
        }
        JOptionPane.showMessageDialog(null, "Demorará " + ano + " para Ana ser maior que Maria.");
    }
}