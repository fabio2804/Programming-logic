package app;
import static java.lang.Float.parseFloat;
import javax.swing.JOptionPane;

public class Lt01Ex07 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular volume do paralelepípedo
            Programador: Fábio Vilela Aragão
            Data: 15/01
        */
        
        float comp = parseFloat(JOptionPane.showInputDialog("Digite o comprimento do paralelepípedo, em metros: ")); 
        float altura = parseFloat(JOptionPane.showInputDialog("Digite a altura do paralelepípedo, em metros: "));
        float larg = parseFloat(JOptionPane.showInputDialog("Digite o largura do paralelepípedo, em metros: "));
        JOptionPane.showMessageDialog(null, "O volume do paralelepipedo é igual a " + (comp * altura * larg) + " metros quadrados");
    }
}