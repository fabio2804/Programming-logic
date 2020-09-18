package app;
import javax.swing.JOptionPane;

public class Lt01Ex15 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular o valor da hipotenusa de um triângulo
            Programador: Fábio Vilela Aragão
            Data: 15/01
        */

        int catO = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Cateto oposto do triângulo retângulo: "));
        int catA = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Cateto adjacente do triângulo retângulo: "));
        //   A chamada de função é pra calcular raíz quadrada "Math.sqrt()" e pra calcular potência "Math.pow" //
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é igual a: "+ Math.sqrt((Math.pow(catO, 2) + Math.pow(catA, 2))));
    }
}