package app;
import javax.swing.JOptionPane;

public class Lt01Ex23 {
    public static void main (String[] args){
        /*
            Obejtivo: Ordenar os quatros valores recebidos em ordem crescente
            Programador: Fábio Vilela Aragão
            Data: 17/01
        */

        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número, maior que o número anterior: "));
        float n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o terceiro número, maior que o número anterior: "));
        float n4 = Float.parseFloat(JOptionPane.showInputDialog("Digite o quarto valor: "));
        if (n1 > n2){
            JOptionPane.showMessageDialog(null, "primeiro valor maior que o segundo, por favor, reinicie o programa!");
        }
        
        else if (n3 < n2 || n3 < n1){
            JOptionPane.showMessageDialog(null, "terceiro valor maior que o segundo ou primeiro, por favor, reinicie o programa!");
        }
        
        else{
           
            if (n4 < n1){
                JOptionPane.showMessageDialog(null, +n4+" "+n1+" "+n2+" "+n3);
                } 

            else if(n4 < n2){ 
                JOptionPane.showMessageDialog(null, +n1+" "+n4+" "+n2+" "+n3);
                }

            else if (n4 < n3){
                JOptionPane.showMessageDialog(null, +n1+" "+n2+" "+n4+" "+n3);
                }

            else{
                JOptionPane.showMessageDialog(null, +n1+" "+n2+" "+n3+" "+n4);
                }
        }
   }
}



