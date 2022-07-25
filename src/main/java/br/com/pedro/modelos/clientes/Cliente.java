package br.com.pedro.modelos.clientes;

public abstract class Cliente {
    private String nome;
    private int id;

    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
}
