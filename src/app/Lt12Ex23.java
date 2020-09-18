package app;
import javax.swing.JOptionPane;

public class Lt12Ex23 
{
    public static void main (String[] args)
    {
        /*
            Obejtivo: Ordenar os quatros valores recebidos em ordem crescente (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 20/01
        */

        float N1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
        float N2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número, maior que o número anterior: "));
        float N3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o terceiro número, maior que o número anterior: "));
        float N4 = Float.parseFloat(JOptionPane.showInputDialog("Digite o quarto valor: "));
        sort(N1, N2, N3, N4);
    }
     
    public static void sort(float N1, float N2, float N3, float N4)
    {
        if (N1 > N2){
            JOptionPane.showMessageDialog(null, "primeiro valor maior que o segundo, por favor, reinicie o programa!");
        }
        else if (N3 < N2 || N3 < N1){
            JOptionPane.showMessageDialog(null, "terceiro valor maior que o segundo ou primeiro, por favor, reinicie o programa!");
       }
        else{
            if (N4 < N1){
                JOptionPane.showMessageDialog(null, +N4+"\n" +N1+ "\n" +N2+ "\n" +N3);
               } 
            else if(N4 < N2){ 
                JOptionPane.showMessageDialog(null, +N1+ "\n" +N4+ "\n" +N2+ "\n" +N3);
               }
            else if (N4 < N3){
                JOptionPane.showMessageDialog(null, +N1+ "\n" +N2+ "\n" +N4+ "\n" +N3);
               }
            else{
                JOptionPane.showMessageDialog(null, +N1+ "\n" +N2+ "\n" +N3+ "\n" +N4);
               }
           }
    }   
}





