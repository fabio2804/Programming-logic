package app;
import javax.swing.JOptionPane;

public class Lt01Ex38 {
    public static void main (String[] args){
      int n, i, n1 = 1, n2 = 1, fibo;
      boolean ver = false;
      n = 7;
      for (i = 1; i <= n; i++) {
        if (n < 3) ver = true; 
        
        if (i <= 2) JOptionPane.showMessageDialog(null, "O " + i + " termo é igual a: " + n1);
        
        else{
            fibo = (n1 + n2);
            n1 = n2;
            n2 = fibo;
            JOptionPane.showMessageDialog(null, "O " + i + " termo é igual a: " + fibo);
            if (n == fibo) ver = true; 
        }
      }
        
        if (ver) JOptionPane.showMessageDialog(null, "O número " + n + " faz parte da sequência");
	  
    }
}