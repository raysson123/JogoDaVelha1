package br.edu.ifg.jogodavelha1;

public class Tabuleiro {
    private Integer [][]matriz = new Integer[3][3];

    private Tabuleiro() {
    }
    public static Tabuleiro tabuleiro = new Tabuleiro();


    public void setTabuleiro(Integer[][] matriz) {
        this.matriz = matriz;
    }

    public void setPosicaoTabuleiro(int linha, int coluna, int numero){
        this.matriz[linha][coluna] = numero;
    }

    public int getTabuleiro(int linha, int coluna) {
        return matriz[linha][coluna];
    }

    public void limparTabuleiro(){
        Integer [][]matriz = {{null, null, null}, {null, null, null}, {null, null, null}};
        setTabuleiro(matriz);
    }
}
