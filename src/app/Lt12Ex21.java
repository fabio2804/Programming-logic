package app;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lt12Ex21 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular media de notas (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 20/01
        */
    
        float N1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota do aluno: "));
        float N2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota do aluno: "));
        float N3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota do aluno: "));
        float N4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Quarta nota do aluno: "));
        CalculaSituacao(N1, N2, N3, N4);
    }
        
    
    public static void CalculaSituacao(float N1, float N2, float N3, float N4){
        float media = (N1+N2+N3+N4) / 4;
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
    
  

