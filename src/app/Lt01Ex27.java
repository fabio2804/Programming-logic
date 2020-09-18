package app;
import javax.swing.JOptionPane;

public class Lt01Ex27 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular velocidade média
            Programador: Fábio Vilela Aragão
            Data: 17/01
        */

        float v = Integer.parseInt(JOptionPane.showInputDialog("Digite o números de voltas percorridas: "));
        float ext = Float.parseFloat(JOptionPane.showInputDialog("Digite a extensão do circuito, em metros: "));
        float t = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração percorrida no percurso, em minutos: "));
        float vm = (float) (((ext*0.001)*v)/(t/60));
        JOptionPane.showMessageDialog(null, "A velocidade média percorrida no trajeto foi de " + vm + " KM/H");
     
    }
}



