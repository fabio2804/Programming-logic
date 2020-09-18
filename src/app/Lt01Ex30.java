/*package app;

import javax.swing.JOptionPane;

public class Lt01Ex30
{
    public static void main (String[] args)
    {   
        int diaA, mesA, anoA, diaN, mesN, anoN, dias = 0, meses = 0, ano = 0, auxdia = 0;
        
        diaN = Integer.parseInt(JOptionPane.showInputDialog("Digite o sua data de nascimento: "));
        mesN = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu mes de nascimento: "));
        anoN = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento: "));
        diaA = Integer.parseInt(JOptionPane.showInputDialog("Digite a data atual: "));
        mesA = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês atual: "));
        anoA = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));

        for (int i = anoN; i <= anoA; i++)
        {
             // Verificando existência de números bissextos // 
             if (i % 4 == 0)
             {
                 if (i % 100 != 0)
                 {
                     dias += 1;
                 }
             }
                 else
                 {
                     if (i % 400 ==0)
                     {
                         dias += 1;
                     }
                 }
            for (int j =1; j <= 12; j++)
            {
               
                // Adicionando quantidade de dias e meses de vida com base na quantidade de dias de cada mes //
                if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
                {
                    dias += 31;
                   auxdia += 1;
                }
                else if (j == 2)
                {
                    dias += 28;
                    auxdia += 1;
                }
                else
                {
                    dias += 30;
                    
                }
                meses += 1;
                if (dias == 365 || dias == 366)
                {
                    ano+=1;
                    dias = 0;
                }
                if (meses == 12)
                {
                    meses = 0;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Quantidade de anos = " + ano);
        JOptionPane.showMessageDialog(null, "Quantidade de dias = " + dias);
        JOptionPane.showMessageDialog(null, "Quantidade de meses = " + meses);
    }
    
}
*/