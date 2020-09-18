package app;
import javax.swing.JOptionPane;

public class Lt01Ex22 {
    public static void main (String[] args){
        /*
            Obejtivo: Mostrar valores em ordem crecente
            Programador: Fábio Vilela Aragão
            Data: 17/01
        */

        float N1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota do aluno: "));
        float N2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota do aluno: "));
        if (N1 > N2){
            JOptionPane.showMessageDialog(null, N2+" e "+N1);
        }
        else{
            JOptionPane.showMessageDialog(null, N1+" e "+N2);
        }
    }
}




