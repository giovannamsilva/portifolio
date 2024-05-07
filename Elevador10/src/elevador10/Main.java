
package elevador10;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
       Elevador elevador1;
        int qtdAndares = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de andares do prédio.", "AppElevador", 3));
        int capacidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a capacidade do elevador.", "AppElevador", 3));
        elevador1 = new Elevador(qtdAndares, capacidade);
        int opcaoUsr = 0;
        do {
            opcaoUsr = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Entrar no elevador \n2 - Sair do elevador \n3 - Subir elevador \n4 - Descer elevador \n5 - Informações do elevador \n6 - Fechar programa", "AppElevador", 1));
            if (opcaoUsr == 1) {
                int qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de pessoas que irão entrar no elevador.", "AppElevador", 3));
                if (qtd <= elevador1.getCapacidade()) {
                    if (elevador1.getQtdAtual() + qtd <= capacidade) {
                        elevador1.entra(qtd);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível " + qtd + " pessoas entrarem no elevador, pois a capacidade é de " + elevador1.getCapacidade() + " pessoa(s).", "AppElevador", 1);
                }
            }
            if (opcaoUsr == 2) {
                int qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de pessoas que irão sair do elevador.", "AppElevador", 3));
                if (qtd <= elevador1.getQtdAtual()) {
                    elevador1.sai(qtd);
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível " + qtd + " pessoas saírem do elevador, pois a quantidade atual no elevador são " + elevador1.getQtdAtual() + " pessoa(s).", "AppElevador", 1);
                }
            }

            if (opcaoUsr == 3) {
                int qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quatidade de andares que deseja subir.", "AppElevador", 3));
                if (qtd <= qtdAndares) {
                    if (qtd + elevador1.getAndarAtual() <= qtdAndares) {
                        elevador1.sobe(qtd);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível subir " + qtd + " andares, pois no prédio há apenas " + qtdAndares + ", e o elevador se encontra no andar " + elevador1.getAndarAtual() + ".", "AppElevador", 1);
                }
            }
            if (opcaoUsr == 4) {
                int qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quatidade de andares que deseja descer.", "AppElevador", 3));
                if (qtd <= qtdAndares) {
                    if (elevador1.getAndarAtual() - qtd >= 0) {
                        elevador1.desce(qtd);
                    } else {
                        JOptionPane.showMessageDialog(null, "Não é possível descer " + qtd + " andares, pois no prédio há apenas " + qtdAndares + ", e o elevador se encontra no andar " + elevador1.getAndarAtual() + ".", "AppElevador", 1);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível descer " + qtd + " andares, pois no prédio há apenas " + qtdAndares + ".", "AppElevador", 1);
                }
            }
            if (opcaoUsr == 5) {
                JOptionPane.showMessageDialog(null, elevador1.info(), "AppElevador", 3);
            }
        } while (opcaoUsr != 6);
    }
    
}
