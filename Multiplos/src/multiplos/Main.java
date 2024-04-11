package multiplos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int numA = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número:", "Múltiplos", 3));
        int numB = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número:", "Múltiplos", 3));
        
        Multiplos multiplos = new Multiplos();
        
         JOptionPane.showMessageDialog(null,
                "\nNúmeros inseridos: "+multiplos.ordemCrescente(numA, numB)+
                "\n"+multiplos.saoMultiplos(numA, numB),
                "Múltiplos",-1);
         
         System.exit(0);
    }

}
