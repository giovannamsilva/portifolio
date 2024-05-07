
import java.util.Random;

public class ValoresInteiros {

    private int matriz[][];

    public ValoresInteiros(int linhas, int colunas) {
        matriz = new int[3][3];
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
        
    public void armazena(int matriz[][]) {
      Random valor = new Random();

      for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[0].length; j++) {
              matriz[i][j] = valor.nextInt(50);
          }
      }
  }
         
 public String dados() {
      StringBuilder saida = new StringBuilder("\n");

      for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[0].length; j++) {
              saida.append(matriz[i][j]).append("\t");
          }
          saida.append("\n");
      }
      return saida.toString();
  }

  public String dados(int matriz[][]) {
      StringBuilder saida = new StringBuilder("\n");

      for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[0].length; j++) {
              saida.append(matriz[i][j]).append("\t");
          }
          saida.append("\n");
      }
      return saida.toString();
  }

  public String dados(int vetor[]) {
      StringBuilder info = new StringBuilder("Valores:\n");
      for (int valor : vetor) {
          info.append(valor).append("\t");
      }
      return info.toString();
  }
  
   public int[][] mediaLinhas() {
      int[][] retorno = new int[matriz.length][1];
      int soma = 0;
      for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[0].length; j++) {
              soma += matriz[i][j];
          }
          retorno[i][0] = soma;
          soma = soma/3;
      }
      return retorno;
  }
 
    public String trocarElementos() { //trocar primeira e última linha
      for (int i = 0; i < matriz.length; i++) {
          int temp = matriz[0][i];
          matriz[0][i] = matriz[matriz.length - 1][i];
          matriz[matriz.length - 1][i] = temp;
      }
      return dados();
  }

}
