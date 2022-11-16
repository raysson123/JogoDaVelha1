package br.edu.ifg.jogodavelha1;

public class Placar {
    private int empates;
    private int vitoriasJogador1;
    private int vitoriasJogador2;

    public static Placar placar = new Placar(0,0,0);

    private Placar(int empates, int vitoriasJogador1, int vitoriasJogador2) {
        this.empates = empates;
        this.vitoriasJogador1 = vitoriasJogador1;
        this.vitoriasJogador2 = vitoriasJogador2;
    }

    public void zerarPlacar(){
        this.empates = 0;
        this.vitoriasJogador1 = 0;
        this.vitoriasJogador2 = 0;
    }


    public void setEmpates() {
        this.empates++;
    }

    public void setVitoriasJogador1() {
        this.vitoriasJogador1++;
    }

    public void setVitoriasJogador2() {
        this.vitoriasJogador2++;
    }

    public int resultadoJogo(){
        if(vitoriasJogador1 > vitoriasJogador2 && vitoriasJogador1 > empates){
            return 1; //jogador 1 venceu
        } else if (vitoriasJogador2 > vitoriasJogador1 && vitoriasJogador2 > empates){
            return 2; //jogador 2 venceu
        } else {
            return 0; //empate
        }
    }
}
