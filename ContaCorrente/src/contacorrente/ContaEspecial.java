package contacorrente;

public class ContaEspecial extends ContaCorrente {

    private float limite=10000;

    public ContaEspecial(String numeroConta, Pessoa titular) {
        super(numeroConta, titular);

    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}
