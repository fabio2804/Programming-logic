package app;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lt01Ex17 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular os litros de combustível gastos
            Programador: Fábio Vilela Aragão
            Data: 17/01
        */

        float t = Float.parseFloat(JOptionPane.showInputDialog("Digite o tempo em que o percurso foi realizado, em horas: "));
        float vm = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade média percorrido pelo automóvel, em KM/h: "));
        float dist = (t * vm);   
        float l = (dist / 12);
        DecimalFormat df = new DecimalFormat("###.##");
        JOptionPane.showMessageDialog(null, "A distância percorrida na viagem foi de " + df.format(dist) + "KM, e a quantidade de litros gastos na viagem foi de: " + df.format(l) + " litros.");
    }
}