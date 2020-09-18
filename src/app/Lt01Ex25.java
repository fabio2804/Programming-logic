package app;
import javax.swing.JOptionPane;

public class Lt01Ex25 {
    public static void main (String[] args){
        /*
            Obejtivo: Calcular duração de jogo
            Programador: Fábio Vilela Aragão
            Data: 17/01
        */

        int MAUX, HT, MT, HAUX;
        HT = 0;
        MAUX = 0;
        HAUX = 0;
        MT = 0;
        int HI = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial da partida: "));
        int MI = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial da partida: "));
        int HF = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final da partida: "));
        int MF = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final da partida: "));
        
        if  (HI >= 24 || HF >= 24 || MI >= 60 || MF >= 60){
            JOptionPane.showMessageDialog(null, "Valor inválido! Digite um valor valido para horas e minutos");
        }
        else if (HF <= HI){
            HAUX = (24-HI);
            HT = (HAUX + HF);
        }
        else{
            HT = (HF -HI);
        }
        if (MAUX < 0){
            MT = (60 + MAUX);
            HT = (HT -1);
            JOptionPane.showMessageDialog(null, "A duração da partida foi de: "+ HT + " hora(s) e "+ MT + " minuto(s).");
        }
        else{
            MT = (MAUX);
            JOptionPane.showMessageDialog(null, "A duração da partida foi de: "+ HT + " hora(s) e "+ MT + " minuto(s).");
        }
        if (HT == 24 & MT == 0){
            JOptionPane.showMessageDialog(null, "A duração da partida tem que ser menor que 24 horas!");
        }
    }
}



