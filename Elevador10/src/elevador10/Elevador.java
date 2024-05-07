
package elevador10;

public class Elevador {
   
    private int qtdAndares;
    private int capacidade;
    private int qtdAtual;
    private int andarAtual;

    public Elevador(int qtdAndares, int capacidade) {
        this.qtdAndares = qtdAndares;
        this.capacidade = capacidade;
        qtdAtual = 0;
        andarAtual = 0;
    }

    public int getQtdAndares() {
        return qtdAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void entra(int qtd) {
        qtdAtual = qtdAtual + qtd;
    }

    public void sai(int qtd) {
        qtdAtual = qtdAtual - qtd;
    }

    public void sobe(int qtd) {
        andarAtual = andarAtual + qtd;
    }

    public void desce(int qtd) {
        andarAtual = andarAtual - qtd;
    }

    public String info() {
        return "Andar atual: " + andarAtual +
                "\nTotal de andares no prédio: " + qtdAndares + 
                "\nCapacidade do elevador: " + capacidade +
                "\nPessoas presentes no elevador: " + qtdAtual;
    }
}
