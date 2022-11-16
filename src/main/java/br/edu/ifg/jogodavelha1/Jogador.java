package br.edu.ifg.jogodavelha1;

public class Jogador {
    private Simbolo simbolo;

    public Jogador() {
    }

    public Jogador(Simbolo simbolo) {
        this.simbolo = simbolo;
    }

    public Simbolo getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(Simbolo simbolo) {
        this.simbolo = simbolo;
    }

    public void selecionarPosicao(Tabuleiro tabuleiro, int linha, int coluna){
        if(tabuleiro.getTabuleiro(linha, coluna) == 0){
            jogar(tabuleiro, linha, coluna);
        }
    }

    public void jogar(){
    }
}
