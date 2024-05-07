package contacorrente;

public class ContaCorrente {

    private String numeroConta;
    private Pessoa titular;
    private float saldo;
    
    public ContaCorrente(String numeroConta, Pessoa titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public String sacar(float valor) {
        if (saldo < valor) {
            return "Saldo insuficiente!";
        } else {
            saldo -= valor;
            return "Saque realizado com sucesso! Seu saldo atual é de R$"+saldo;
        }
    }
    
    public String dados() {
        return "Nome do titular: " + titular.nomeCompleto() 
                + "\nNúmero da conta: " + numeroConta 
                + "\nSaldo disponível: " + saldo;
    }
}
