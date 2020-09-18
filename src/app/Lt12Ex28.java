package app;
import javax.swing.JOptionPane;

public class Lt12Ex28 {
    public static void main (String[] args){
        /*
            Obejtivo: Recalcular preço do produto (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 23/01
        */

        float pv = 0, pa = 0, mm = 0;

        calcular(pa, mm, pv);
        

     }

     public static void calcular(float pa, float mm, float pv)
     {
        pa = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
        mm = Float.parseFloat(JOptionPane.showInputDialog("Digite a média mensal do produto: "));
        if (mm < 500 & pa < 30){
            pv = (float) (pa * 1.1); 
            JOptionPane.showMessageDialog(null, "Novo preço igual a: "+pv);
        }
        else if (30 <= pa & pa < 80 & 500 <= mm & mm < 1000){
            pv = (float) (pa * 1.15);
            JOptionPane.showMessageDialog(null, "Novo preço igual a: "+pv);
        }
        else if (mm >= 1000 & pa >= 80){
            pv = (float) (pa * 0.95);
            JOptionPane.showMessageDialog(null, "Novo preço igual a: "+pv);
        }
        else{
            pv = pa;
            JOptionPane.showMessageDialog(null, "Novo preço igual a: "+pv);
        }
     }
}


