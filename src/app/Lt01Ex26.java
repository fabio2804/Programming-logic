package app;
import javax.swing.JOptionPane;

public class Lt01Ex26 {
    public static void main (String[] args){
        /*
            Obejtivo: Verificar se o maior é multiplo do menor
            Programador: Fábio Vilela Aragão
            Data: 17/01
        */

        int maior, menor;
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial da partida: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial da partida: "));
        
        if (n1> n2){
            maior = n1;
            menor = n2;
        }
        else{
            maior = n2;
            menor = n1;
        }
        if (maior % menor == 0){
            JOptionPane.showMessageDialog(null, "O número " + maior + " é multiplo de " + menor + "!");
        }
        else{
            JOptionPane.showMessageDialog(null, "O número " + maior + " não é multiplo de " + menor + "!");
        }
    }
}



