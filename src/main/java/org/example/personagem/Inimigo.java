package org.example.personagem;

public class Inimigo {
    private String nome;
    private int vida;
    private int numeroSecreto;

    public Inimigo(String nome, int vida, int numeroSecreto){
        this.nome = nome;
        this.vida = vida;
        this.numeroSecreto = numeroSecreto;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public void setNumeroSecreto(int numeroSecreto) {
        this.numeroSecreto = numeroSecreto;
    }
}
