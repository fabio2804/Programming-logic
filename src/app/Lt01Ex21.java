package app;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lt01Ex21 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular media de notas
            Programador: Fábio Vilela Aragão
            Data: 17/01
        */

        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota do aluno: "));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota do aluno: "));
        float n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota do aluno: "));
        float n4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Quarta nota do aluno: "));
        float media = (n1+n2+n3+n4) / 4; 

        if (media >= 6){
            DecimalFormat df = new DecimalFormat("##.#");
            JOptionPane.showMessageDialog(null, "O aluno foi aprovado, com média "+df.format(media));
        } 
        else if (media >= 3) {
            DecimalFormat df = new DecimalFormat("##.#");
            JOptionPane.showMessageDialog(null, "O aluno está de exame, com média "+df.format(media));
        }
        else{
            DecimalFormat df = new DecimalFormat("##.#");
            JOptionPane.showMessageDialog(null, "O aluno foi reprovado, com média "+df.format(media));
        }
    }
}




