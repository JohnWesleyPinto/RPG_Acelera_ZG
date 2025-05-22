package org.example.personagem;

import org.example.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private String nome;
    private int vida;
    private List<Item> inventario;

    public Personagem(String nome, int vida){
        this.nome = nome;
        this.vida = vida;
        this.inventario = new ArrayList<>();

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

    public List<Item> getInventario() {
        return inventario;
    }
    public void addItem(Item item){
        inventario.add(item);
    }
}
