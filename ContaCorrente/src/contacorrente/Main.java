
package contacorrente;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        String opcoes[] = {"Abrir conta", "Dados da conta", "Consultar saldo", "Depositar", "Sacar", "Limite", "Encerrar"};
        String escolhaUsr=(String)JOptionPane.showInputDialog(null,"Selecione a operação desejada.","AppContaCorrente",3,null,opcoes,opcoes[0]);
        
        ContaCorrente corrente = null;
        Pessoa titular = null;
        ContaEspecial especial = null;
        
        if (escolhaUsr.equals(opcoes[0])){
            String nome = JOptionPane.showInputDialog(null, "Digite o seu nome", "AppContaCorrente", 3);
            String sobrenome = JOptionPane.showInputDialog(null, "Digite o seu sobrenome", "AppContaCorrente", 3);
            String cpf= JOptionPane.showInputDialog(null, "Digite o seu CPF", "AppContaCorrente",3);
            String numeroConta = JOptionPane.showInputDialog(null, "Digite o número da conta", "AppContaCorrente", 3);float limite= Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do seu limite", "AppContaCorrente",3));
            
            titular = new Pessoa(nome, sobrenome, cpf);
            corrente = new ContaCorrente(numeroConta, titular);
            especial = new ContaEspecial(numeroConta, titular);
            
        }else if(escolhaUsr.equals(opcoes[1])){
            JOptionPane.showMessageDialog(null, corrente.dados(), "AppContaCorrente", 1); 
            
        }else if(escolhaUsr.equals(opcoes[2])){
            JOptionPane.showMessageDialog(null, "\nSeu saldo é de R$" + corrente.getSaldo(), "AppContaCorrente", 1); 
            
        }else if(escolhaUsr.equals(opcoes[3])){
            float deposito = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor que você deseja depositar", "AppContaCorrente", 3));
            corrente.depositar(deposito);
            
        }else if(escolhaUsr.equals(opcoes[4])){
            float saque = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor que você deseja sacar", "AppContaCorrente", 3));
            corrente.sacar(saque);
            
        }else if(escolhaUsr.equals(opcoes[5])){
            JOptionPane.showMessageDialog(null, especial.getLimite() + "\nSeu limite é de R$" + especial.getLimite(), "AppContaCorrente", 1);
            
        }else{
            System.exit(0);
        }
    }
}
