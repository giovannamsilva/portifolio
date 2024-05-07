
package figura;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Figura fig;
        String tipo[] ={"Círculo","Retângulo"};
        String escolhaUsr=(String)JOptionPane.showInputDialog(null,"Selecione o tipo de figura:","App",3,null,tipo,tipo[0]);
        if (escolhaUsr.equals(tipo[0])){
            fig=new Circulo(Double.parseDouble(JOptionPane.showInputDialog(null,"Forneça o valor para o raio","Figura Circulo",3)));
        }else{
            double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Forneça o valor para a altura","Figura Retangulo",3));
            double base = Double.parseDouble(JOptionPane.showInputDialog(null,"Forneça o valor para a base","Figura Retangulo",3));
            fig=new Retangulo(base, altura);
        }
        JOptionPane.showMessageDialog(null,fig.dados(),"App",1);
    }
    
}
