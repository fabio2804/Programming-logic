package app;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lt12Ex17 {
    public static void main (String args[])
    {
        /*
            Obejtivo: Calcular litros de combustivos gastos (modularizado)
            Programador: Fábio Vilela Aragão
            Data: 20/01
        */

        float T = Float.parseFloat(JOptionPane.showInputDialog("Digite o tempo em que o percurso foi realizado, em horas: "));
        float VM = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade média percorrido pelo automóvel, em KM/h: "));
        float dist = 0;  
        float L = 0;
        
        calculos(T, VM, dist, L);
        DecimalFormat df = new DecimalFormat("###.##");
        
        JOptionPane.showMessageDialog(null, "A distância percorrida na viagem foi de "+df.format(dist)+"KM, e a quantidade de litros gastos na viagem foi de: "+df.format(L)+" litros.");
       
    }

    public static void calculos(float T, float Vm, float distancia, float l)
    {
        distancia = (T * Vm);   
        l = (distancia/12);
    }
}