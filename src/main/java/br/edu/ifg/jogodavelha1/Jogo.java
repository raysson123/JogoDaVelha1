package br.edu.ifg.jogodavelha1;

public class Jogo {

    public static void main(String[] args) {
        boolean finalizar = true;
        //primeiro escolhe o simbolo, o simbolo vai ser atribuído ao objeto depois.
        //É necessário informar qual tela se refere a qual jogador.
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        sortearQuemComeca(jogador1, jogador2);
        while (finalizar){
            partida(jogador1, jogador2);
        }
    }


    public static void partida(Jogador jogador1, Jogador jogador2){
        for(int i = 1; i < 10; i++){
            if(i % 2 != 0){
                jogador1.jogar();
            } else {
                jogador2.jogar();
            }
            verificarVitoria();
        }
    }

    public static void sortearQuemComeca(Jogador jogador1, Jogador jogador2){
        double n = (Math.random() * 10);
        if(n%2 == 0){
            //mostrar na tela que X é o jogador 1
            jogador1.setSimbolo(Simbolo.X);
            jogador2.setSimbolo(Simbolo.O);
        } else {
            //mostrar na tela que O é o jogador 1
            jogador1.setSimbolo(Simbolo.O);
            jogador2.setSimbolo(Simbolo.X);
        }
    }

    public static void verificarVitoria(){

    }
}
