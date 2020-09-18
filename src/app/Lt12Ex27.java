package app;
import javax.swing.JOptionPane;

public class Lt12Ex27 {
    public static void main (String args[])
    {
        /*
            Obejtivo: Calcular velocidade média (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 20/01
        */

        float V = Integer.parseInt(JOptionPane.showInputDialog("Digite o números de voltas percorridas: "));
        float EXT = Float.parseFloat(JOptionPane.showInputDialog("Digite a extensão do circuito, em metros: "));
        float T = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração percorrida no percurso, em minutos: "));
        float VM = 0;

        calculo(VM, EXT, V, T);

        JOptionPane.showMessageDialog(null, "A velocidade média percorrida no trajeto foi de " + VM + " KM/H");
    }

    public static void calculo(float VM, float extencao, float voltas, float tempo)
    {
        VM = (float) (((extencao * 0.001) * voltas) / (tempo / 60));
    }
}