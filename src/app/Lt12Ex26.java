package app;
import javax.swing.JOptionPane;

public class Lt12Ex26 {
    public static void main (String[] args){
        /*
            Obejtivo: Verificar se o maior é multiplo do menor (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 23/01
        */

        int maior = 0, menor = 0;
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial da partida: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial da partida: "));
        
        verificar(n1, n2, maior, menor);


    }

    public static void verificar(int n1, int n2, int maior, int menor)
    {
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



